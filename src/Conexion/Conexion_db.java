/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
            JOptionPane.showMessageDialog(null,"¡RUTA de base de datos no encontrada!\nDetalles del error: " + e);
        }
        return null;
    }
}
