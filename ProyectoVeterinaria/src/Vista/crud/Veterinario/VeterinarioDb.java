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
import javax.swing.JTextField;

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
        try ( Connection connection = Base.conectarBD();  PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

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
        try ( Connection connection = Base.conectarBD();  PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
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

    public void modificarVeterinario(String cedula, String nombre, String direccion, String celular) {
    String sql = "UPDATE VETERINARIO SET NOMBRE = ?, DIRECCION = ?, CELULAR = ? WHERE CEDULA = ?";

    try (Connection connection = Base.conectarBD();
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

        // Establecer los nuevos valores
        preparedStatement.setString(1, nombre);
        preparedStatement.setString(2, direccion);
        preparedStatement.setString(3, celular);
        preparedStatement.setString(4, cedula);

        int rowsUpdated = preparedStatement.executeUpdate();

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Veterinario modificado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo modificar el veterinario.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al modificar el veterinario: " + e.getMessage());
        e.printStackTrace();
    }
}

    // Método para eliminar un veterinario
   public boolean eliminarVeterinarioPorCedula(String cedulaVeterinario) {
    String sql = "DELETE FROM VETERINARIO WHERE CEDULA = ?";

    try (Connection connection = Base.conectarBD();
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

        // Establecer el parámetro de la consulta
        preparedStatement.setString(1, cedulaVeterinario);

        // Ejecutar la consulta
        int filasAfectadas = preparedStatement.executeUpdate();

        // Retornar true si al menos una fila fue afectada
        return filasAfectadas > 0;

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar el veterinario: " + e.getMessage());
        e.printStackTrace();
    }
    return false;
}

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

  public void obtenerVeterinarioPorCedula(String cedulaVeterinario, JTextField txtCedula, JTextField txtNombre, JTextField txtDireccion, JTextField txtCelular) {
    String sql = "SELECT NOMBRE, DIRECCION, CELULAR FROM VETERINARIO WHERE CEDULA = ?";

    try (Connection connection = Base.conectarBD();
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

        // Configurar el parámetro de la consulta
        preparedStatement.setString(1, cedulaVeterinario);

        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                // Llenar los campos de texto con los valores obtenidos
                txtCedula.setText(cedulaVeterinario); // Mostrar la cédula en su JTextField
                txtNombre.setText(resultSet.getString("NOMBRE"));
                txtDireccion.setText(resultSet.getString("DIRECCION"));
                txtCelular.setText(resultSet.getString("CELULAR"));
            } else {
                JOptionPane.showMessageDialog(null, "Veterinario no encontrado.");
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener los datos del veterinario: " + e.getMessage());
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
