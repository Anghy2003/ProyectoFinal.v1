
package Conexion;

import com.db4o.*;
import com.db4o.ext.Db4oIOException;
import javax.swing.JOptionPane;

public class Conexion_db {

    public static ObjectContainer ConectarBD() {
        try {
            ObjectContainer baseDatos = Db4o
                    .openFile("C:\\BaseDeDatos\\BaseFinal.yap");

            return baseDatos;
        } catch (Db4oIOException e) {
            System.out.println("¡RUTA de base de datos no encontrada!\nDetalles del error:" + e);
            JOptionPane.showMessageDialog(null, "¡RUTA de base de datos no encontrada!\nDetalles del error: " + e);
        }
        return null;
    }

    public static void cerrar_BD(ObjectContainer BaseFinal) {
        if (BaseFinal != null && !BaseFinal.ext().isClosed()) {
            BaseFinal.close();
        }
    }
}
