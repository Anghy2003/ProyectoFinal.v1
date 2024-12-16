package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import javax.swing.JOptionPane;

/**
 *
 * @author aberr
 */
public class MascotaDb extends Mascotas {

    //agrego la base
    private conexion Base;

    //constructor con la base
    public MascotaDb(conexion Base) {
        this.Base = Base;
    }

    

    //constructor con atributos

    public MascotaDb(String ID, String NOMBRE, String ESPECIE, String RAZA, String CEDULA_DUEÑO, Date FECHANACIMIENTO) {
        super(ID, NOMBRE, ESPECIE, RAZA, CEDULA_DUEÑO, FECHANACIMIENTO);
    }

    public MascotaDb(String NOMBRE, String ESPECIE, String RAZA, String CEDULA_DUEÑO, Date FECHANACIMIENTO) {
        super(NOMBRE, ESPECIE, RAZA, CEDULA_DUEÑO, FECHANACIMIENTO);
    }
    
    
    
    
    
//    public void insertar(String NOMBRE, String ESPECIE, String RAZA, String CEDULA_DUEÑO, Date FECHANACIMIENTO) {
//    
//    // Verificar si la mascota ya existe
//    if (verificarMascota(NOMBRE, CEDULA_DUEÑO)) {
//        JOptionPane.showMessageDialog(null, "La Mascota con nombre: " + NOMBRE + " y Dueño: " + CEDULA_DUEÑO + " ya existe en la base de datos.");
//        return; // Salir del método si la mascota ya existe
//    }
//
//    // Si no existe, proceder a insertar
//    String sql = "INSERT INTO MASCOTA (NOMBRE, ESPECIE, RAZA, CEDULA_DUEÑO, ID_MASCOTA, FECHANACIMIENTO) "
//               + "VALUES (INITCAP(?), INITCAP(?), INITCAP(?), ?, ?, ?)";
//
//    try (Connection connection = Base.conectarBD();
//         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//
//        // Establecer los parámetros
//        preparedStatement.setString(1, NOMBRE);
//        preparedStatement.setString(2, ESPECIE);
//        preparedStatement.setString(3, RAZA);
//        preparedStatement.setString(4, CEDULA_DUEÑO);
//        preparedStatement.setString(5, generarIdMascota());
//        preparedStatement.setString(6, FECHANACIMIENTO);
//
//        // Convertir FECHANACIMIENTO a Date y pasarlo a setDate
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        java.util.Date parsedDate = format.parse(FECHANACIMIENTO);
//        java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());
//        preparedStatement.setDate(6, sqlDate);
//
//        int rowsAffected = preparedStatement.executeUpdate();
//        if (rowsAffected > 0) {
//            JOptionPane.showMessageDialog(null, "Mascota agregada exitosamente.");
//        } else {
//            JOptionPane.showMessageDialog(null, "No se pudo agregar la mascota.");
//        }
//    } catch (SQLException e) {
//        JOptionPane.showMessageDialog(null, "Error al agregar la mascota.");
//        e.printStackTrace();
//    } catch (ParseException e) {
//        JOptionPane.showMessageDialog(null, "Error al procesar la fecha.");
//        e.printStackTrace();
//    }
//}
    public void insertar(String NOMBRE, String ESPECIE, String RAZA, String CEDULA_DUEÑO, Date FECHANACIMIENTO) {
    // Verificar si la mascota ya existe
    if (verificarMascota(NOMBRE, CEDULA_DUEÑO)) {
        JOptionPane.showMessageDialog(null, "La Mascota con nombre: " + NOMBRE + " y Dueño: " + CEDULA_DUEÑO + " ya existe en la base de datos.");
        return; // Salir del método si la mascota ya existe
    }

    // Consulta SQL para insertar datos
    String sql = "INSERT INTO MASCOTA (NOMBRE, ESPECIE, RAZA, CEDULA_DUEÑO, FECHANACIMIENTO) "
               + "VALUES (INITCAP(?), INITCAP(?), INITCAP(?), ?, ?)";

    try (Connection connection = Base.conectarBD();
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

        // Establecer los parámetros de la consulta
        preparedStatement.setString(1, NOMBRE);
        preparedStatement.setString(2, ESPECIE);
        preparedStatement.setString(3, RAZA);
        preparedStatement.setString(4, CEDULA_DUEÑO);
        
        // Convertir FECHANACIMIENTO a java.sql.Date y asignarlo
        java.sql.Date sqlDate = new java.sql.Date(FECHANACIMIENTO.getTime());
        preparedStatement.setDate(5, sqlDate);

        // Ejecutar la consulta
        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Mascota agregada exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo agregar la mascota.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al agregar la mascota: " + e.getMessage());
        e.printStackTrace();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
        e.printStackTrace();
    }
}
    



    
    

    // Método auxiliar para verificar si una fecha es válida
    private boolean esFechaValida(String fecha) {
        // Definir el formato esperado: "YYYY-MM-DD"
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false); // No permitir fechas no estrictas como "2023-02-30"

        try {
            dateFormat.parse(fecha); // Intentar parsear la fecha
            return true; // Si no lanza excepción, es válida
        } catch (ParseException e) {
            return false; // Si ocurre una excepción, la fecha no es válida
        }
    }

    //verificarMascota
    public boolean verificarMascota(String NOMBRE, String CEDULA_DUEÑO) {
        String sql = "SELECT COUNT(*) FROM MASCOTA WHERE NOMBRE = INITCAP(?) AND CEDULA_DUEÑO = ?";

        try (Connection connection = Base.conectarBD();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            // Establecer los parámetros de la consulta
            preparedStatement.setString(1, NOMBRE);
            preparedStatement.setString(2, CEDULA_DUEÑO);

            // Ejecutar la consulta
            ResultSet resultSet = preparedStatement.executeQuery();

            // Verificar si se encontró algún registro
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;  // Si count > 0, significa que ya existe 
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al verificar la mascota.");
            e.printStackTrace();
        }

        // Si no se encontró ninguna coincidencia, retornar false
        return false;
    }

}
