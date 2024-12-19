/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.crud.Veterinario;

import Modelo.*;
import com.toedter.calendar.JDateChooser;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JComboBox;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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

   public void cargarControlMedico(String idControlMedico, JDateChooser jDateChooser, JTextField txtDiagnostico, JComboBox<String> cmbVeterinario, JComboBox<String> cmbMascota) {
    String sql = "SELECT * FROM CONTROLMEDICO WHERE ID = ?";

    try (Connection connection = Base.conectar();
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

        if (connection == null) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo establecer conexión con la base de datos.");
            return;
        }

        preparedStatement.setString(1, idControlMedico);  // Usar el ID como String
        ResultSet rs = preparedStatement.executeQuery();

        if (rs.next()) {
            // Asignar los valores obtenidos a los campos correspondientes
            txtDiagnostico.setText(rs.getString("DIAGNOSTICO"));
            jDateChooser.setDate(rs.getDate("FECHA"));

            // Cargar y establecer las opciones en los ComboBox
            if (!cargarOpcionesComboBox(cmbVeterinario, "VETERINARIO", rs.getString("ID_VETERINARIO"))) {
                JOptionPane.showMessageDialog(null, "Advertencia: No se pudo establecer el veterinario seleccionado.");
            }

            if (!cargarOpcionesComboBox(cmbMascota, "MASCOTA", rs.getString("ID_MASCOTA"))) {
                JOptionPane.showMessageDialog(null, "Advertencia: No se pudo establecer la mascota seleccionada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron datos para el control médico con ID: " + idControlMedico);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al cargar los datos del control médico: " + e.getMessage());
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

    private void setComboBoxSelection(JComboBox<String> comboBox, String id) {
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            String item = comboBox.getItemAt(i);
            if (item.split(" ")[0].equals(id)) {  // Compara solo el ID
                comboBox.setSelectedIndex(i);
                break;
            }
        }
    }
    
    public void modificarControlMedico(String idControlMedico, String diagnostico, Date fecha, String idVeterinario, String idMascota) {
    String sql = "UPDATE CONTROLMEDICO SET DIAGNOSTICO = ?, FECHA = ?, ID_VETERINARIO = ?, ID_MASCOTA = ? WHERE ID = ?";

    try (Connection connection = Base.conectar();
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

        if (connection == null) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo establecer conexión con la base de datos.");
            return;
        }

        preparedStatement.setString(1, diagnostico);
        preparedStatement.setDate(2, new java.sql.Date(fecha.getTime())); // Convertir a java.sql.Date
        preparedStatement.setString(3, idVeterinario);
        preparedStatement.setString(4, idMascota);
        preparedStatement.setString(5, idControlMedico);  // Usar el ID como String

        int rowsAffected = preparedStatement.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Control médico modificado con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el control médico con el ID especificado.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al modificar los datos del control médico: " + e.getMessage());
        e.printStackTrace();
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
}
