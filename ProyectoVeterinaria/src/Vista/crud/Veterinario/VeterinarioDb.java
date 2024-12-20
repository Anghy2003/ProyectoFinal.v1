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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
   
  public void cargarDatosEnTabla(JTable tabla) {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID");
    modelo.addColumn("CEDULA");
    modelo.addColumn("NOMBRE");
    modelo.addColumn("DIRECCION");
    modelo.addColumn("CELULAR");

    Connection connection = Base.conectarBD(); // Asegúrate de implementar correctamente este método
    String query = "SELECT ID, CEDULA, NOMBRE, DIRECCION, CELULAR FROM VETERINARIO";

    try {
        java.sql.Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            Object[] fila = new Object[5];
            fila[0] = resultSet.getInt("ID");
            fila[1] = resultSet.getString("CEDULA");
            fila[2] = resultSet.getString("NOMBRE");
            fila[3] = resultSet.getString("DIRECCION");
            fila[4] = resultSet.getString("CELULAR");
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
  
  public void filtrarVeterinariosPorCedula(JTable tabla, String prefijoCedula) {
    Connection connection = Base.conectarBD();
    if (connection == null) {
        System.out.println("No se pudo establecer la conexión a la base de datos.");
        return; // Salir del método si no hay conexión
    }

    // Consulta SQL para obtener los veterinarios filtrando por el prefijo de la cédula
    String query = "SELECT V.NOMBRE AS NOMBRE_VETERINARIO, " +
                   "V.CEDULA AS CEDULA_VETERINARIO, " +
                   "V.DIRECCION AS DIRECCION_VETERINARIO, " +
                   "V.CELULAR AS CELULAR_VETERINARIO " +
                   "FROM VETERINARIO V " +
                   "WHERE V.CEDULA LIKE ? " + // Filtrar por cédula
                   "ORDER BY V.NOMBRE";

    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Veterinario");
    model.addColumn("Cédula Veterinario");
    model.addColumn("Dirección");
    model.addColumn("Celular");

    try {
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, prefijoCedula + "%"); // Establecer el prefijo con el comodín

        ResultSet resultSet = preparedStatement.executeQuery();

        int rowCount = 0;
        while (resultSet.next()) {
            rowCount++;
            String nombreVeterinario = resultSet.getString("NOMBRE_VETERINARIO"); // Obtener el nombre del veterinario
            String cedulaVeterinario = resultSet.getString("CEDULA_VETERINARIO"); // Obtener la cédula del veterinario
            String direccionVeterinario = resultSet.getString("DIRECCION_VETERINARIO");
            String celularVeterinario = resultSet.getString("CELULAR_VETERINARIO");

            model.addRow(new Object[]{nombreVeterinario, cedulaVeterinario, direccionVeterinario, celularVeterinario});
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
  
  public static boolean validarCedula(String cedula) {
        // Verificar que la cédula tenga 10 dígitos
        if (cedula == null || cedula.length() != 10) {
            return false;
        }

        try {
            // Verificar que la cédula esté compuesta solo por números
            Long.parseLong(cedula);
        } catch (NumberFormatException e) {
            return false;
        }

        // Extraer los dígitos necesarios
        int provincia = Integer.parseInt(cedula.substring(0, 2));
        int tercerDigito = Integer.parseInt(cedula.substring(2, 3));

        // Verificar que el número de provincia sea válido (0-24)
        if (provincia < 0 || provincia > 24) {
            return false;
        }

        // Verificar que el tercer dígito sea menor que 6
        if (tercerDigito >= 6) {
            return false;
        }

        // Coeficientes para la validación de cédulas
        int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
        int total = 0;

        for (int i = 0; i < coeficientes.length; i++) {
            int digito = Character.getNumericValue(cedula.charAt(i));
            int producto = digito * coeficientes[i];

            if (producto >= 10) {
                producto -= 9;
            }

            total += producto;
        }

        // Verificar el dígito verificador
        int digitoVerificador = Character.getNumericValue(cedula.charAt(9));
        int modulo = total % 10;
        int valorVerificador = (modulo == 0) ? 0 : 10 - modulo;

        return valorVerificador == digitoVerificador;
    }
    
  private  static boolean validarNombre(String nombre) {
    // Verificar que el nombre no esté vacío y solo contenga letras y espacios
    return !nombre.isBlank() && nombre.matches("[A-Za-záéíóúÁÉÍÓÚñÑ ]+");
}
    
    public static  boolean verificarTelefono(String telefono) {
    // Verificamos que el teléfono no sea nulo y tenga al menos 2 caracteres
    if (telefono != null && telefono.length() >= 2) {
        // Obtenemos los primeros dos caracteres del teléfono
        String prefijo = telefono.substring(0, 2);
        // Comparamos con "07" y "09"
        return prefijo.equals("07") || prefijo.equals("09");
    }
    // Si el teléfono es nulo o tiene menos de 2 caracteres, retornamos falso
    return false;
}
    
 

}
