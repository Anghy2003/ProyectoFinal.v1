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
 * @author 59399
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
        while (opcion != 1 && opcion != 2) {
            System.out.println("Ingrese 1 si es Angi (localhost) o 2 si (otro)");
            opcion = numero.nextInt();
            if (opcion == 1) {
                //codigo Angi
                try {
                    Class.forName("oracle.jdbc.OracleDriver");
                    URL = "jdbc:oracle:thin:@localhost:1521:XE";
                    USUARIO = "C##ADMIS";
                    CONTRA = "1234";
                    conn = DriverManager.getConnection(URL, USUARIO, CONTRA);
                    System.out.println("Conectado ala base");
                } catch (Exception e) {
                    System.err.println("Error,de la base no se conecto");
                }

            } else if (opcion == 2) {
                try {
                    Class.forName("oracle.jdbc.OracleDriver");
                    URL = "jdbc:oracle:thin:@192.168.43.157:1521:XE";
                    USUARIO = "C##ADMIS";
                    CONTRA = "1234";
                    conn = DriverManager.getConnection(URL, USUARIO, CONTRA);
                    System.out.println("Conectado ala base");
                } catch (Exception e) {
                    System.err.println("Error,de la base no se conecto");
                }

            }

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
