package Modelo;

import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import rojeru_san.RSMTextFull;

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
                PreparedStatement datosisrt = CONNECTION.prepareStatement(SQL)) {
            // Convertir la fecha a SQL Date
            java.sql.Date SQL_FECHA = new java.sql.Date(FECHA.getTime());

            // Setear los valores
            datosisrt.setInt(1, DOSIS);
            datosisrt.setDate(2, SQL_FECHA);
            datosisrt.setString(3, ID_VACUNA);
            datosisrt.setString(4, ID_MASCOTA);

            // Ejecutar la consulta de inserción
            int ROWS_AFFECTED = datosisrt.executeUpdate();
            if (ROWS_AFFECTED > 0) {
                JOptionPane.showMessageDialog(null, "CONTROL DE VACUNA AGREGADO EXITOSAMENTE");
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR EL CONTROL DE LA VACUNA");
            }
        } catch (SQLException E) {
            JOptionPane.showMessageDialog(null, "ERROR AL AGREGAR EL CONTROL DE LA VACUNA: " + E.getMessage());
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "ERROR INESPERADO: " + E.getMessage());
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
                comboBox.addItem(itemComboBox);
            }
            if (!existeVacuna) {
               comboBox.addItem("No hay Vacunas registradas");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al llenar el comboBox de vacunas: " + e.getMessage());

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
                comboBox.addItem(itemComboBox);
            }
            if (!existeMascota) {
                comboBox.addItem("No hay mascotas registradas");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al llenar el comboBox de mascotas: " + e.getMessage());

            e.printStackTrace();
        }
    }

    public void ComboboxControlVacuna(JComboBox<String> comboBox) {
        String sql = "SELECT ID FROM CONTROLVACUNA"; 
        try (Connection connection = Base.conectar();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery()) {
            comboBox.removeAllItems();
            boolean existeControlVacuna = false;
            while (resultSet.next()) {
                existeControlVacuna = true;
                int idControlVacuna = resultSet.getInt("ID"); 
                String itemComboBox = String.valueOf(idControlVacuna);  
                comboBox.addItem(itemComboBox); 
            }
            if (!existeControlVacuna) {
                comboBox.addItem("No hay controles de vacunas registrados");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al llenar el comboBox de controles de vacunas: " + e.getMessage());

            e.printStackTrace();
        }
    }
 public void cargardatos(JTable tablaVacunas, conexion Base) {
        String sql = "SELECT * FROM CONTROLVACUNA";  // Ajusta la consulta según tu necesidad
        try (Connection connection = Base.conectar();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ResultSet llenar = ps.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("DOSIS");
            modelo.addColumn("FECHA");
            modelo.addColumn("ID_VACUNA");
            modelo.addColumn("ID_MASCOTA");
            modelo.setRowCount(0);

            while (llenar.next()) {
                Object[] row = new Object[5];
                row[0] = llenar.getInt("ID");
                row[1] = llenar.getInt("DOSIS");
                row[2] = llenar.getDate("FECHA");
                row[3] = llenar.getString("ID_VACUNA");
                row[4] = llenar.getString("ID_MASCOTA");

                modelo.addRow(row);
            }

            tablaVacunas.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos: " + e.getMessage());
            e.printStackTrace();
        }
    }
public void eliminar(String ID) {

    String sql = "DELETE FROM CONTROLVACUNA WHERE ID = ?";

    try (Connection connection = Base.conectar();
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

        preparedStatement.setString(1, ID);

        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Control de vacuna eliminado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el control de la vacuna");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar el control de vacuna: " + e.getMessage());
        e.printStackTrace();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
        e.printStackTrace();
    }
}
public boolean verificarControlVacuna(String ID) {
    String sql = "SELECT COUNT(*) FROM CONTROLVACUNA WHERE ID = ?";
    try (Connection connection = Base.conectar();
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

        preparedStatement.setString(1, ID);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            int count = resultSet.getInt(1);
            return count > 0;
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al verificar el control de vacuna: " + e.getMessage());
        e.printStackTrace();
    }
    return false;
}
public void editarControlVacuna(String idControlVacuna, int dosis, Date fecha, String idVacuna, String idMascota) {

    String sql = "UPDATE CONTROLVACUNA SET DOSIS = ?, FECHA = ?, ID_VACUNA = ?, ID_MASCOTA = ? WHERE ID = ?";

    try (Connection connection = Base.conectar();
         PreparedStatement ps = connection.prepareStatement(sql)) {
        
        ps.setInt(1, dosis);
        ps.setDate(2, new java.sql.Date(fecha.getTime()));
        ps.setString(3, idVacuna);
        ps.setString(4, idMascota);
        ps.setString(5, idControlVacuna);
        
        if (ps.executeUpdate() > 0) {
            JOptionPane.showMessageDialog(null, "Control de vacuna actualizado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el control de vacuna");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar el control de vacuna: " + e.getMessage());
        e.printStackTrace();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
        e.printStackTrace();
    }
}
public void cargarControlVacuna(String idControlVacuna, JComboBox<String> cmbVacunas, JComboBox<String> cmbMascota, RSMTextFull txtDOsis, JDateChooser jDateChooser1) {
    String sql = "SELECT * FROM CONTROLVACUNA WHERE ID = ?";

    try (Connection connection = Base.conectar();
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

        preparedStatement.setString(1, idControlVacuna);
        
        // Ejecutamos la consulta
        ResultSet rs = preparedStatement.executeQuery();

        if (rs.next()) {
            // Asignamos los valores obtenidos a los campos correspondientes
            txtDOsis.setText(String.valueOf(rs.getInt("DOSIS")));
            jDateChooser1.setDate(rs.getDate("FECHA"));

            // Cargar los ComboBox
            String idVacuna = rs.getString("ID_VACUNA");
            String idMascota = rs.getString("ID_MASCOTA");

            // Establecer los valores seleccionados en los ComboBox
            setComboBoxSelection(cmbVacunas, idVacuna);
            setComboBoxSelection(cmbMascota, idMascota);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron datos para el control de vacuna con ID: " + idControlVacuna);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al cargar los datos del control de vacuna: " + e.getMessage());
        e.printStackTrace();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
        e.printStackTrace();
    }
}

private void setComboBoxSelection(JComboBox<String> comboBox, String id) {
    for (int i = 0; i < comboBox.getItemCount(); i++) {
        String item = comboBox.getItemAt(i);
        if (item.split(" ")[0].equals(id)) {  // Compara solo el ID
            comboBox.setSelectedIndex(i);
            break;
        }
    }

}}
