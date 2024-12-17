
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conexion {
 private Connection conn = null;
    private String URL, USUARIO, CONTRA;

    public conexion() {
       
    }

    public Connection conectar() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");

            URL = "jdbc:oracle:thin:@192.168.20.151:1521:XE";
            USUARIO = "BaseU4";
            CONTRA = "123";

            conn = DriverManager.getConnection(URL, USUARIO, CONTRA);
            System.out.println("Conectado a la base Angi");
        } catch (Exception e) {
            System.err.println("Error al conectar ala base Angi");
            e.printStackTrace();
        }

        return conn;
    }

    public Connection conectarBD() {
        Connection connection = null;

        String url = "jdbc:oracle:thin:@192.168.20.151:1521:xe";
        String user = "BaseU4";
        String password = "123";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado a la base de datos copia");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se pudo encontrar el driver de Oracle");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error de conexión a la base de datos de la copia.");
            e.printStackTrace();
        }

        return connection;
    }

    public void desconectar() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Desconectado de la base de datos");
            }
        } catch (SQLException e) {
            System.err.println("Error al intentar desconectar de la base de datos");
            e.printStackTrace();
        }
    }
    
}
