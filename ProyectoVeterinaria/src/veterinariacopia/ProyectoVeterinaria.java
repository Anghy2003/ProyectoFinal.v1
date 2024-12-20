/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinariacopia;

import Modelo.conexion;
import Vista.menu.Menu;
import java.sql.Connection;

/**
 *
 * @author aberr
 */
public class ProyectoVeterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        conexion con = new conexion();
          con.conectar();

        Menu menuxito=new Menu();
        menuxito.setVisible(true);
    }
    private Connection conn;
    
}
