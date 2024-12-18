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
import javax.swing.JTextField;
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

    public ControMedicoDb(int ID, String FECHA, String DIAGNOSTICO, int ID_VETERINARIO, int ID_MASCOTA) {
        super(ID, FECHA, DIAGNOSTICO, ID_VETERINARIO, ID_MASCOTA);
    }

    public ControMedicoDb(String FECHA, String DIAGNOSTICO, int ID_VETERINARIO, int ID_MASCOTA) {
        super(FECHA, DIAGNOSTICO, ID_VETERINARIO, ID_MASCOTA);
    }
    
    
    //Codigo Agregar
    
    public void guardarControlMedico(JDateChooser jdcFecha, JTextField txtDiagnostico, JComboBox<String> cmbVeterinarios, JComboBox<String> cmbMascotas) {
    // Obtener y validar la fecha
    if (jdcFecha.getDate() == null) {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione una fecha válida.");
        return;
    }
    java.sql.Date sqlDate = new java.sql.Date(jdcFecha.getDate().getTime());

    // Obtener y validar el diagnóstico
    String diagnostico = txtDiagnostico.getText().trim();
    if (diagnostico.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un diagnóstico.");
        return;
    }

    // Obtener y validar el veterinario seleccionado
    String veterinarioSeleccionado = (String) cmbVeterinarios.getSelectedItem();
    if (veterinarioSeleccionado == null || veterinarioSeleccionado.equals("No hay veterinarios registrados")) {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione un veterinario válido.");
        return;
    }
    int idVeterinario = Integer.parseInt(veterinarioSeleccionado.split(" ")[0]);

    // Obtener y validar la mascota seleccionada
    String mascotaSeleccionada = (String) cmbMascotas.getSelectedItem();
    if (mascotaSeleccionada == null || mascotaSeleccionada.equals("No hay mascotas registradas")) {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione una mascota válida.");
        return;
    }
    int idMascota = Integer.parseInt(mascotaSeleccionada.split(" ")[0]);

    // Consulta SQL para insertar el control médico
    String sql = "INSERT INTO CONTROL_MEDICO (FECHA, DIAGNOSTICO, ID_VETERINARIO, ID_MASCOTA) VALUES (?, ?, ?, ?)";

    try (Connection connection = Base.conectarBD()) {
    if (connection == null) {
        JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
        return;
    }
    try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        // Establecer los parámetros de la consulta
        preparedStatement.setDate(1, sqlDate);
        preparedStatement.setString(2, diagnostico);
        preparedStatement.setInt(3, idVeterinario);
        preparedStatement.setInt(4, idMascota);

        // Ejecutar la consulta
        int rowsInserted = preparedStatement.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(null, "Control médico guardado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el control médico.");
        }
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error al guardar el control médico: " + e.getMessage());
    e.printStackTrace();
}
}
    
//llenar los combobox
    
    public void llenarComboBoxVeterinarios(JComboBox<String> comboBox) {
    String sql = "SELECT CEDULA, INITCAP(NOMBRE) AS NOMBRE FROM VETERINARIO";

    try (Connection connection = Base.conectarBD();
         PreparedStatement preparedStatement = connection.prepareStatement(sql);
         ResultSet resultSet = preparedStatement.executeQuery()) {

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

    try (Connection connection = Base.conectarBD();
         PreparedStatement preparedStatement = connection.prepareStatement(sql);
         ResultSet resultSet = preparedStatement.executeQuery()) {

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
}
