/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.crud.Veterinario;

import Modelo.*;
import com.toedter.calendar.JDateChooser;
import java.awt.List;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JComboBox;
import java.util.Date;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import Vista.crud.Veterinario.ControlMedico.*;

/**
 *
 * @author user
 */
public class ControMedicoDb extends Modelo.Control_Medico {

    private conexion Base;

    //constructor con la base
    public ControMedicoDb(conexion Base) {
        this.Base = Base;
    }

    //Constructores
    public ControMedicoDb() {
    }

    public ControMedicoDb(String ID, Date FECHA, String DIAGNOSTICO, String ID_VETERINARIO, String ID_MASCOTA) {
        super(ID, FECHA, DIAGNOSTICO, ID_VETERINARIO, ID_MASCOTA);
    }

    public ControMedicoDb(Date FECHA, String DIAGNOSTICO, String ID_VETERINARIO, String ID_MASCOTA) {
        super(FECHA, DIAGNOSTICO, ID_VETERINARIO, ID_MASCOTA);
    }

    //Codigo Agregar
    public void insertarControlMedico(Date FECHA, String DIAGNOSTICO, String ID_VETERINARIO, String ID_MASCOTA) throws SQLException {

        String SQL = "INSERT INTO CONTROLMEDICO(FECHA,DIAGNOSTICO,ID_VETERINARIO,ID_MASCOTA) VALUES (?, ?, ?, ?)";
        try ( Connection connection = Base.conectarBD();  PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {

            //CONVIERTE LA FECHA A SQL DATE
            java.sql.Date SQL_FECHA = new java.sql.Date(FECHA.getTime());

            //settear valores
            preparedStatement.setDate(1, SQL_FECHA);
            preparedStatement.setString(2, DIAGNOSTICO);
            preparedStatement.setString(3, ID_VETERINARIO);
            preparedStatement.setString(4, ID_MASCOTA);

            //Ejecutar consulta de interseccion
            int ROWS_AFFECTED = preparedStatement.executeUpdate();
            if (ROWS_AFFECTED > 0) {
                JOptionPane.showMessageDialog(null, "Control Medico agregado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Control Medico no agregado");
            }
        } catch (SQLException E) {
            JOptionPane.showMessageDialog(null, "ERROR AL AGREGAR EL CONTROL DE VACUNA" + E.getMessage());
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "ERROR INESPERADO" + E.getMessage());
        }
    }
//llenar los combobox

    public void llenarComboBoxVeterinarios(JComboBox<String> comboBox) {
        String sql = "SELECT CEDULA, INITCAP(NOMBRE) AS NOMBRE FROM VETERINARIO";

        try ( Connection connection = Base.conectarBD();  PreparedStatement preparedStatement = connection.prepareStatement(sql);  ResultSet resultSet = preparedStatement.executeQuery()) {

            comboBox.removeAllItems();
            boolean existeVete = false;

            while (resultSet.next()) {
                existeVete = true;
                String cedula = resultSet.getString("CEDULA");
                String nombre = resultSet.getString("NOMBRE");

                String itemComboBox = cedula + " " + nombre;
                comboBox.addItem(itemComboBox);
            }

            if (!existeVete) {
                comboBox.addItem("No hay veterinarios registrados");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al llenar el comboBox: " + e.getMessage());
        }
    }

    public void llenarComboBoxMascota(JComboBox<String> comboBox) {
        // Consulta SQL para obtener el ID y el nombre de las mascotas
        String sql = "SELECT ID, INITCAP(NOMBRE) AS NOMBRE FROM MASCOTA";

        try ( Connection connection = Base.conectarBD();  PreparedStatement preparedStatement = connection.prepareStatement(sql);  ResultSet resultSet = preparedStatement.executeQuery()) {

            // Limpiar el comboBox antes de llenarlo
            comboBox.removeAllItems();
            boolean existeMascota = false;

            // Recorrer los resultados y llenar el comboBox
            while (resultSet.next()) {
                existeMascota = true;
                int id = resultSet.getInt("ID"); // Obtener el ID de la mascota
                String nombre = resultSet.getString("NOMBRE"); // Obtener el nombre

                // Formatear el texto para el comboBox: "ID - Nombre"
                String itemComboBox = id + " - " + nombre;
                comboBox.addItem(itemComboBox);
            }

            // Si no hay registros, mostrar un mensaje en el comboBox
            if (!existeMascota) {
                comboBox.addItem("No hay mascotas registradas");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al llenar el comboBox de mascotas: " + e.getMessage());
        }
    }

    public void llenarComboBoxControlMedico(JComboBox<String> comboBox) {
        // Consulta SQL para obtener los IDs de la tabla CONTROLMEDICO
        String sql = "SELECT ID FROM CONTROLMEDICO";

        try ( Connection connection = Base.conectar();  PreparedStatement preparedStatement = connection.prepareStatement(sql);  ResultSet resultSet = preparedStatement.executeQuery()) {

            // Limpiar el combo box antes de llenarlo
            comboBox.removeAllItems();
            boolean existeControlMedico = false;

            // Iterar sobre los resultados y llenar el combo box con los IDs
            while (resultSet.next()) {
                existeControlMedico = true;
                int idControlMedico = resultSet.getInt("ID");
                comboBox.addItem(String.valueOf(idControlMedico));
            }

            // Verificar si no hay registros en la tabla
            if (!existeControlMedico) {
                comboBox.addItem("No hay controles médicos registrados");
            }

        } catch (SQLException e) {
            // Mostrar mensaje de error en caso de que ocurra un problema con la consulta o conexión
            JOptionPane.showMessageDialog(null, "Error al llenar el comboBox de controles médicos: " + e.getMessage());
            e.printStackTrace();
        }
    }

    //control medico
    public boolean verificarControlMedico(String DIAGNOSTICO) {
        String sql = "SELECT COUNT(*) AS TOTAL FROM CONTROL_MEDICO WHERE DIAGNOSTICO = INITCAP(?)";

        try ( Connection connection = Base.conectar();  PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, DIAGNOSTICO);

            try ( ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int total = resultSet.getInt("TOTAL");
                    return total > 0;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al verificar el control médico: " + e.getMessage());
            e.printStackTrace();
        }
        return false;
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

    public void cargarDatosEnTabla(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("FECHA");
        modelo.addColumn("DIAGNOSTICO");
        modelo.addColumn("ID_VETERINARIO");
        modelo.addColumn("ID_MASCOTA");

        Connection connection = Base.conectarBD(); // Asegúrate de implementar correctamente este método
        String query = "SELECT ID, FECHA, DIAGNOSTICO, ID_VETERINARIO, ID_MASCOTA FROM CONTROLMEDICO";

        try {
            java.sql.Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Object[] fila = new Object[5];
                fila[0] = resultSet.getInt("ID");
                fila[1] = resultSet.getDate("FECHA"); // Utiliza getDate para el tipo DATE
                fila[2] = resultSet.getString("DIAGNOSTICO");
                fila[3] = resultSet.getInt("ID_VETERINARIO");
                fila[4] = resultSet.getInt("ID_MASCOTA");
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

  
  public void cargarDatosControlMedico(JDateChooser fechaChooser, JTextField diagnosticoField, JComboBox<String> comboVeterinario, String cedulaDueno, JComboBox<String> comboMascota) throws SQLException {
    // Consulta SQL para cargar los datos del control médico
    String sql = "SELECT " +
                 "    DUENO.CEDULA AS CEDULA_DUENO, " +
                 "    MASCOTA.ID AS ID_MASCOTA, " +
                 "    MASCOTA.NOMBRE AS NOMBRE_MASCOTA, " +
                 "    CONTROLMEDICO.FECHA, " +
                 "    CONTROLMEDICO.DIAGNOSTICO, " +
                 "    VETERINARIO.CEDULA AS CEDULA_VETERINARIO, " +
                 "    VETERINARIO.NOMBRE AS NOMBRE_VETERINARIO " +
                 "FROM " +
                 "    CONTROLMEDICO " +
                 "INNER JOIN MASCOTA ON CONTROLMEDICO.ID_MASCOTA = MASCOTA.ID " +
                 "INNER JOIN DUENO ON MASCOTA.CEDULA_DUENO = DUENO.CEDULA " +
                 "INNER JOIN VETERINARIO ON CONTROLMEDICO.ID_VETERINARIO = VETERINARIO.CEDULA " +
                 "WHERE DUENO.CEDULA = ?"; // Filtrar por cédula del dueño
    
    try (Connection connection = Base.conectarBD(); PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        preparedStatement.setString(1, cedulaDueno);
        
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                // Cargar la fecha en el JDateChooser
                java.sql.Date fecha = resultSet.getDate("FECHA");
                fechaChooser.setDate(fecha);

                // Cargar el diagnóstico en el JTextField
                String diagnostico = resultSet.getString("DIAGNOSTICO");
                diagnosticoField.setText(diagnostico);

                // Cargar el veterinario en el JComboBox de veterinarios
                String nombreVeterinario = resultSet.getString("NOMBRE_VETERINARIO");
                String cedulaVeterinario = resultSet.getString("CEDULA_VETERINARIO");
                String veterinarioItem = cedulaVeterinario + " " + nombreVeterinario;

                // Verificar si el veterinario existe en el comboBox
                boolean encontrado = false;
                for (int i = 0; i < comboVeterinario.getItemCount(); i++) {
                    if (comboVeterinario.getItemAt(i).equals(veterinarioItem)) {
                        comboVeterinario.setSelectedItem(veterinarioItem);
                        encontrado = true;
                        break;
                    }
                }

                // Si no se encuentra el veterinario, mostrar un mensaje
                if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "Veterinario no encontrado en la lista.");
                }

                // Cargar la mascota en el JComboBox de mascotas
                String nombreMascota = resultSet.getString("NOMBRE_MASCOTA");
                String idMascota = resultSet.getString("ID_MASCOTA");
                comboMascota.setSelectedItem(idMascota + " - " + nombreMascota);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron datos para la cédula del dueño.");
            }
        }
    } catch (SQLException e) {
        throw new SQLException("Error al cargar los datos del control médico: " + e.getMessage());
    }
}
    
   // Codigo Modificar
public void modificarControlMedico(int ID_CONTROLMEDICO, Date FECHA, String DIAGNOSTICO, String ID_VETERINARIO, String ID_MASCOTA) throws SQLException {

    String SQL = "UPDATE CONTROLMEDICO SET FECHA = ?, DIAGNOSTICO = ?, ID_VETERINARIO = ?, ID_MASCOTA = ? WHERE ID_CONTROLMEDICO = ?";
    try (Connection connection = Base.conectarBD(); PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {

        // Convierte la fecha a SQL Date
        java.sql.Date SQL_FECHA = new java.sql.Date(FECHA.getTime());

        // Setear valores en la consulta
        preparedStatement.setDate(1, SQL_FECHA);
        preparedStatement.setString(2, DIAGNOSTICO);
        preparedStatement.setString(3, ID_VETERINARIO);
        preparedStatement.setString(4, ID_MASCOTA);
        preparedStatement.setInt(5, ID_CONTROLMEDICO);  // Setear el ID de Control Médico a modificar

        // Ejecutar la consulta
        int ROWS_AFFECTED = preparedStatement.executeUpdate();
        if (ROWS_AFFECTED > 0) {
            JOptionPane.showMessageDialog(null, "Control Médico modificado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "Control Médico no modificado");
        }
    } catch (SQLException E) {
        JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR EL CONTROL MÉDICO: " + E.getMessage());
    } catch (Exception E) {
        JOptionPane.showMessageDialog(null, "ERROR INESPERADO: " + E.getMessage());
    }
}
    
    public void eliminarControlMedico(String idControlMedico) {
    String sql = "DELETE FROM CONTROLMEDICO WHERE ID = ?";

    try (Connection connection = Base.conectar();
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

        if (connection == null) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo establecer conexión con la base de datos.");
            return;
        }

        preparedStatement.setString(1, idControlMedico);  // Usar el ID como String

        int rowsAffected = preparedStatement.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Control médico eliminado con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el control médico con el ID especificado.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar los datos del control médico: " + e.getMessage());
        e.printStackTrace();
    }
}
    
   public void cargarDatosEnTablaCRUD(JTable tabla) {
    // Crear el modelo de la tabla
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Cédula Dueño");
    modelo.addColumn("ID Mascota");
    modelo.addColumn("Nombre Mascota");
    modelo.addColumn("Fecha");
    modelo.addColumn("Veterinario");

    // Consulta SQL actualizada
    String query = 
        "SELECT " +
        "    DUENO.CEDULA AS CEDULA_DUENO, " +
        "    MASCOTA.ID AS ID_MASCOTA, " +
        "    MASCOTA.NOMBRE AS NOMBRE_MASCOTA, " +
        "    CONTROLMEDICO.FECHA, " +
        "    VETERINARIO.NOMBRE AS NOMBRE_VETERINARIO " +
        "FROM " +
        "    CONTROLMEDICO " +
        "INNER JOIN MASCOTA ON CONTROLMEDICO.ID_MASCOTA = MASCOTA.ID " +
        "INNER JOIN DUENO ON MASCOTA.CEDULA_DUENO = DUENO.CEDULA " +
        "INNER JOIN VETERINARIO ON CONTROLMEDICO.ID_VETERINARIO = VETERINARIO.CEDULA";

    try (Connection connection = Base.conectarBD();
         Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(query)) {

        // Procesar los resultados de la consulta
        while (resultSet.next()) {
            Object[] fila = new Object[5];
            fila[0] = resultSet.getString("CEDULA_DUENO"); // Cédula del dueño
            fila[1] = resultSet.getInt("ID_MASCOTA");      // ID de la mascota
            fila[2] = resultSet.getString("NOMBRE_MASCOTA"); // Nombre de la mascota
            fila[3] = resultSet.getDate("FECHA");          // Fecha del control médico
            fila[4] = resultSet.getString("NOMBRE_VETERINARIO"); // Nombre del veterinario
            modelo.addRow(fila); // Agregar la fila al modelo
        }

        // Asignar el modelo a la tabla
        tabla.setModel(modelo);
    } catch (SQLException e) {
        System.out.println("Error al cargar los datos en la tabla.");
        e.printStackTrace();
    }
}

  public void filtrarControlMedicoPorCedula(JTable tabla, String prefijoCedula) {
    Connection connection = Base.conectarBD();
    if (connection == null) {
        System.out.println("No se pudo establecer la conexión a la base de datos.");
        return; // Salir del método si no hay conexión
    }

    // Consulta SQL para obtener los controles médicos filtrando por el prefijo de la cédula del dueño
    String query = "SELECT " +
                   "DUENO.CEDULA AS CEDULA_DUENO, " +
                   "MASCOTA.ID AS ID_MASCOTA, " +
                   "MASCOTA.NOMBRE AS NOMBRE_MASCOTA, " +
                   "CONTROLMEDICO.FECHA, " +
                   "VETERINARIO.NOMBRE AS NOMBRE_VETERINARIO " +
                   "FROM " +
                   "CONTROLMEDICO " +
                   "INNER JOIN MASCOTA ON CONTROLMEDICO.ID_MASCOTA = MASCOTA.ID " +
                   "INNER JOIN DUENO ON MASCOTA.CEDULA_DUENO = DUENO.CEDULA " +
                   "INNER JOIN VETERINARIO ON CONTROLMEDICO.ID_VETERINARIO = VETERINARIO.CEDULA " +
                   "WHERE DUENO.CEDULA LIKE ? " + // Filtrar por cédula del dueño
                   "ORDER BY CONTROLMEDICO.FECHA DESC";

    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Cédula Dueño");
    model.addColumn("ID Mascota");
    model.addColumn("Nombre Mascota");
    model.addColumn("Fecha Control Médico");
    model.addColumn("Veterinario");

    try {
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, prefijoCedula + "%"); // Establecer el prefijo con el comodín

        ResultSet resultSet = preparedStatement.executeQuery();

        int rowCount = 0;
        while (resultSet.next()) {
            rowCount++;
            String cedulaDueño = resultSet.getString("CEDULA_DUENO"); // Obtener la cédula del dueño
            int idMascota = resultSet.getInt("ID_MASCOTA"); // Obtener el ID de la mascota
            String nombreMascota = resultSet.getString("NOMBRE_MASCOTA"); // Obtener el nombre de la mascota
            Date fechaControl = resultSet.getDate("FECHA"); // Obtener la fecha del control médico
            String nombreVeterinario = resultSet.getString("NOMBRE_VETERINARIO"); // Obtener el nombre del veterinario

            model.addRow(new Object[]{cedulaDueño, idMascota, nombreMascota, fechaControl, nombreVeterinario});
        }

        // Verificar si se encontraron filas
        if (rowCount == 0) {
            JOptionPane.showMessageDialog(null, "No se encontraron resultados para la cédula del dueño: " + prefijoCedula);
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
}
