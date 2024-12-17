package Modelo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author aberr
 */
public class MascotaDb extends Mascotas {

    //agrego la base
    private conexion Base;
    private  String idMascotaActual="";

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
    public MascotaDb(String ID, String NOMBRE, String ESPECIE, String RAZA, String CEDULA_DUEÑO, Date FECHANACIMIENTO) {
        super(ID, NOMBRE, ESPECIE, RAZA, CEDULA_DUEÑO, FECHANACIMIENTO);
    }

    public MascotaDb(String NOMBRE, String ESPECIE, String RAZA, String CEDULA_DUEÑO, Date FECHANACIMIENTO) {
        super(NOMBRE, ESPECIE, RAZA, CEDULA_DUEÑO, FECHANACIMIENTO);
    }

    public boolean insertar(String NOMBRE, String ESPECIE, String RAZA, String CEDULA_DUEÑO, Date FECHANACIMIENTO) {
        // Verificar si la mascota ya existe
        if (verificarMascota(NOMBRE, CEDULA_DUEÑO)) {
            JOptionPane.showMessageDialog(null, "La Mascota con nombre: " + NOMBRE + " y Dueño: " + CEDULA_DUEÑO + " ya existe en la base de datos.");
            return false; // No se pudo insertar porque ya existe
        }

        // Consulta SQL para insertar datos
        String sqlInsert = "INSERT INTO MASCOTA (NOMBRE, ESPECIE, RAZA, CEDULA_DUEÑO, FECHANACIMIENTO) "
                + "VALUES (INITCAP(?), INITCAP(?), INITCAP(?), ?, ?)";
        String sqlLastId = "SELECT MAX(ID) AS ID FROM MASCOTA"; // Obtener el último ID insertado

        try (Connection connection = Base.conectarBD();
                PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert)) {

            // Establecer los parámetros de la consulta
            preparedStatement.setString(1, NOMBRE);
            preparedStatement.setString(2, ESPECIE);
            preparedStatement.setString(3, RAZA);
            preparedStatement.setString(4, obtenerIdDeString(CEDULA_DUEÑO));

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
                        JOptionPane.showMessageDialog(null, "Mascota agregada exitosamente. ID asignado: " + idMascota);
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
    public boolean verificarMascota(String NOMBRE, String CEDULA_DUEÑO) {
        String sql = "SELECT COUNT(*) FROM MASCOTA WHERE NOMBRE = INITCAP(?) AND CEDULA_DUEÑO = ?";

        try (Connection connection = Base.conectarBD();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            // Establecer los parámetros de la consulta
            preparedStatement.setString(1, NOMBRE);
            preparedStatement.setString(2, CEDULA_DUEÑO);

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
        String sql = "SELECT CEDULA, INITCAP(NOMBRE) || ' ' || INITCAP(APELLIDO) AS NOMBRE_COMPLETO FROM BaseU4COPY.DUEÑO";

        try (Connection connection = Base.conectarBD();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery()) {

            // Limpiar el comboBox antes de llenarlo
            comboBox.removeAllItems();

            boolean hayDueños = false;

            // Procesar resultados
            while (resultSet.next()) {
                hayDueños = true;
                int cedulaDueño = resultSet.getInt("CEDULA");  // Obtener el ID del dueño
                String nombreCompleto = resultSet.getString("NOMBRE_COMPLETO");  // Obtener el nombre completo

                // Concatenar cedula al inicio del nombre completo
                String itemComboBox = cedulaDueño + " " + nombreCompleto;

                System.out.println("Dueño encontrado: " + itemComboBox);

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
    String sqlMascotas = "SELECT INITCAP(NOMBRE) AS NOMBRE_MASCOTA FROM BASEU4COPY.MASCOTA WHERE CEDULA_DUEÑO = ?";

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
                System.out.println(nombreMascota);
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
    
    
        
        
        
//        public void mostrarNombreYApellidoDueños() {
//    // Consulta SQL para obtener el nombre y apellido de todos los dueños
//    String sql = "SELECT INITCAP(NOMBRE) AS NOMBRE, INITCAP(APELLIDO) AS APELLIDO FROM BASEU4COPY.DUEÑO";
//
//    try (Connection connection = Base.conectarBD();
//         PreparedStatement preparedStatement = connection.prepareStatement(sql);
//         ResultSet resultSet = preparedStatement.executeQuery()) {
//
//        // Mostrar un mensaje en consola indicando que la conexión fue exitosa
//        System.out.println("Conexión exitosa. Ejecutando consulta...");
//
//        // Procesar los resultados de la consulta
//        while (resultSet.next()) {
//            // Obtener el nombre y apellido del dueño
//            String nombre = resultSet.getString("NOMBRE");
//            String apellido = resultSet.getString("APELLIDO");
//
//            // Imprimir los datos de cada dueño en la consola
//            System.out.println("Nombre: " + nombre + ", Apellido: " + apellido);
//        }
//
//    } catch (SQLException e) {
//        // Si hay un error, mostrarlo en la consola
//        System.out.println("Error al obtener los datos de los dueños.");
//        e.printStackTrace();
//    }
//}

    
    
    
    
    
    
        public void obtenerIdMascotaPorCedulaYNombre(String cedulaDueño, String nombreMascota) {
        // Consulta SQL para obtener el ID de la mascota usando la cédula del dueño y el nombre de la mascota
        String sql = "SELECT ID FROM BASEU4COPY.MASCOTA WHERE CEDULA_DUEÑO = ? AND INITCAP(NOMBRE) = ?";

        try (Connection connection = Base.conectarBD();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            // Establecer los parámetros de la consulta
            preparedStatement.setString(1, obtenerIdDeString(cedulaDueño));
            preparedStatement.setString(2, nombreMascota);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    // Si encontramos la mascota, obtenemos el ID
                    String idMascota = resultSet.getString("ID");
                    System.out.println("ID de la mascota: " + idMascota);
                    idMascotaActual=idMascota;
                    // Realizar alguna acción adicional con el ID si es necesario
                } else {
                    // Si no se encuentra la mascota, imprimir un mensaje
                    System.out.println("Mascota no encontrada.");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el ID de la mascota: " + e.getMessage());
            e.printStackTrace();
        }
    }
        
        
        

    public String obtenerNombreMascotaPorId() {
        // Consulta SQL para obtener el nombre de la mascota usando el ID
        String sql = "SELECT INITCAP(NOMBRE) AS NOMBRE_MASCOTA FROM BASEU4COPY.MASCOTA WHERE ID = ?";

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
        String sql = "SELECT INITCAP(ESPECIE) AS ESPECIE_MASCOTA FROM BASEU4COPY.MASCOTA WHERE ID = ?";

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
        String sql = "SELECT INITCAP(RAZA) AS RAZA_MASCOTA FROM BASEU4COPY.MASCOTA WHERE ID = ?";

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
        String sql = "SELECT FECHANACIMIENTO FROM BASEU4COPY.MASCOTA WHERE ID = ?";

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
        String sql = "DELETE FROM BASEU4COPY.MASCOTA WHERE ID = ?";
        System.out.println("Eliminar id: "+idMascotaActual);
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
    
    
    
    public void obtenerIdMascotayEliminar(String cedulaDueño, String nombreMascota) {
    String idMascotaEliminar = null;

    // Consulta SQL para obtener el ID de la mascota
    String sqlSelect = "SELECT ID FROM BASEU4COPY.MASCOTA WHERE CEDULA_DUEÑO = ? AND INITCAP(NOMBRE) = ?";
    // Consulta SQL para eliminar la mascota usando el ID
    String sqlDelete = "DELETE FROM BASEU4COPY.MASCOTA WHERE ID = ?";

    try (Connection connection = Base.conectarBD()) {
        // Primer bloque: Obtener el ID de la mascota
        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlSelect)) {
            preparedStatement.setString(1, obtenerIdDeString(cedulaDueño));
            preparedStatement.setString(2, nombreMascota);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    idMascotaEliminar = resultSet.getString("ID");
                    System.out.println("ID de la mascota: " + idMascotaEliminar);
                } else {
                    System.out.println("Mascota no encontrada.");
                    return; // Sale del método si no encuentra la mascota
                }
            }
        }

        // Segundo bloque: Eliminar la mascota usando el ID obtenido
        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlDelete)) {
            preparedStatement.setString(1, idMascotaEliminar);

            int filasAfectadas = preparedStatement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Mascota eliminada con éxito.");
            } else {
                System.out.println("No se encontró una mascota con ese ID.");
            }
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error en la operación: " + e.getMessage());
        e.printStackTrace();
    }
}
    
    
    
    

}
