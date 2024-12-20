package Modelo;

import java.beans.Statement;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aberr
 */
public class MascotaDb extends Mascotas {

    //agrego la base
    private conexion Base;
    private String idMascotaActual = "";

    public String getIdMascotaActual() {
        return idMascotaActual;
    }

    public void setIdMascotaActual(String idMascotaActual) {
        this.idMascotaActual = idMascotaActual;
    }

    //constructor con la base
    public MascotaDb(conexion Base) {
        this.Base = Base;
    }

    //constructor con atributos
    public MascotaDb(String ID, String NOMBRE, String ESPECIE, String RAZA, String CEDULA_DUENO, Date FECHANACIMIENTO) {
        super(ID, NOMBRE, ESPECIE, RAZA, CEDULA_DUENO, FECHANACIMIENTO);
    }

    public MascotaDb(String NOMBRE, String ESPECIE, String RAZA, String CEDULA_DUENO, Date FECHANACIMIENTO) {
        super(NOMBRE, ESPECIE, RAZA, CEDULA_DUENO, FECHANACIMIENTO);
    }

    public boolean insertar(String NOMBRE, String ESPECIE, String RAZA, String CEDULA_DUENO, Date FECHANACIMIENTO) {
        // Verificar si la mascota ya existe
        if (verificarMascota(NOMBRE, CEDULA_DUENO)) {
            JOptionPane.showMessageDialog(null, "La Mascota con nombre: " + NOMBRE + " y Dueño: " + CEDULA_DUENO + " ya existe en la base de datos.");
            return false; // No se pudo insertar porque ya existe
        }

        // Consulta SQL para insertar datos
        String sqlInsert = "INSERT INTO  MASCOTA (NOMBRE, ESPECIE, RAZA, CEDULA_DUENO, FECHANACIMIENTO) "
                + "VALUES (INITCAP(?), INITCAP(?), INITCAP(?), ?, ?)";
        String sqlLastId = "SELECT MAX(ID) AS ID FROM  MASCOTA"; // Obtener el último ID insertado

        try (Connection connection = Base.conectarBD();
                PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert)) {

            // Establecer los parámetros de la consulta
            preparedStatement.setString(1, NOMBRE);
            preparedStatement.setString(2, ESPECIE);
            preparedStatement.setString(3, RAZA);
            preparedStatement.setString(4, obtenerIdDeString(CEDULA_DUENO));

            // Convertir FECHANACIMIENTO a java.sql.Date y asignarlo
            java.sql.Date sqlDate = new java.sql.Date(FECHANACIMIENTO.getTime());
            preparedStatement.setDate(5, sqlDate);

            // Ejecutar la consulta de inserción
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                // Consulta para obtener el último ID insertado
                try (PreparedStatement psLastId = connection.prepareStatement(sqlLastId);
                        ResultSet rs = psLastId.executeQuery()) {
                    if (rs.next()) {
                        int idMascota = rs.getInt("ID");
                        JOptionPane.showMessageDialog(null, "Mascota agregada exitosamente");
                        return true; // Inserción exitosa
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar la mascota.");
                return false; // Inserción fallida
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar la mascota: " + e.getMessage());
            e.printStackTrace();
            return false; // Error al ejecutar la consulta
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
            e.printStackTrace();
            return false; // Otro error inesperado
        }
        return false;
    }

    // Método auxiliar para verificar si una fecha es válida
    private boolean esFechaValida(String fecha) {
        // Definir el formato esperado: "YYYY-MM-DD"
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false); // No permitir fechas no estrictas como "2023-02-30"

        try {
            dateFormat.parse(fecha); // Intentar parsear la fecha
            return true; // Si no lanza excepción, es válida
        } catch (ParseException e) {
            return false; // Si ocurre una excepción, la fecha no es válida
        }
    }

    //verificarMascota
    public boolean verificarMascota(String NOMBRE, String CEDULA_DUENO) {
        String sql = "SELECT COUNT(*) FROM  MASCOTA WHERE NOMBRE = INITCAP(?) AND CEDULA_DUENO = ?";

        try (Connection connection = Base.conectarBD();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            // Establecer los parámetros de la consulta
            preparedStatement.setString(1, NOMBRE);
            preparedStatement.setString(2, CEDULA_DUENO);

            // Ejecutar la consulta
            ResultSet resultSet = preparedStatement.executeQuery();

            // Verificar si se encontró algún registro
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;  // Si count > 0, significa que ya existe 
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al verificar la mascota.");
            e.printStackTrace();
        }

        // Si no se encontró ninguna coincidencia, retornar false
        return false;
    }

    public void llenarComboBoxDueños(JComboBox<String> comboBox) {
        // Consulta SQL para obtener el ID, nombre y apellido de los dueños
        String sql = "SELECT CEDULA, INITCAP(NOMBRE) || ' ' || INITCAP(APELLIDO) AS NOMBRE_COMPLETO FROM DUENO";

        try (Connection connection = Base.conectarBD();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery()) {

            // Limpiar el comboBox antes de llenarlo
            comboBox.removeAllItems();

            boolean hayDueños = false;

            // Procesar resultados
            while (resultSet.next()) {
                hayDueños = true;
                String cedulaDueño = resultSet.getString("CEDULA");  // Obtener la cédula como String
                String nombreCompleto = resultSet.getString("NOMBRE_COMPLETO");  // Obtener el nombre completo

                // Concatenar cédula al inicio del nombre completo
                String itemComboBox = cedulaDueño + " " + nombreCompleto;

                //System.out.println("Dueño encontrado: " + itemComboBox);

                // Agregar el item al ComboBox
                comboBox.addItem(itemComboBox);
            }

            if (!hayDueños) {
                System.out.println("No se encontraron dueños.");
                comboBox.addItem("No hay dueños");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al llenar el comboBox: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public String obtenerIdDeString(String texto) {
        // Verificar si el texto contiene un espacio
        int espacioIndex = texto.indexOf(" ");

        // Si se encuentra un espacio, devolver todo lo que está antes de ese espacio
        if (espacioIndex != -1) {
            return texto.substring(0, espacioIndex);
        } else {
            // Si no se encuentra un espacio, devolver el texto completo
            return texto;
        }
    }

    public void llenarComboBoxMascotasPorDueño(JComboBox<String> comboBox, String CEDULA) {
        // Consulta SQL para obtener las mascotas usando la cédula del dueño
        String sqlMascotas = "SELECT INITCAP(NOMBRE) AS NOMBRE_MASCOTA FROM  MASCOTA WHERE CEDULA_DUENO = ?";

        try (Connection connection = Base.conectarBD();
                PreparedStatement preparedStatementMascotas = connection.prepareStatement(sqlMascotas)) {

            // Establecer el parámetro de la consulta para las mascotas
            preparedStatementMascotas.setString(1, obtenerIdDeString(CEDULA));

            try (ResultSet resultSetMascotas = preparedStatementMascotas.executeQuery()) {
                // Limpiar el comboBox antes de llenarlo
                comboBox.removeAllItems();

                boolean hayMascotas = false; // Variable para verificar si hay mascotas

                // Llenar el comboBox con los resultados
                while (resultSetMascotas.next()) {
                    hayMascotas = true; // Si entra aquí, hay mascotas
                    String nombreMascota = resultSetMascotas.getString("NOMBRE_MASCOTA");
                    //System.out.println(nombreMascota);
                    comboBox.addItem(nombreMascota);
                }

                // Si no hay mascotas, agregar el mensaje "No hay mascotas"
                if (!hayMascotas) {
                    comboBox.addItem("No hay mascotas");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al llenar el comboBox: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
//    public void obtenerIdMascotaPorCedulaYNombre(String cedulaDueno, String nombreMascota) {
//        // Consulta SQL para obtener el ID de la mascota usando la cédula del dueño y el nombre de la mascota
//        String sql = "SELECT ID FROM  MASCOTA WHERE CEDULA_DUENO = ? AND INITCAP(NOMBRE) = ?";
//
//        try (Connection connection = Base.conectarBD();
//                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//
//            // Establecer los parámetros de la consulta
//            preparedStatement.setString(1, obtenerIdDeString(cedulaDueno));
//            preparedStatement.setString(2, nombreMascota);
//
//            try (ResultSet resultSet = preparedStatement.executeQuery()) {
//                if (resultSet.next()) {
//                    // Si encontramos la mascota, obtenemos el ID
//                    String idMascota = resultSet.getString("ID");
//
//                    System.out.println("ID de la mascota: " + idMascota);
//                    idMascotaActual = idMascota;
//                    nombreMascotaActual = nombreMascota;
//                    ceduladuenoActual = obtenerIdDeString(cedulaDueno);
//
//                    // Realizar alguna acción adicional con el ID si es necesario
//                } else {
//                    // Si no se encuentra la mascota, imprimir un mensaje
//                    System.out.println("Mascota no encontrada.");
//                }
//            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error al obtener el ID de la mascota: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
    
    
    
    public boolean obtenerIdMascotaPorCedulaYNombre(String cedulaDueno, String nombreMascota) {
    // Primero, verificar si la cédula del dueño existe en la tabla DUENO
    if (!existeCedulaEnDueno(cedulaDueno)) {
        System.out.println("La cédula del dueño no existe.");
        return false; // Retornar false si la cédula no existe
    }

    // Consulta SQL para obtener el ID de la mascota usando la cédula del dueño y el nombre de la mascota
    String sql = "SELECT ID FROM MASCOTA WHERE CEDULA_DUENO = ? AND INITCAP(NOMBRE) = ?";

    try (Connection connection = Base.conectarBD();
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

        // Establecer los parámetros de la consulta
        preparedStatement.setString(1, obtenerIdDeString(cedulaDueno));
        preparedStatement.setString(2, nombreMascota);

        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                // Si encontramos la mascota, obtenemos el ID
                String idMascota = resultSet.getString("ID");

                System.out.println("ID de la mascota: " + idMascota);
                idMascotaActual = idMascota;
                nombreMascotaActual = nombreMascota;
                ceduladuenoActual = obtenerIdDeString(cedulaDueno);

                // Retornar true si se encuentra la mascota
                return true;
            } else {
                // Si no se encuentra la mascota, imprimir un mensaje
                System.out.println("Mascota no encontrada.");
                return false; // Retornar false si no se encuentra
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener el ID de la mascota: " + e.getMessage());
        e.printStackTrace();
        return false; // Retornar false en caso de error
    }
}

// Método adicional para verificar si la cédula existe en la tabla DUENO
private boolean existeCedulaEnDueno(String cedulaDueno) {
    String sql = "SELECT COUNT(*) FROM DUENO WHERE CEDULA = ?";

    try (Connection connection = Base.conectarBD();
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

        // Establecer el parámetro de la consulta
        preparedStatement.setString(1, obtenerIdDeString(cedulaDueno));

        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0; // Retornar true si hay al menos un registro
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al verificar la cédula del dueño: " + e.getMessage());
        e.printStackTrace();
    }
    return false; // Retornar false en caso de error o si no se encuentra
}






    public String obtenerNombreMascotaPorId() {
        // Consulta SQL para obtener el nombre de la mascota usando el ID
        String sql = "SELECT INITCAP(NOMBRE) AS NOMBRE_MASCOTA FROM  MASCOTA WHERE ID = ?";

        try (Connection connection = Base.conectarBD();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            // Establecer el parámetro de la consulta
            preparedStatement.setString(1, idMascotaActual);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    // Si encontramos la mascota, obtenemos el nombre
                    String nombreMascota = resultSet.getString("NOMBRE_MASCOTA");
                    return nombreMascota; // Devolver el nombre de la mascota
                } else {
                    // Si no se encuentra la mascota, retornar un mensaje o valor nulo
                    System.out.println("Mascota no encontrada.");
                    return null; // O "Mascota no encontrada", si prefieres
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el nombre de la mascota: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public String obtenerEspecieMascotaPorId() {
        // Consulta SQL para obtener la especie de la mascota usando el ID
        String sql = "SELECT INITCAP(ESPECIE) AS ESPECIE_MASCOTA FROM  MASCOTA WHERE ID = ?";

        try (Connection connection = Base.conectarBD();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            // Establecer el parámetro de la consulta
            preparedStatement.setString(1, idMascotaActual);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    // Si encontramos la mascota, obtenemos la especie
                    String especieMascota = resultSet.getString("ESPECIE_MASCOTA");
                    return especieMascota; // Devolver la especie de la mascota
                } else {
                    // Si no se encuentra la mascota, retornar un mensaje o valor nulo
                    System.out.println("Mascota no encontrada.");
                    return null; // O "Mascota no encontrada", si prefieres
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la especie de la mascota: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public String obtenerRazaMascotaPorId() {
        // Consulta SQL para obtener la raza de la mascota usando el ID
        String sql = "SELECT INITCAP(RAZA) AS RAZA_MASCOTA FROM  MASCOTA WHERE ID = ?";

        try (Connection connection = Base.conectarBD();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            // Establecer el parámetro de la consulta
            preparedStatement.setString(1, idMascotaActual);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    // Si encontramos la mascota, obtenemos la raza
                    String razaMascota = resultSet.getString("RAZA_MASCOTA");
                    return razaMascota; // Devolver la raza de la mascota
                } else {
                    // Si no se encuentra la mascota, retornar un mensaje o valor nulo
                    System.out.println("Mascota no encontrada.");
                    return null; // O "Mascota no encontrada", si prefieres
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la raza de la mascota: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public Date obtenerFechaNacimientoMascotaPorId() {
        // Consulta SQL para obtener la fecha de nacimiento de la mascota usando el ID
        String sql = "SELECT FECHANACIMIENTO FROM  MASCOTA WHERE ID = ?";

        try (Connection connection = Base.conectarBD();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            // Establecer el parámetro de la consulta
            preparedStatement.setString(1, idMascotaActual);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    // Si encontramos la mascota, obtenemos la fecha de nacimiento
                    Date fechaNacimiento = resultSet.getDate("FECHANACIMIENTO");
                    return fechaNacimiento; // Devolver la fecha de nacimiento
                } else {
                    // Si no se encuentra la mascota, retornar un valor nulo
                    System.out.println("Mascota no encontrada.");
                    return null; // O puedes retornar una fecha por defecto si prefieres
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la fecha de nacimiento de la mascota: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public boolean eliminarMascotaPorId() {
        // Consulta SQL para eliminar la mascota usando el ID
        String sql = "DELETE FROM  MASCOTA WHERE ID = ?";
        System.out.println("Eliminar id: " + idMascotaActual);
        try (Connection connection = Base.conectarBD();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            // Establecer el parámetro de la consulta (ID de la mascota)
            preparedStatement.setString(1, idMascotaActual);

            // Ejecutar la actualización (eliminación)
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                // Si se eliminó alguna fila, la mascota fue eliminada correctamente
                System.out.println("Mascota eliminada con éxito.");
                return true;
            } else {
                // Si no se eliminó ninguna fila, la mascota no fue encontrada
                System.out.println("No se encontró una mascota con ese ID.");
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la mascota: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public void obtenerIdMascotayEliminar(String cedulaDueno, String nombreMascota) {
        String idMascotaEliminar = null;

        // Consulta SQL para obtener el ID de la mascota
        String sqlSelect = "SELECT ID FROM  MASCOTA WHERE CEDULA_DUENO = ? AND INITCAP(NOMBRE) = ?";
        // Consulta SQL para eliminar la mascota usando el ID
        String sqlDelete = "DELETE FROM MASCOTA WHERE ID = ?";

        try (Connection connection = Base.conectarBD()) {
            // Primer bloque: Obtener el ID de la mascota
            try (PreparedStatement preparedStatement = connection.prepareStatement(sqlSelect)) {
                preparedStatement.setString(1, obtenerIdDeString(cedulaDueno));
                preparedStatement.setString(2, nombreMascota);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        idMascotaEliminar = resultSet.getString("ID");
                        System.out.println("ID de la mascota: " + idMascotaEliminar);
                    } else {
                        JOptionPane.showMessageDialog(null, "Mascota no encontrada.");
                        return; // Sale del método si no encuentra la mascota
                    }
                }
            }

            // Segundo bloque: Eliminar la mascota usando el ID obtenido
            try (PreparedStatement preparedStatement = connection.prepareStatement(sqlDelete)) {
                preparedStatement.setString(1, idMascotaEliminar);

                int filasAfectadas = preparedStatement.executeUpdate();
                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null, "Mascota eliminada con éxito.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró una mascota con ese ID.");
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la operación: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private String ceduladuenoActual;
    private String nombreMascotaActual;

    public String quieroId(String cedulaDueno, String nombreMascota) {
        // Consulta SQL para obtener el ID de la mascota usando la cédula del dueño y el nombre de la mascota
        String sql = "SELECT ID FROM  MASCOTA WHERE CEDULA_DUENO = ? AND INITCAP(NOMBRE) = ?";

        // Variable para almacenar el ID de la mascota
        String idMascota = null;

        try (Connection connection = Base.conectarBD();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            // Establecer los parámetros de la consulta
            preparedStatement.setString(1, obtenerIdDeString(cedulaDueno));
            preparedStatement.setString(2, nombreMascota);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    // Si encontramos la mascota, obtenemos el ID
                    idMascota = resultSet.getString("ID");

                    // Almacenar los valores actuales (si es necesario para otro propósito)
                    idMascotaActual = idMascota;
                    nombreMascotaActual = nombreMascota;
                    ceduladuenoActual = obtenerIdDeString(cedulaDueno);
                } else {
                    // Si no se encuentra la mascota, manejar el caso aquí si es necesario
                    System.out.println("Mascota no encontrada.");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el ID de la mascota: " + e.getMessage());
            e.printStackTrace();
        }

        // Retornar el ID de la mascota encontrado, o null si no se encuentra
        return idMascota;
    }

    public boolean actualizarMascota(String idMascota, String cedulaDueño, String nombre, String especie, String raza, Date fecha) {
        // Tomar solo la parte antes del primer espacio en cedulaDueño
        String cedulaSolo = cedulaDueño.split(" ")[0];

        // Aplicar InitCap a los datos
        String nombreInitCap = aplicarInitCap(nombre);
        String especieInitCap = aplicarInitCap(especie);
        String razaInitCap = aplicarInitCap(raza);

        // Consulta SQL para actualizar los datos de la mascota con el ID proporcionado
        String actualizarSql = "UPDATE MASCOTA SET CEDULA_DUENO = ?, NOMBRE = ?, ESPECIE = ?, RAZA = ?, FECHANACIMIENTO = ? WHERE ID = ?";

        try (Connection connection = Base.conectarBD();
                PreparedStatement actualizarStatement = connection.prepareStatement(actualizarSql)) {

            // Establecer los parámetros en el PreparedStatement
            actualizarStatement.setString(1, cedulaSolo);       // Asignar la cédula procesada
            actualizarStatement.setString(2, nombreInitCap);    // Asignar el nombre con InitCap
            actualizarStatement.setString(3, especieInitCap);   // Asignar la especie con InitCap
            actualizarStatement.setString(4, razaInitCap);      // Asignar la raza con InitCap

            // Convertir el objeto java.util.Date a java.sql.Date
            java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
            actualizarStatement.setDate(5, sqlDate);            // Asignar la fecha

            actualizarStatement.setString(6, idMascota);       // Usar el ID de la mascota proporcionado

            // Ejecutar la actualización
            int filasActualizadas = actualizarStatement.executeUpdate();

            // Retornar true si al menos una fila fue actualizada
            return filasActualizadas > 0;

        } catch (SQLException e) {
            // Manejo de excepciones
            System.err.println("Error al actualizar la mascota: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    private String aplicarInitCap(String texto) {
        if (texto == null || texto.isEmpty()) {
            return texto;
        }
        return texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase();
    }

    public void cargarDatosEnTabla(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("ESPECIE");
        modelo.addColumn("RAZA");
        modelo.addColumn("CEDULA_DUENO");
        modelo.addColumn("FECHANACIMIENTO");

        Connection connection = Base.conectarBD();
        String query = "SELECT ID, NOMBRE, ESPECIE, RAZA, CEDULA_DUENO, FECHANACIMIENTO FROM MASCOTA";

        try {
            java.sql.Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Object[] fila = new Object[6];
                fila[0] = resultSet.getInt("ID");
                fila[1] = resultSet.getString("NOMBRE");
                fila[2] = resultSet.getString("ESPECIE");
                fila[3] = resultSet.getString("RAZA");
                fila[4] = resultSet.getString("CEDULA_DUENO");
                fila[5] = resultSet.getDate("FECHANACIMIENTO");
                modelo.addRow(fila);
            }

            tabla.setModel(modelo);
        } catch (SQLException e) {
            System.out.println("Error al cargar los datos en la tabla.");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    public void mostrarMascotasYDueno(JTable tabla) {
    Connection connection = Base.conectarBD();
    if (connection == null) {
        System.out.println("No se pudo establecer la conexión a la base de datos.");
        return; // Salir del método si no hay conexión
    }

    // Consulta SQL para obtener los dueños, sus cédulas y sus mascotas
    String query = "SELECT D.NOMBRE || ' ' || D.APELLIDO AS NOMBRE_DUENO, " +
                   "D.CEDULA AS CEDULA_DUENO, " +
                   "M.NOMBRE AS NOMBRE_MASCOTA, " +
                   "M.ID AS ID_MASCOTA " +
                   "FROM DUENO D " +
                   "JOIN MASCOTA M ON UPPER(TRIM(M.CEDULA_DUENO)) = UPPER(TRIM(D.CEDULA)) " +
                   "ORDER BY D.NOMBRE, D.APELLIDO";

    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Dueño");
    model.addColumn("Cédula Dueño");
    model.addColumn("Mascota");
    model.addColumn("ID Mascota");

    try {
        java.sql.Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        int rowCount = 0;
        while (resultSet.next()) {
            rowCount++;
            String nombreDueno = resultSet.getString("NOMBRE_DUENO"); // Obtener el nombre del dueño
            String cedulaDueno = resultSet.getString("CEDULA_DUENO"); // Obtener la cédula del dueño
            String nombreMascota = resultSet.getString("NOMBRE_MASCOTA");
            int idMascota = resultSet.getInt("ID_MASCOTA");

            model.addRow(new Object[]{nombreDueno, cedulaDueno, nombreMascota, idMascota});
        }
        //System.out.println("Número de filas recuperadas: " + rowCount);

        // Asignar el modelo a la tabla
        tabla.setModel(model);
    } catch (SQLException e) {
        System.out.println("Error al ejecutar la consulta.");
        e.printStackTrace();
    } finally {
        try {
            if (connection != null) {
                connection.close(); // Cerrar la conexión
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión.");
            e.printStackTrace();
        }
    }
}
    
    public void filtrarMascotasPorCedula(JTable tabla, String prefijoCedula) {
    Connection connection = Base.conectarBD();
    if (connection == null) {
        System.out.println("No se pudo establecer la conexión a la base de datos.");
        return; // Salir del método si no hay conexión
    }

    // Consulta SQL para obtener los dueños, sus cédulas y sus mascotas filtrando por el prefijo de la cédula
    String query = "SELECT D.NOMBRE || ' ' || D.APELLIDO AS NOMBRE_DUENO, " +
                   "D.CEDULA AS CEDULA_DUENO, " +
                   "M.NOMBRE AS NOMBRE_MASCOTA, " +
                   "M.ID AS ID_MASCOTA " +
                   "FROM DUENO D " +
                   "JOIN MASCOTA M ON UPPER(TRIM(M.CEDULA_DUENO)) = UPPER(TRIM(D.CEDULA)) " +
                   "WHERE D.CEDULA LIKE ? " + // Filtrar por cédula
                   "ORDER BY D.NOMBRE, D.APELLIDO";

    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Dueño");
    model.addColumn("Cédula Dueño");
    model.addColumn("Mascota");
    model.addColumn("ID Mascota");

    try {
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, prefijoCedula + "%"); // Establecer el prefijo con el comodín

        ResultSet resultSet = preparedStatement.executeQuery();

        int rowCount = 0;
        while (resultSet.next()) {
            rowCount++;
            String nombreDueno = resultSet.getString("NOMBRE_DUENO"); // Obtener el nombre del dueño
            String cedulaDueno = resultSet.getString("CEDULA_DUENO"); // Obtener la cédula del dueño
            String nombreMascota = resultSet.getString("NOMBRE_MASCOTA");
            int idMascota = resultSet.getInt("ID_MASCOTA");

            model.addRow(new Object[]{nombreDueno, cedulaDueno, nombreMascota, idMascota});
        }

        // Verificar si se encontraron filas
        if (rowCount == 0) {
            JOptionPane.showMessageDialog(null, "No se encontraron resultados para la cédula: " + prefijoCedula);
            // Limpiar el modelo de la tabla si no hay resultados
            model.setRowCount(0); // Asegurarse de que el modelo esté vacío
        } else {
            System.out.println("Número de filas recuperadas: " + rowCount);
        }

        // Asignar el modelo a la tabla
        tabla.setModel(model);
    } catch (SQLException e) {
        System.out.println("Error al ejecutar la consulta.");
        e.printStackTrace();
    } finally {
        try {
            if (connection != null) {
                connection.close(); // Cerrar la conexión
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión.");
            e.printStackTrace();
        }
    }
}
    
    
    
    public boolean verificarExistenciaCedulaEnDueno(String cedulaDueno) {
    // Consulta SQL para verificar si la cédula existe en la tabla DUENO
    String sql = "SELECT COUNT(*) FROM DUENO WHERE CEDULA = ?";

    try (Connection connection = Base.conectarBD();
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

        // Establecer el parámetro de la consulta
        preparedStatement.setString(1, obtenerIdDeString(cedulaDueno));

        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0; // Retornar true si hay al menos un registro
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al verificar la cédula del dueño: " + e.getMessage());
        e.printStackTrace();
    }
    return false; // Retornar false en caso de error o si no se encuentra
}

}
