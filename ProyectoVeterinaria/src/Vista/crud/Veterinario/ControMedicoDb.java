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

   public void cargarDatos(String idControlMedico, JDateChooser dateChooser, JTextField txtDiagnostico, JComboBox<String> cmbVeterinario, JComboBox<String> cmbMascota) {
    // Consulta SQL para buscar el registro por ID
    String sql = "SELECT FECHA, DIAGNOSTICO, ID_VETERINARIO, ID_MASCOTA FROM CONTROLMEDICO WHERE ID = ?";

    // Usar la conexión de la clase Base
    try (Connection conn = Base.conectar(); 
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        stmt.setString(1, idControlMedico);  // Establecer el ID como String en la consulta
        
        // Ejecutar la consulta
        try (ResultSet rs = stmt.executeQuery()) {
            // Si se encuentra el registro, cargar los datos
            if (rs.next()) {
                // Obtener y establecer la fecha en el JDateChooser
                dateChooser.setDate(rs.getDate("FECHA"));
                
                // Obtener y establecer el diagnóstico en el JTextField
                txtDiagnostico.setText(rs.getString("DIAGNOSTICO"));
                
                // Obtener el ID del veterinario y la mascota
                String idVeterinario = String.valueOf(rs.getInt("ID_VETERINARIO"));
                String idMascota = String.valueOf(rs.getInt("ID_MASCOTA"));
                
                // Buscar los elementos en los JComboBox para establecer la selección
                for (int i = 0; i < cmbVeterinario.getItemCount(); i++) {
                    String item = cmbVeterinario.getItemAt(i);
                    // Aquí buscamos si el id del veterinario está en el texto del item (por ejemplo: "123 Veterinario")
                    if (item.startsWith(idVeterinario)) {
                        cmbVeterinario.setSelectedItem(item); // Establecer el item seleccionado
                        break;
                    }
                }
                
                for (int i = 0; i < cmbMascota.getItemCount(); i++) {
                    String item = cmbMascota.getItemAt(i);
                    // Aquí buscamos si el id de la mascota está en el texto del item (por ejemplo: "456 Mascota")
                    if (item.startsWith(idMascota)) {
                        cmbMascota.setSelectedItem(item); // Establecer el item seleccionado
                        break;
                    }
                }
            } else {
                // Si no se encuentra el registro, mostrar un mensaje
                JOptionPane.showMessageDialog(null, "No se encontraron datos para el ID especificado.");
            }
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al cargar los datos: " + e.getMessage());
    }
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
}
