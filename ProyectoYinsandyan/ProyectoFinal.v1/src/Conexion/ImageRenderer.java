
package Conexion;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;




//para usar imagenes en un jlabel
public class ImageRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (value instanceof JLabel) {
            JLabel lbl = (JLabel) value;
            return lbl;
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
    
    
    //mostrar icono en la celda
    public void setValue(Object value) {
        if (value instanceof JLabel) {
            JLabel label = (JLabel) value;
            setIcon(label.getIcon());
        } else {
            setText((value == null) ? "" : value.toString());
        }
    }
    
}