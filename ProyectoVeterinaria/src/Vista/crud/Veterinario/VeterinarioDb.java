/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.crud.Veterinario;

import Modelo.conexion;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class VeterinarioDb extends Modelo.VETERINARIO {

    //agrego la base
    private conexion Base;

    //constructor con la base
    public VeterinarioDb(conexion Base) {
        this.Base = Base;
    }

    //Constructores
    public VeterinarioDb() {
    }

    public VeterinarioDb(String ID, String CEDULA, String NOMBRE, String DIRECCION, String CELULAR) {
        super(ID, CEDULA, NOMBRE, DIRECCION, CELULAR);
    }

    public VeterinarioDb(String CEDULA, String NOMBRE, String DIRECCION, String CELULAR) {
        super(CEDULA, NOMBRE, DIRECCION, CELULAR);
    }

   
    // Verificar si un veterinario con la cédula ya existe
    public boolean verificarVeterinario(String cedula) {
    String sql = "SELECT COUNT(*) FROM veterinario WHERE cedula = ?";
    try (Connection connection = Base.conectarBD();
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

        // Establecer el parámetro de la consulta
        preparedStatement.setString(1, cedula); // Usar índice 1 porque es el primer y único parámetro

        // Ejecutar la consulta
        ResultSet resultSet = preparedStatement.executeQuery();

        // Verificar si se encontró algún registro
        if (resultSet.next()) {
            int count = resultSet.getInt(1);
            return count > 0; // Si count > 0, significa que ya existe
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al verificar el veterinario: " + e.getMessage());
        e.printStackTrace();
    }

    return false;
}

    // Método para agregar un veterinario
    public void agregarVeterinario(String cedula, String nombre, String direccion, String celular) {
        // Verificar si el veterinario ya existe
        if (verificarVeterinario(cedula)) {
            JOptionPane.showMessageDialog(null, "El veterinario con cédula: " + cedula + " ya existe en la base de datos.");
            return;
        }

        String sql = "INSERT INTO veterinario (cedula, nombre, direccion, celular) VALUES (INITCAP(?), INITCAP(?), INITCAP(?), ?)";
        try ( Connection connection = Base.conectarBD();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, cedula);
            preparedStatement.setString(2, nombre);
            preparedStatement.setString(3, direccion);
            preparedStatement.setString(4, celular);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Veterinario agregado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar el veterinario.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el veterinario: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Método para editar un veterinario
    public void editarVeterinario(int id, String cedula, String nombre, String direccion, String celular) {
        if (verificarVeterinario(cedula)) {
            JOptionPane.showMessageDialog(null, "El veterinario con cédula: " + cedula + " ya existe en la base de datos.");
            return;
        }

        String sql = "UPDATE veterinario SET cedula = INITCAP(?), nombre = INITCAP(?), direccion = INITCAP(?), celular = ? WHERE id = ?";
        try (Connection connection = Base.conectarBD();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, cedula);
            preparedStatement.setString(2, nombre);
            preparedStatement.setString(3, direccion);
            preparedStatement.setString(4, celular);
            preparedStatement.setInt(5, id);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Veterinario actualizado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el veterinario.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el veterinario: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Método para eliminar un veterinario
    public void eliminarVeterinario(int id) {
        String sql = "DELETE FROM veterinario WHERE id = ?";
        try ( Connection connection = Base.conectarBD();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Veterinario eliminado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el veterinario.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el veterinario: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
  public void llenarComboBoxVeterinarios(JComboBox<String> comboBox) {
    // Consulta SQL para obtener la cédula y el nombre de los veterinarios
    String sql = "SELECT CEDULA, INITCAP(NOMBRE) AS NOMBRE FROM BaseU4COPY.VETERINARIO";

    try (Connection connection = Base.conectarBD();
         PreparedStatement preparedStatement = connection.prepareStatement(sql);
         ResultSet resultSet = preparedStatement.executeQuery()) {

        // Limpiar el comboBox antes de llenarlo
        comboBox.removeAllItems();

        boolean existeVete = false;

        // Procesar resultados
        while (resultSet.next()) {
            existeVete = true;
            String cedula = resultSet.getString("CEDULA"); // Obtener la cédula del veterinario
            String nombre = resultSet.getString("NOMBRE"); // Obtener el nombre

            // Formatear el texto para el comboBox: "Cédula - Nombre"
            String itemComboBox = cedula + " " + nombre;

            System.out.println("Veterinario encontrado: " + itemComboBox);

            // Agregar el item al ComboBox
            comboBox.addItem(itemComboBox);
        }

        // Si no hay registros, mostrar un mensaje en el comboBox
        if (!existeVete) {
            System.out.println("No se encontraron veterinarios.");
            comboBox.addItem("No hay veterinarios registrados");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al llenar el comboBox: " + e.getMessage());
        e.printStackTrace();
    }
}

    // Obtener lista de veterinarios
//    public List<Veterinario> obtenerVeterinarios() {
//        List<Veterinario> veterinarios = new ArrayList<>();
//        String sql = "SELECT * FROM veterinario";
//        try ( Statement statement = connection.createStatement();  ResultSet resultSet = statement.executeQuery(sql)) {
//            while (resultSet.next()) {
//                veterinarios.add(new Veterinario(
//                        resultSet.getInt("id"),
//                        resultSet.getString("cedula"),
//                        resultSet.getString("nombre"),
//                        resultSet.getString("direccion"),
//                        resultSet.getString("celular")
//                ));
//            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error al obtener los veterinarios: " + e.getMessage());
//            e.printStackTrace();
//        }
//        return veterinarios;
//    }

}
