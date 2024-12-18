package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;

public class bdControlvacu extends Control_Vacunas {

    private conexion Base;

    public bdControlvacu() {
    }

    public bdControlvacu(conexion Base) {
        this.Base = Base;
    }

    public bdControlvacu(String ID, int DOSIS, Date FECHA, String ID_VACUNA, String ID_MASCOTA) {
        super(ID, DOSIS, FECHA, ID_VACUNA, ID_MASCOTA);
    }

    public bdControlvacu(int DOSIS, Date FECHA, String ID_VACUNA, String ID_MASCOTA) {
        super(DOSIS, FECHA, ID_VACUNA, ID_MASCOTA);
    }
public void INSERTAR(int DOSIS, Date FECHA, String ID_VACUNA, String ID_MASCOTA) {
    String SQL = "INSERT INTO CONTROLVACUNA (DOSIS, FECHA, ID_VACUNA, ID_MASCOTA) VALUES (?, ?, ?, ?)";

    try (Connection CONNECTION = Base.conectar();
         PreparedStatement PREPARED_STATEMENT = CONNECTION.prepareStatement(SQL)) {

        // Convertir la fecha a SQL Date
        java.sql.Date SQL_FECHA = new java.sql.Date(FECHA.getTime());

      
        
        
        System.out.println("Dosis: " + DOSIS);
        System.out.println("Fecha: " + SQL_FECHA);
        System.out.println("ID Vacuna: " + ID_VACUNA);
        System.out.println("ID Mascota: " + ID_MASCOTA);

        // Setear los valores
        PREPARED_STATEMENT.setInt(1, DOSIS);
        PREPARED_STATEMENT.setDate(2, SQL_FECHA);
        PREPARED_STATEMENT.setString(3, ID_VACUNA);  
        PREPARED_STATEMENT.setString(4, ID_MASCOTA); 

        // Ejecutar la consulta de inserción
        int ROWS_AFFECTED = PREPARED_STATEMENT.executeUpdate();
        if (ROWS_AFFECTED > 0) {
            JOptionPane.showMessageDialog(null, "CONTROL DE VACUNA AGREGADO EXITOSAMENTE");
            System.out.println("Inserción exitosa. Filas afectadas: " + ROWS_AFFECTED);
        } else {
            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR EL CONTROL DE LA VACUNA");
            System.out.println("Inserción fallida. Filas afectadas: " + ROWS_AFFECTED);
        }

    } catch (SQLException E) {
        JOptionPane.showMessageDialog(null, "ERROR AL AGREGAR EL CONTROL DE LA VACUNA: " + E.getMessage());
        System.out.println("Error SQL: " + E.getMessage());
        E.printStackTrace();
    } catch (Exception E) {
        JOptionPane.showMessageDialog(null, "ERROR INESPERADO: " + E.getMessage());
        System.out.println("Error inesperado: " + E.getMessage());
        E.printStackTrace();
    }
}

public void ComboboxVacuna(JComboBox<String> comboBox) {
    String sql = "SELECT ID, INITCAP(NOMBRE) AS NOMBRE FROM VACUNA";
    try (Connection connection = Base.conectar();
         PreparedStatement preparedStatement = connection.prepareStatement(sql);
         ResultSet resultSet = preparedStatement.executeQuery()) {

        // Limpiar el comboBox antes de llenarlo
        comboBox.removeAllItems();
        boolean existeVacuna = false;

        while (resultSet.next()) {
            existeVacuna = true;
            String id = resultSet.getString("ID");
            String nombre = resultSet.getString("NOMBRE");

            String itemComboBox = id + " " + nombre;
            System.out.println("Vacuna encontrada: " + itemComboBox);

            comboBox.addItem(itemComboBox);
        }

        if (!existeVacuna) {
            System.out.println("No se encontraron vacunas");
            comboBox.addItem("No hay Vacunas registradas");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al llenar el comboBox de vacunas: " + e.getMessage());
        System.out.println("Error SQL al llenar el comboBox de vacunas: " + e.getMessage());
        e.printStackTrace();
    }
}

public void ComboboxMascota(JComboBox<String> comboBox) {
    String sql = "SELECT ID, INITCAP(NOMBRE) AS NOMBRE FROM MASCOTA";
    try (Connection connection = Base.conectar();
         PreparedStatement preparedStatement = connection.prepareStatement(sql);
         ResultSet resultSet = preparedStatement.executeQuery()) {

        // Limpiar el comboBox antes de llenarlo
        comboBox.removeAllItems();
        boolean existeMascota = false;

        while (resultSet.next()) {
            existeMascota = true;
            String id = resultSet.getString("ID");
            String nombre = resultSet.getString("NOMBRE");

            String itemComboBox = id + " " + nombre;
            System.out.println("Mascota encontrada: " + itemComboBox);

            comboBox.addItem(itemComboBox);
        }

        if (!existeMascota) {
            System.out.println("No se encontraron mascotas");
            comboBox.addItem("No hay mascotas registradas");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al llenar el comboBox de mascotas: " + e.getMessage());
        System.out.println("Error SQL al llenar el comboBox de mascotas: " + e.getMessage());
        e.printStackTrace();
    }
}
}
