/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 *
 * @author aberr
 */
public class conexion {

    private Connection conn = null;
    private String URL, USUARIO, CONTRA;

    public conexion() {
        conectar();
    }

    public void conectar() {
        Scanner numero = new Scanner(System.in);
        int opcion = 0;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            URL = "jdbc:oracle:thin:@localhost:1521:XE";
            USUARIO = "BaseU4";
            CONTRA = "123";
            conn = DriverManager.getConnection(URL, USUARIO, CONTRA);
            System.out.println("Conectado ala base");
        } catch (Exception e) {
            System.err.println("Error,de la base no se conecto");
        }
    }

    public void desconectar() {
        try {
            conn.close();
        } catch (Exception e) {
            System.err.println("Error,no se pudo desconectar");
        }

    }
}
