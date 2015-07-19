
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;



public class Conexion {

    private String user = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:3306/tornado_bd";
    // 
    private static Connection conn;
    //protected Connection conn = null;
  
    
    /** Implementación de singleton, metodo constructor debe ser privado **/
    private Conexion() {

        loadDriver();
        conexionBD();
   
    }
   
    
    public static void loadDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.out.println("Error Exception loading Driver:" + ex);
        }
    }

    /**Singleton: metodo público estatico encargado de instanciar objeto
     * por primera vez y almacenarlo en una variable estatica
    **/  
    public void conexionBD() {
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception ex) {
            System.err.println("Error DriverManager.getConnection(): " + ex);
        }
    } 
    
    
}
