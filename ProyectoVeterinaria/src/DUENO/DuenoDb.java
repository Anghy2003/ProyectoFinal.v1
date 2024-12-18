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

}
