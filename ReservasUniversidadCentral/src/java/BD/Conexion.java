
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion {

    private String user = "tornado12";//"tornado12";
    private String password = "ucentral15";//"ucentral15";
    private String url = "jdbc:mysql://localhost:3306/tornado_bd";
    

    // Instacia que guarda la conexion 
    private static Connection conn;
    private static Conexion instance;
  
    
    /** Implementación de singleton, metodo constructor debe ser privado **/
    private Conexion() {

        loadDriver();
        conexionBD();
        
    } 
    
   
    /** Metodo que crea instacia a la base de datos si no esta creada **/
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
    
    
     /**
      * Método para cerrar la conexión con la base de datos
     */
    public static void closeConnection() {
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error al cerrar la conexión." + e);
        }
    }
    
    
     
    public static Conexion getInstance() {
        //Esto servira para que solo se haga una vez garantizando el patron singleton
        if (instance == null) {
          System.out.println("Se crea la instancia solo una vez garantizanco el patron Singleton");
          instance = new Conexion();
       }
        return instance;
    }
    
    
    public static Connection getConnect() {
         return conn;
    }

    public static void setConnect(Connection connect) {
        Conexion.conn = connect;
    }
    
    
    //COMPROBAR que la conexión con BD esta bien
    /**
       public static void main(String[] args) {
 
              Conexion a = new Conexion();
              a.conexionBD();
              System.out.println(" VALOR CONEXION " + a);
           
           Conexion con = Conexion.getInstance();
           System.out.print("AAAA "+con);
 
        }
    **/
}
