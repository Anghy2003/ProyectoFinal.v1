package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class bdVacuna extends VACUNA {
    //agrego la base

    private conexion Base;

    public bdVacuna() {
    }
    

    //constructor con la base
    public bdVacuna(conexion Base) {
        this.Base = Base;
    }

    public bdVacuna(String ID, String TIPO, String NOMBRE, Date FECHA_CREACION, Date FECHA_EXPIRACION) {
        super(ID, TIPO, NOMBRE, FECHA_CREACION, FECHA_EXPIRACION);
    }

    public bdVacuna(String TIPO, String NOMBRE, Date FECHA_CREACION, Date FECHA_EXPIRACION) {
        super(TIPO, NOMBRE, FECHA_CREACION, FECHA_EXPIRACION);
    }

    public void insertar(String TIPO, String NOMBRE, Date FECHA_CREACION, Date FECHA_EXPIRACION) {

        if (verificarVacuna(NOMBRE)) {
           JOptionPane.showMessageDialog(null, "La Vacuna con  ese nombre: " + NOMBRE + " ya existe en la base de datos.");
            return;
    }
        String sql = "INSERT INTO VACUNA (TIPO, NOMBRE, FECHA_CREACION, FECHA_EXPIRACION) "
                + "VALUES (INITCAP(?), INITCAP(?), ?, ?)";

        try (Connection connection = Base.conectar();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            // CONVERTIR FECHAS 
            java.sql.Date sqlFechaCreacion = new java.sql.Date(FECHA_CREACION.getTime());
            java.sql.Date sqlFechaExpiracion = new java.sql.Date(FECHA_EXPIRACION.getTime());

            // ESTABLECER LOS PARAMETROS 
            preparedStatement.setString(1, TIPO);
            preparedStatement.setString(2, NOMBRE);
            preparedStatement.setDate(3, sqlFechaCreacion);
            preparedStatement.setDate(4, sqlFechaExpiracion);

            // EJECUTA LA CONSULTA
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Vacuna agregada exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar la Vacuna");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar la Vacuna: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
            e.printStackTrace();
        }     

    }

     public static void cargardatos(JTable tablaVacunas, conexion Base) {
    try (Connection connection = Base.conectar();
         PreparedStatement ps = connection.prepareStatement("SELECT * FROM VACUNA");
         ResultSet llenar = ps.executeQuery()) {
         //CREA EL MODELO 
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("TIPO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("FECHA_CREACION");
        modelo.addColumn("FECHA_EXPIRACION");
        modelo.setRowCount(0);

        //LLENA LA TABLA
        while (llenar.next()) {
            Object[] row = new Object[5]; 
            row[0] = llenar.getInt("ID"); 
            row[1] = llenar.getString("TIPO");
            row[2] = llenar.getString("NOMBRE");
            row[3] = llenar.getDate("FECHA_CREACION");
            row[4] = llenar.getDate("FECHA_EXPIRACION");

            modelo.addRow(row); //LIMPIA LA TABLA
        }

        tablaVacunas.setModel(modelo);

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al cargar los datos: " + e.getMessage());
        e.printStackTrace(); 
    }
}
    
    
    
   public void eliminar(String NOMBRE) {
        if (!verificarVacuna(NOMBRE)) {
        JOptionPane.showMessageDialog(null, "La vacuna con el nombre: " + NOMBRE + " no existe en la base de datos");
        return;
    }

    String sql = "DELETE FROM VACUNA WHERE NOMBRE = INITCAP(?)";

    try (Connection connection = Base.conectar();
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

        preparedStatement.setString(1, NOMBRE);

        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Vacuna eliminada exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar la vacuna");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar la vacuna: " + e.getMessage());
        e.printStackTrace();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
        e.printStackTrace();
    }
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public boolean verificarVacuna(String NOMBRE) {
    String sql = "SELECT COUNT(*) FROM VACUNA WHERE NOMBRE = ?";
    try (Connection connection = Base.conectar();
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

        preparedStatement.setString(1, NOMBRE);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            int count = resultSet.getInt(1);
            return count > 0;
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al verificar la vacuna: " + e.getMessage());
        e.printStackTrace();
    }
    return false;
}
}
