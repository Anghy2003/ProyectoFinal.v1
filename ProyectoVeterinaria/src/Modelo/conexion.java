/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
    
    
    public Connection conectarBD() {
        Connection connection = null;
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "BaseU4Copy";
        String password = "123";

        try {
            // Cargar el driver de Oracle
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Establecer la conexión
            connection = DriverManager.getConnection(url, user, password);
            //System.out.println("Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se pudo encontrar el driver de Oracle.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error de conexión a la base de datos.");
            e.printStackTrace();
        }

        return connection;
    }
}
