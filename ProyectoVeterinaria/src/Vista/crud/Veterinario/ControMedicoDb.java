/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.crud.Veterinario;

import Modelo.*;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JComboBox;
import java.util.Date;

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
        try ( Connection connection = Base.conectarBD();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {

            //CONVIERTE LA FECHA A SQL DATE
            java.sql.Date SQL_FECHA = new java.sql.Date(FECHA.getTime());

            //settear valores
            preparedStatement.setDate(1, SQL_FECHA);
            preparedStatement.setString(2, DIAGNOSTICO);
            preparedStatement.setString(3, ID_VETERINARIO);
            preparedStatement.setString(4, ID_MASCOTA);
            
            //Ejecutar consulta de interseccion
            
            int ROWS_AFFECTED = preparedStatement.executeUpdate();
            if(ROWS_AFFECTED>0){
                JOptionPane.showMessageDialog(null, "Control Medico agregado exitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "Control Medico no agregado");
            }
        }catch(SQLException E){
            JOptionPane.showMessageDialog(null, "ERROR AL AGREGAR EL CONTROL DE VACUNA"+ E.getMessage());            
        }catch(Exception E){
            JOptionPane.showMessageDialog(null, "ERROR INESPERADO"+ E.getMessage());
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

    
    //obtener id control y id mascota para el combobox de busqueda
   public void llenarComboBoxControlMedicoPorMascota(JComboBox<String> comboBox, String nombreMascota) {
    // Imprimir el nombre de la mascota para depuración
    System.out.println("Buscando mascota con nombre: " + nombreMascota.trim());

    // Consulta SQL para obtener solo los IDs
    String sql = "SELECT CONTROLMEDICO.ID AS ID_CONTROLMEDICO, MASCOTA.ID AS ID_MASCOTA " +
                 "FROM CONTROLMEDICO " +
                 "INNER JOIN MASCOTA ON CONTROLMEDICO.ID_MASCOTA = MASCOTA.ID " +
                 "WHERE MASCOTA.NOMBRE = ?";

    try (Connection connection = Base.conectarBD();
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

        // Configurar el parámetro de la consulta con el nombre de la mascota
        preparedStatement.setString(1, nombreMascota.trim());

        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            // Limpiar el combo box antes de llenarlo
            comboBox.removeAllItems();
            boolean existeDatos = false;

            // Iterar sobre los resultados y llenar el combo box
            while (resultSet.next()) {
                existeDatos = true;

                // Obtener los datos de las columnas
                int idControlMedico = resultSet.getInt("ID_CONTROLMEDICO");
                int idMascota = resultSet.getInt("ID_MASCOTA");

                // Formatear el texto a mostrar en el combo box con solo los IDs
                String itemComboBox = "Control: " + idControlMedico + " - Mascota: " + idMascota;
                comboBox.addItem(itemComboBox);
            }

            // Verificar si no se encontraron registros
            if (!existeDatos) {
                comboBox.addItem("No se encontraron datos para la mascota especificada");
            }
        }

    } catch (SQLException e) {
        // Mostrar error en caso de que ocurra algún problema con la consulta o la conexión
        JOptionPane.showMessageDialog(null, "Error al llenar el comboBox: " + e.getMessage());
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
}
