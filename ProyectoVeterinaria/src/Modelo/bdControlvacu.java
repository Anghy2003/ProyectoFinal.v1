package Modelo;

import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import rojeru_san.RSMTextFull;

public class bdControlvacu extends Control_Vacunas {

    private conexion Base;

    public bdControlvacu() {
    }

    public bdControlvacu(conexion Base) {
        this.Base = Base;
    }

    public bdControlvacu(String ID, int DOSIS, Date FECHA, String ID_VACUNA, String ID_MASCOTA) {
        super(ID, DOSIS, FECHA, ID_VACUNA, ID_MASCOTA);
    }

    public bdControlvacu(int DOSIS, Date FECHA, String ID_VACUNA, String ID_MASCOTA) {
        super(DOSIS, FECHA, ID_VACUNA, ID_MASCOTA);
    }

  

    

    public void INSERTAR(int DOSIS, Date FECHA, String ID_VACUNA, String ID_MASCOTA) {
        String SQL = "INSERT INTO CONTROLVACUNA (DOSIS, FECHA, ID_VACUNA, ID_MASCOTA) VALUES (?, ?, ?, ?)";

        try (Connection CONNECTION = Base.conectar();
                PreparedStatement datosisrt = CONNECTION.prepareStatement(SQL)) {
            // Convertir la fecha a SQL Date
            java.sql.Date SQL_FECHA = new java.sql.Date(FECHA.getTime());

            // Setear los valores
            datosisrt.setInt(1, DOSIS);
            datosisrt.setDate(2, SQL_FECHA);
            datosisrt.setString(3, ID_VACUNA);
            datosisrt.setString(4, ID_MASCOTA);

            // Ejecutar la consulta de inserción
            int ROWS_AFFECTED = datosisrt.executeUpdate();
            if (ROWS_AFFECTED > 0) {
                JOptionPane.showMessageDialog(null, "CONTROL DE VACUNA AGREGADO EXITOSAMENTE");
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR EL CONTROL DE LA VACUNA");
            }
        } catch (SQLException E) {
            JOptionPane.showMessageDialog(null, "ERROR AL AGREGAR EL CONTROL DE LA VACUNA: " + E.getMessage());
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "ERROR INESPERADO: " + E.getMessage());
        }
    }

    public void ComboboxVacuna(JComboBox<String> comboBox) {
        String sql = "SELECT ID, INITCAP(NOMBRE) AS NOMBRE FROM VACUNA";
        try (Connection connection = Base.conectar();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery()) {
            // Limpiar el comboBox antes de llenarlo
            comboBox.removeAllItems();
            boolean existeVacuna = false;
            while (resultSet.next()) {
                existeVacuna = true;
                String id = resultSet.getString("ID");
                String nombre = resultSet.getString("NOMBRE");
                String itemComboBox = id + " " + nombre;
                comboBox.addItem(itemComboBox);
            }
            if (!existeVacuna) {
               comboBox.addItem("No hay Vacunas registradas");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al llenar el comboBox de vacunas: " + e.getMessage());

            e.printStackTrace();
        }
    }

    public void ComboboxMascota(JComboBox<String> comboBox) {
        String sql = "SELECT ID, INITCAP(NOMBRE) AS NOMBRE FROM MASCOTA";
        try (Connection connection = Base.conectar();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery()) {
            // Limpiar el comboBox antes de llenarlo
            comboBox.removeAllItems();
            boolean existeMascota = false;
            while (resultSet.next()) {
                existeMascota = true;
                String id = resultSet.getString("ID");
                String nombre = resultSet.getString("NOMBRE");
                String itemComboBox = id + " " + nombre;
                comboBox.addItem(itemComboBox);
            }
            if (!existeMascota) {
                comboBox.addItem("No hay mascotas registradas");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al llenar el comboBox de mascotas: " + e.getMessage());

            e.printStackTrace();
        }
    }

    public void ComboboxControlVacuna(JComboBox<String> comboBox) {
        String sql = "SELECT ID FROM CONTROLVACUNA"; 
        try (Connection connection = Base.conectar();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery()) {
            comboBox.removeAllItems();
            boolean existeControlVacuna = false;
            while (resultSet.next()) {
                existeControlVacuna = true;
                int idControlVacuna = resultSet.getInt("ID"); 
                String itemComboBox = String.valueOf(idControlVacuna);  
                comboBox.addItem(itemComboBox); 
            }
            if (!existeControlVacuna) {
                comboBox.addItem("No hay controles de vacunas registrados");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al llenar el comboBox de controles de vacunas: " + e.getMessage());

            e.printStackTrace();
        }
    }
 public void cargardatos(JTable tablaVacunas, conexion Base) {
        String sql = "SELECT * FROM CONTROLVACUNA";  
        try (Connection connection = Base.conectar();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ResultSet llenar = ps.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("DOSIS");
            modelo.addColumn("FECHA");
            modelo.addColumn("ID_VACUNA");
            modelo.addColumn("ID_MASCOTA");
            modelo.setRowCount(0);

            while (llenar.next()) {
                Object[] row = new Object[5];
                row[0] = llenar.getInt("ID");
                row[1] = llenar.getInt("DOSIS");
                row[2] = llenar.getDate("FECHA");
                row[3] = llenar.getString("ID_VACUNA");
                row[4] = llenar.getString("ID_MASCOTA");

                modelo.addRow(row);
            }

            tablaVacunas.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos: " + e.getMessage());
            e.printStackTrace();
        }
    }
public void eliminar(String ID) {

    String sql = "DELETE FROM CONTROLVACUNA WHERE ID = ?";

    try (Connection connection = Base.conectar();
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

        preparedStatement.setString(1, ID);

        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Control de vacuna eliminado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el control de la vacuna");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar el control de vacuna: " + e.getMessage());
        e.printStackTrace();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
        e.printStackTrace();
    }
}


public void editarControlVacuna(String idControlVacuna, int dosis, Date fecha, String idVacuna, String idMascota) {

    String sql = "UPDATE CONTROLVACUNA SET DOSIS = ?, FECHA = ?, ID_VACUNA = ?, ID_MASCOTA = ? WHERE ID = ?";

    try (Connection connection = Base.conectar();
         PreparedStatement ps = connection.prepareStatement(sql)) {
        
        ps.setInt(1, dosis);
        ps.setDate(2, new java.sql.Date(fecha.getTime()));
        ps.setString(3, idVacuna);
        ps.setString(4, idMascota);
        ps.setString(5, idControlVacuna);
        
        if (ps.executeUpdate() > 0) {
            JOptionPane.showMessageDialog(null, "Control de vacuna actualizado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el control de vacuna");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar el control de vacuna: " + e.getMessage());
        e.printStackTrace();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
        e.printStackTrace();
    }
}
public void cargarControlVacuna(String idControlVacuna, JComboBox<String> cmbVacunas, JComboBox<String> cmbMascota, RSMTextFull txtDOsis, JDateChooser jDateChooser1) {
    String sql = "SELECT * FROM CONTROLVACUNA WHERE ID = ?";

    try (Connection connection = Base.conectar();
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

        if (connection == null) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo establecer conexión con la base de datos.");
            return;
        }

        preparedStatement.setString(1, idControlVacuna);
        ResultSet rs = preparedStatement.executeQuery();

        if (rs.next()) {
           
            txtDOsis.setText(String.valueOf(rs.getInt("DOSIS")));
            jDateChooser1.setDate(rs.getDate("FECHA"));

            // Cargar y establecer las opciones en los ComboBox
            if (!cargarOpcionesComboBox(cmbVacunas, "VACUNA", rs.getString("ID_VACUNA"))) {
                JOptionPane.showMessageDialog(null, "Advertencia: No se pudo establecer la vacuna seleccionada.");
            }

            if (!cargarOpcionesComboBox(cmbMascota, "MASCOTA", rs.getString("ID_MASCOTA"))) {
                JOptionPane.showMessageDialog(null, "Advertencia: No se pudo establecer la mascota seleccionada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron datos para el control de vacuna con ID: " + idControlVacuna);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al cargar los datos del control de vacuna: " + e.getMessage());
        e.printStackTrace();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
        e.printStackTrace();
    }
}

private boolean cargarOpcionesComboBox(JComboBox<String> comboBox, String tabla, String idSeleccionado) {
    String sql = "SELECT ID, NOMBRE FROM " + tabla;
    boolean cargado = false;

    try (Connection connection = Base.conectar();
         PreparedStatement preparedStatement = connection.prepareStatement(sql);
         ResultSet rs = preparedStatement.executeQuery()) {

        if (connection == null) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo establecer conexión con la base de datos.");
            return false;
        }

        comboBox.removeAllItems(); // Limpiar el ComboBox

        while (rs.next()) {
            String id = rs.getString("ID");
            String nombre = rs.getString("NOMBRE");
            comboBox.addItem(id + " - " + nombre); // Agregar opciones al ComboBox

            // Establecer la selección si coincide el ID
            if (id.equals(idSeleccionado)) {
                comboBox.setSelectedItem(id + " - " + nombre);
            }
            cargado = true;
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al cargar las opciones de " + tabla + ": " + e.getMessage());
        e.printStackTrace();
    }

    return cargado;
}

public void llenarComboBoxConIdYNombre(JComboBox<String> comboBox, String cedula) {
    // Consulta SQL para obtener ID y nombre de mascotas asociadas a la cédula del dueño
    String sqlMascotas = "SELECT m.ID, INITCAP(m.NOMBRE) AS NOMBRE_MASCOTA " +
                         "FROM MASCOTA m " +
                         "WHERE m.CEDULA_DUENO = ?";

    try (Connection connection = Base.conectar();
         PreparedStatement preparedStatementMascotas = connection.prepareStatement(sqlMascotas)) {

        // Establecer el parámetro de la consulta (cédula del dueño)
        preparedStatementMascotas.setString(1, cedula);

        try (ResultSet resultSetMascotas = preparedStatementMascotas.executeQuery()) {
            // Limpiar el comboBox antes de llenarlo
            comboBox.removeAllItems();

            boolean hayMascotas = false; // Variable para verificar si hay mascotas

            // Llenar el comboBox con los resultados (ID y Nombre)
            while (resultSetMascotas.next()) {
                hayMascotas = true; // Si hay registros, cambiar el estado
                int idMascota = resultSetMascotas.getInt("ID");
                String nombreMascota = resultSetMascotas.getString("NOMBRE_MASCOTA");
                comboBox.addItem(idMascota + " - " + nombreMascota);
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
public void llenarComboBoxMascotasPorDueño(JComboBox<String> comboBox, String cedula) {
    String sql = "SELECT m.ID, INITCAP(m.NOMBRE) AS NOMBRE_MASCOTA FROM MASCOTA m WHERE m.CEDULA_DUENO = ?";
    try (Connection connection = Base.conectar();
         PreparedStatement ps = connection.prepareStatement(sql)) {
        ps.setString(1, cedula);

        try (ResultSet rs = ps.executeQuery()) {
            comboBox.removeAllItems(); // Limpiar el comboBox antes de llenarlo

            boolean hayMascotas = false;

            while (rs.next()) {
                hayMascotas = true;
                int idMascota = rs.getInt("ID");
                String nombreMascota = rs.getString("NOMBRE_MASCOTA");
                comboBox.addItem(idMascota + " - " + nombreMascota); // Cargar ID y nombre
            }

            // Si no hay mascotas, mostrar un mensaje en el comboBox
            if (!hayMascotas) {
                comboBox.addItem("No hay mascotas");
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al llenar el comboBox: " + e.getMessage());
        e.printStackTrace();
    }
}







public void mostrarVacunasMascotasYDuenoPorCedula(JTable tabla, String cedulaDueno) {
    Connection connection = Base.conectar(); // Usar tu clase de conexión
    if (connection == null) {
        System.out.println("No se pudo establecer la conexión a la base de datos.");
        return; // Salir del método si no hay conexión
    }

    // Consulta SQL con filtro por cédula del dueño
    String query = "SELECT CV.ID AS ID_VACUNA, " +
                   "CV.DOSIS AS DOSIS, " +
                   "M.NOMBRE AS NOMBRE_MASCOTA, " +
                   "M.CEDULA_DUENO AS CEDULA_DUENO, " +
                   "D.NOMBRE || ' ' || D.APELLIDO AS NOMBRE_COMPLETO_DUENO " +
                   "FROM CONTROLVACUNA CV " +
                   "JOIN MASCOTA M ON CV.ID_MASCOTA = M.ID " +
                   "JOIN DUENO D ON M.CEDULA_DUENO = D.CEDULA " +
                   "WHERE TRIM(UPPER(D.CEDULA)) = TRIM(UPPER(?)) " +
                   "ORDER BY D.NOMBRE, D.APELLIDO, M.NOMBRE";

    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("ID Vacuna");
    model.addColumn("Dosis");
    model.addColumn("Nombre Mascota");
    model.addColumn("Cédula Dueño");
    model.addColumn("Nombre Completo Dueño");

    try (PreparedStatement statement = connection.prepareStatement(query)) {
        // Establecer el parámetro de la cédula
        statement.setString(1, cedulaDueno);

        // Depuración: Verifica los valores
        System.out.println("Ejecutando consulta: " + query);
        System.out.println("Cédula proporcionada: " + cedulaDueno);

        ResultSet resultSet = statement.executeQuery();

        boolean hasResults = false;
        while (resultSet.next()) {
            hasResults = true;

            int idVacuna = resultSet.getInt("ID_VACUNA");
            String dosis = resultSet.getString("DOSIS");
            String nombreMascota = resultSet.getString("NOMBRE_MASCOTA");
            String cedulaDuenoResult = resultSet.getString("CEDULA_DUENO");
            String nombreCompletoDueno = resultSet.getString("NOMBRE_COMPLETO_DUENO");

            model.addRow(new Object[]{idVacuna, dosis, nombreMascota, cedulaDuenoResult, nombreCompletoDueno});
        }

        if (!hasResults) {
            System.out.println("No se encontraron resultados para la cédula: " + cedulaDueno);
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


public static void bloquearFechaMaxima(JDateChooser dateChooser) {
        // Obtener la fecha actual
        Date fechaActual = new Date();

        // Establecer la fecha máxima como la fecha actual
        dateChooser.setMaxSelectableDate(fechaActual);
    }





public boolean cargarControlVacunaPorCedula(String cedula, JTable table) {
    // Verificar si la tabla es nula
    if (table == null) {
        JOptionPane.showMessageDialog(null, "Error: La tabla no está inicializada.");
        return false;
    }

    String query = "SELECT CV.ID, CV.DOSIS, CV.FECHA, V.NOMBRE AS VACUNA, M.NOMBRE AS NOMBRE_MASCOTA, D.CEDULA " +
                   "FROM CONTROLVACUNA CV " +
                   "JOIN MASCOTA M ON CV.ID_MASCOTA = M.ID " +
                   "JOIN VACUNA V ON CV.ID_VACUNA = V.ID " +
                   "JOIN DUENO D ON M.CEDULA_DUENO = D.CEDULA " +
                   "WHERE TRIM(UPPER(D.CEDULA)) = TRIM(UPPER(?))";

    try (Connection conn = Base.conectarBD()) {
        if (conn == null) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexión a la base de datos.");
            return false;
        }

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, cedula); // Establecer la cédula en el query

            try (ResultSet rs = stmt.executeQuery()) {
                // Crear el modelo de tabla con las columnas necesarias
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("ID Control"); // Columna ID
                model.addColumn("DOSIS");
                model.addColumn("FECHA");
                model.addColumn("VACUNA");
                model.addColumn("NOMBRE MASCOTA");
                model.addColumn("CEDULA");

                // Llenar la tabla con los datos
                boolean foundData = false;
                while (rs.next()) {
                    int id = rs.getInt("ID"); // Obtener el ID de la tabla CONTROLVACUNA
                    String dosis = rs.getString("DOSIS");
                    Date fecha = rs.getDate("FECHA");
                    String vacuna = rs.getString("VACUNA");
                    String nombreMascota = rs.getString("NOMBRE_MASCOTA");
                    String cedulaDueno = rs.getString("CEDULA");

                    // Agregar los datos a la tabla
                    model.addRow(new Object[]{id, dosis, fecha, vacuna, nombreMascota, cedulaDueno});
                    foundData = true;
                }

                // Asignar el modelo de tabla a la JTable
                if (foundData) {
                    table.setModel(model);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontraron registros para la cédula ingresada.");
                    return false;
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta.");
                e.printStackTrace();
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al preparar la consulta.");
            e.printStackTrace();
            return false;
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos.");
        e.printStackTrace();
        return false;
    }
}




public int obtenerIdDeFilaSeleccionada(JTable table) {
    // Obtener el índice de la fila seleccionada
    int rowIndex = table.getSelectedRow();
    
    // Verificar si se ha seleccionado una fila
    if (rowIndex != -1) {
        // Obtener el valor de la columna "ID" (supongamos que es la primera columna)
        // Cambiar el índice de columna si "ID" no está en la primera posición (índice 0)
        Object idValue = table.getValueAt(rowIndex, 0); // 0 es el índice de la columna "ID"
        
        // Verificar si el valor de la columna "ID" es de tipo Integer
        if (idValue instanceof Integer) {
            return (Integer) idValue;
        } else {
            // Si el tipo no es Integer, convertirlo o manejar el error
            JOptionPane.showMessageDialog(null, "El valor de la columna ID no es un número entero.");
            return -1; // Valor de error
        }
    } else {
        JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila.");
        return -1; // Valor de error
    }
}



// Método para llenar el JComboBox con las vacunas desde la base de datos
public void cargarVacunasEnCombo(JComboBox<String> cmbVacuna) {
    String queryVacunas = "SELECT NOMBRE FROM VACUNA";
    try (Connection conn = Base.conectar()) {
        if (conn == null) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexión a la base de datos.");
            return;
        }

        try (PreparedStatement stmt = conn.prepareStatement(queryVacunas);
             ResultSet rs = stmt.executeQuery()) {
            
            // Limpiar el JComboBox antes de llenarlo
            cmbVacuna.removeAllItems();

            while (rs.next()) {
                String vacuna = rs.getString("NOMBRE");
                if (vacuna != null) {
                    cmbVacuna.addItem(vacuna);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar las vacunas en el JComboBox.");
            e.printStackTrace();
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos.");
        e.printStackTrace();
    }
}
public void ComboboxMascotaEditar(JComboBox<String> comboBox) {
    String sql = "SELECT ID, INITCAP(NOMBRE) AS NOMBRE FROM MASCOTA";
    try (Connection connection = Base.conectar();
         PreparedStatement preparedStatement = connection.prepareStatement(sql);
         ResultSet resultSet = preparedStatement.executeQuery()) {
        
        // Limpiar el comboBox antes de llenarlo
        comboBox.removeAllItems();
        boolean existeMascota = false;
        
        while (resultSet.next()) {
            existeMascota = true;
            String id = resultSet.getString("ID");
            String nombre = resultSet.getString("NOMBRE");
            
            // Combinamos el ID y el nombre para mostrarlo en el combo
            String itemComboBox = id + " " + nombre;
            comboBox.addItem(itemComboBox);
        }
        
        if (!existeMascota) {
            comboBox.addItem("No hay mascotas registradas");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al llenar el comboBox de mascotas: " + e.getMessage());
        e.printStackTrace();
    }
}


public boolean cargarDatosPorId(int id, JTextField txtDosis, JDateChooser dateChooser, JComboBox<String> cmbVacuna, JComboBox<String> cmbMascota, JTextField txtCedulaDueno) {
    // Verificar si los campos de texto, el JDateChooser y los JComboBox son nulos
    if (txtDosis == null || dateChooser == null || cmbVacuna == null || cmbMascota == null || txtCedulaDueno == null) {
        JOptionPane.showMessageDialog(null, "Error: Algunos campos de la interfaz no están inicializados.");
        return false;
    }

    // Primero cargamos las vacunas y mascotas en los JComboBox
    cargarVacunasEnCombo(cmbVacuna);
    ComboboxMascotaEditar(cmbMascota); // Llamamos al método para cargar las mascotas

    String query = "SELECT CV.DOSIS, CV.FECHA, V.NOMBRE AS VACUNA, M.ID AS MASCOTA_ID, M.NOMBRE AS NOMBRE_MASCOTA, D.CEDULA " +
                   "FROM CONTROLVACUNA CV " +
                   "JOIN MASCOTA M ON CV.ID_MASCOTA = M.ID " +
                   "JOIN VACUNA V ON CV.ID_VACUNA = V.ID " +
                   "JOIN DUENO D ON M.CEDULA_DUENO = D.CEDULA " +
                   "WHERE CV.ID = ?";

    try (Connection conn = Base.conectarBD()) {
        if (conn == null) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexión a la base de datos.");
            return false;
        }

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id); // Establecer el ID en el query

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // Obtener los datos de la consulta
                    String dosis = rs.getString("DOSIS");
                    Date fecha = rs.getDate("FECHA");
                    String vacuna = rs.getString("VACUNA");
                    String nombreMascota = rs.getString("NOMBRE_MASCOTA");
                    String cedulaDueno = rs.getString("CEDULA");
                    int mascotaId = rs.getInt("MASCOTA_ID");

                    // Settear los datos en los JTextFields y JComboBox
                    if (dosis != null) {
                        txtDosis.setText(dosis);
                    } else {
                        txtDosis.setText(""); // O algún valor predeterminado
                    }

                    if (fecha != null) {
                        // Setear la fecha en el JDateChooser
                        dateChooser.setDate(fecha);
                    } else {
                        dateChooser.setDate(null); // O alguna fecha predeterminada
                    }

                    if (vacuna != null) {
                        // Establecer la vacuna seleccionada en el JComboBox
                        cmbVacuna.setSelectedItem(vacuna);
                    } else {
                        cmbVacuna.setSelectedIndex(-1); // O algún valor predeterminado
                    }

                    if (nombreMascota != null) {
                        // Seleccionar la mascota correspondiente en el JComboBox
                        seleccionarMascota(cmbMascota, mascotaId);
                    } else {
                        cmbMascota.setSelectedIndex(-1); // O algún valor predeterminado
                    }

                    if (cedulaDueno != null) {
                        txtCedulaDueno.setText(cedulaDueno);
                    } else {
                        txtCedulaDueno.setText(""); // O algún valor predeterminado
                    }

                    return true; // Si los datos se cargan correctamente
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontraron registros para el ID ingresado.");
                    return false;
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta.");
                e.printStackTrace();
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al preparar la consulta.");
            e.printStackTrace();
            return false;
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos.");
        e.printStackTrace();
        return false;
    }
}

private void seleccionarMascota(JComboBox<String> comboBox, int mascotaId) {
    for (int i = 0; i < comboBox.getItemCount(); i++) {
        String item = comboBox.getItemAt(i);
        String[] parts = item.split(" ");
        String id = parts[0]; // El ID es la primera parte del string
        if (id.equals(String.valueOf(mascotaId))) {
            comboBox.setSelectedIndex(i); // Seleccionar el índice correspondiente
            break;
        }
    }
}


public boolean editarDatosPorId(int id, String dosis, Date fecha, String vacuna, String cedulaDueno) {
    // Verificar si los parámetros son nulos o vacíos antes de continuar
    if (dosis == null || dosis.isEmpty()) {
        JOptionPane.showMessageDialog(null, "La dosis no puede ser vacía.");
        return false;
    }

    if (fecha == null) {
        JOptionPane.showMessageDialog(null, "La fecha no puede ser nula.");
        return false;
    }

    if (vacuna == null || vacuna.isEmpty()) {
        JOptionPane.showMessageDialog(null, "La vacuna no puede ser nula o vacía.");
        return false;
    }

    if (cedulaDueno == null || cedulaDueno.isEmpty()) {
        JOptionPane.showMessageDialog(null, "La cédula del dueño no puede ser vacía.");
        return false;
    }

    String query = "UPDATE CONTROLVACUNA CV " +
                   "SET CV.DOSIS = ?, CV.FECHA = ?, CV.ID_VACUNA = (SELECT ID FROM VACUNA WHERE NOMBRE = ?), " +
                   "CV.ID_MASCOTA = (SELECT ID FROM MASCOTA WHERE CEDULA = ?) " + 
                   "WHERE CV.ID = ?";

    try (Connection conn = Base.conectar()) {
        if (conn == null) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexión a la base de datos.");
            return false;
        }

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, dosis);
            stmt.setDate(2, new java.sql.Date(fecha.getTime()));
            stmt.setString(3, vacuna);
            stmt.setString(4, cedulaDueno);
            stmt.setInt(5, id);

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron registros para actualizar.");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta de actualización.");
            e.printStackTrace();
            return false;
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos.");
        e.printStackTrace();
        return false;
    }
}

// Método auxiliar para obtener el ID de la vacuna por nombre
private int obtenerIdVacunaPorNombre(String vacunaNombre) {
    String query = "SELECT ID FROM VACUNA WHERE NOMBRE = ?";
    try (Connection conn = Base.conectarBD();
         PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setString(1, vacunaNombre);
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("ID");
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener el ID de la vacuna.");
        e.printStackTrace();
    }
    return -1; // En caso de no encontrar el ID
}

// Método auxiliar para obtener el ID de la mascota
private int obtenerIdMascota(String mascotaSeleccionada) {
    // Dividir el valor seleccionado en el JComboBox (ejemplo "1 - NombreMascota")
    String[] partes = mascotaSeleccionada.split(" ");
    if (partes.length > 0) {
        try {
            return Integer.parseInt(partes[0]); // Tomar el ID de la mascota antes del espacio o guion
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el ID de la mascota.");
            e.printStackTrace();
        }
    }
    return -1; // En caso de no poder obtener el ID
}






public boolean eliminarDatosPorId(int id) {
    String query = "DELETE FROM CONTROLVACUNA WHERE ID = ?";

    try (Connection conn = Base.conectar()) {
        if (conn == null) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexión a la base de datos.");
            return false;
        }

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id); // Establecer el ID en la consulta

            int rowsAffected = stmt.executeUpdate(); // Ejecutar la eliminación

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Datos eliminados correctamente.");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron registros para eliminar.");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta de eliminación.");
            e.printStackTrace();
            return false;
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos.");
        e.printStackTrace();
        return false;
    }
}








}


