package DUENO;

import Modelo.*;
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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aberr
 */
public class DuenoDb extends DUEÑO {

    //agrego la base
    private conexion Base;

    //constructor con la base
    public DuenoDb(conexion Base) {
        this.Base = Base;
    }

    //constructor con atributos
    public DuenoDb(String ID, String CEDULA, String NOMBRE, String APELLIDO, String DIRECCION, String TELEFONO) {
        super(ID, CEDULA, NOMBRE, APELLIDO, DIRECCION, TELEFONO);
    }

    public DuenoDb(String CEDULA, String NOMBRE, String APELLIDO, String DIRECCION, String TELEFONO) {
        super(CEDULA, NOMBRE, APELLIDO, DIRECCION, TELEFONO);
    }

    public boolean guardarDueno(String cedula, String nombre, String apellido, String direccion, String telefono) {
        // Verificar si la cédula ya existe
        if (verificarCedulaExistente(cedula)) {
            JOptionPane.showMessageDialog(null, "La cédula ya existe en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            return false; // No se guarda el dueño si la cédula ya existe
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        boolean resultado = false;

        String sql = "INSERT INTO DUENO (CEDULA, NOMBRE, APELLIDO, DIRECCION, TELEFONO) VALUES (?, ?, ?, ?, ?)";

        try {
            // Establecer conexión a la base de datos usando Base.conectarBD()
            connection = Base.conectarBD();
            preparedStatement = connection.prepareStatement(sql);

            // Formatear los datos a InitCap
            nombre = toInitCap(nombre);
            apellido = toInitCap(apellido);
            direccion = toInitCap(direccion); // Si deseas también formatear la dirección

            // Asignar valores a los parámetros de la consulta
            preparedStatement.setString(1, cedula);
            preparedStatement.setString(2, nombre);
            preparedStatement.setString(3, apellido);
            preparedStatement.setString(4, direccion);
            preparedStatement.setString(5, telefono);

            // Ejecutar la inserción
            int filasAfectadas = preparedStatement.executeUpdate();
            resultado = filasAfectadas > 0; // Si se insertó al menos una fila, el resultado es verdadero

            if (resultado) {
                JOptionPane.showMessageDialog(null, "Dueño guardado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar el dueño.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el dueño en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Cerrar recursos
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        return resultado;
    }

    public boolean verificarCedulaExistente(String cedula) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        boolean existe = false;

        String sql = "SELECT COUNT(*) FROM DUENO WHERE CEDULA = ?";

        try {
            // Establecer conexión a la base de datos usando Base.conectarBD()
            connection = Base.conectarBD();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cedula);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                existe = resultSet.getInt(1) > 0; // Si el conteo es mayor que 0, la cédula existe
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al verificar la cédula en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Cerrar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        return existe;
    }

    // Método para formatear cadenas a InitCap
    private String toInitCap(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String[] words = str.split(" ");
        StringBuilder initCapStr = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                initCapStr.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return initCapStr.toString().trim(); // Eliminar el espacio final
    }

    public void llenarComboBoxBuscar(JComboBox<String> comboBox) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String sql = "SELECT CEDULA, NOMBRE, APELLIDO FROM DUENO";

        try {
            // Limpiar el JComboBox antes de llenarlo
            comboBox.removeAllItems();

            // Establecer conexión a la base de datos usando Base.conectarBD()
            connection = Base.conectarBD();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            // Verificar si hay resultados
            if (!resultSet.isBeforeFirst()) { // Si no hay resultados
                comboBox.addItem("Sin propietarios");
            } else {
                // Llenar el JComboBox con los dueños existentes
                while (resultSet.next()) {
                    String cedula = resultSet.getString("CEDULA");
                    String nombre = resultSet.getString("NOMBRE");
                    String apellido = resultSet.getString("APELLIDO");
                    String item = cedula + "  " + nombre + " " + apellido; // Formato del ítem
                    comboBox.addItem(item);
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los propietarios: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Cerrar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
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

    public String obtenerNombrePorCedula(String cedula) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String nombre = null;

        String sql = "SELECT NOMBRE FROM DUENO WHERE CEDULA = ?";

        try {
            connection = Base.conectarBD();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cedula);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                nombre = resultSet.getString("NOMBRE");
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener el nombre: " + e.getMessage());
        } finally {
            // Cerrar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }

        return nombre;
    }

    public String obtenerApellidoPorCedula(String cedula) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String apellido = null;

        String sql = "SELECT APELLIDO FROM DUENO WHERE CEDULA = ?";

        try {
            connection = Base.conectarBD();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cedula);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                apellido = resultSet.getString("APELLIDO");
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener el apellido: " + e.getMessage());
        } finally {
            // Cerrar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }

        return apellido;
    }

    public String obtenerDireccionPorCedula(String cedula) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String direccion = null;

        String sql = "SELECT DIRECCION FROM DUENO WHERE CEDULA = ?";

        try {
            connection = Base.conectarBD();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cedula);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                direccion = resultSet.getString("DIRECCION");
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener la dirección: " + e.getMessage());
        } finally {
            // Cerrar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }

        return direccion;
    }

    public String obtenerTelefonoPorCedula(String cedula) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String telefono = null;

        String sql = "SELECT TELEFONO FROM DUENO WHERE CEDULA = ?";

        try {
            // Establecer conexión a la base de datos usando Base.conectarBD()
            connection = Base.conectarBD();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cedula);
            resultSet = preparedStatement.executeQuery();

            // Verificar si hay resultados
            if (resultSet.next()) {
                telefono = resultSet.getString("TELEFONO");
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener el teléfono: " + e.getMessage());
        } finally {
            // Cerrar recursos
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }

        return telefono;
    }

    public boolean eliminarDuenoPorCedula(String cedula) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        boolean resultado = false;

        // Preguntar al usuario si está seguro de eliminar
        int confirmacion = JOptionPane.showConfirmDialog(null,
                "¿Está seguro de que desea eliminar al dueño con cédula " + cedula + "?",
                "Confirmar Eliminación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        // Si el usuario selecciona "Sí"
        if (confirmacion == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM DUENO WHERE CEDULA = ?";

            try {
                // Establecer conexión a la base de datos usando Base.conectarBD()
                connection = Base.conectarBD();
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, cedula);

                // Ejecutar la eliminación
                int filasAfectadas = preparedStatement.executeUpdate();
                resultado = filasAfectadas > 0; // Si se eliminó al menos una fila, el resultado es verdadero

                if (resultado) {
                    JOptionPane.showMessageDialog(null, "Dueño eliminado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró un dueño con la cédula proporcionada.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al eliminar el dueño: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                // Cerrar recursos
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Eliminación cancelada.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
        }

        return resultado;
    }

    public boolean actualizarDueno(String cedula, String nombre, String apellido, String direccion, String telefono) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        boolean resultado = false;

        String sql = "UPDATE DUENO SET NOMBRE = ?, APELLIDO = ?, DIRECCION = ?, TELEFONO = ? WHERE CEDULA = ?";

        try {
            // Establecer conexión a la base de datos usando Base.conectarBD()
            connection = Base.conectarBD();
            preparedStatement = connection.prepareStatement(sql);

            // Formatear los datos a InitCap
            nombre = toInitCap(nombre);
            apellido = toInitCap(apellido);
            direccion = toInitCap(direccion); // Si deseas también formatear la dirección

            // Asignar valores a los parámetros de la consulta
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido);
            preparedStatement.setString(3, direccion);
            preparedStatement.setString(4, telefono);
            preparedStatement.setString(5, cedula); // Asignar la cédula del dueño a actualizar

            // Ejecutar la actualización
            int filasAfectadas = preparedStatement.executeUpdate();
            resultado = filasAfectadas > 0; // Si se actualizó al menos una fila, el resultado es verdadero

            if (resultado) {
                JOptionPane.showMessageDialog(null, "Dueño actualizado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el dueño. Verifique la cédula.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el dueño en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Cerrar recursos
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        return resultado;
    }

    public void cargarDatosEnTabla(JTable tabla) {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID");
    modelo.addColumn("CEDULA");
    modelo.addColumn("NOMBRE");
    modelo.addColumn("APELLIDO");
    modelo.addColumn("DIRECCION");
    modelo.addColumn("TELEFONO");

    Connection connection = Base.conectarBD(); // Asegúrate de que este método esté en la clase correspondiente
    String query = "SELECT ID, CEDULA, NOMBRE, APELLIDO, DIRECCION, TELEFONO FROM DUENO"; // Cambia "MASCOTA" por el nombre correcto de tu tabla si es necesario

    try {
        java.sql.Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            Object[] fila = new Object[6];
            fila[0] = resultSet.getInt("ID");
            fila[1] = resultSet.getString("CEDULA");
            fila[2] = resultSet.getString("NOMBRE");
            fila[3] = resultSet.getString("APELLIDO");
            fila[4] = resultSet.getString("DIRECCION");
            fila[5] = resultSet.getString("TELEFONO");
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
    
    
    public static boolean verificarTelefono(String telefono) {
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
