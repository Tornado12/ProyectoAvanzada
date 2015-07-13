
package Servicios;

/**
 *
 * @ryu
 */
import java.sql.*;
import java.util.ArrayList;

public class DBManager {

    private final String db = "estudiante";
    private final String url = "jdbc:postgresql://localhost:5432/" + db;
    private final String driver = "org.postgresql.Driver";
    private final String usuario = "ADMIN";
    private final String password = "ADMIN";

    public DBManager() {
    }

    protected void addObject(ArrayList v, ResultSet rs) {

    }
    //Para consultas a la BD que necesitan retorno
    protected ArrayList executeQuery(String sz) {

        ArrayList v = new ArrayList();
        try {
            Class.forName(driver);
            System.out.println("\nEstableciendo conexión..");
            Connection con = DriverManager.getConnection(url, usuario, password);
            if (con == null) {
                System.out.println("database conection not working");
                return v;
            }
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sz);
            while (rs.next()) {
                addObject(v, rs);
            }
            con.close();

        } catch (ClassNotFoundException e) {

            System.out.println("--------------------ERROR--------------------");
            System.out.println("SQL:" + sz);
            System.out.println("Exception: " + e);
        } catch (SQLException e) {
            System.out.println("--------------------ERROR--------------------");
            System.out.println("SQL:" + sz);
            System.out.println("Exception: " + e);
        }
        return v;
    }

    //Para operaciones(insertar,eliminar,consultar) en la BD que no necesitan retorno
    public void execute(String sz) {

        try {
            Class.forName(driver);
            System.out.println("\nEstableciendo conexión..");
            Connection con = DriverManager.getConnection(url, usuario, password);
            if (con == null) {
                System.out.println("database conection not working");
                //return;
            }
            Statement stm = con.createStatement();
            stm.execute(sz);
            con.close();

        } catch (ClassNotFoundException e) {

            System.out.println("--------------------ERROR--------------------");
            System.out.println("SQL:" + sz);
            System.out.println("Exception: " + e);
        } catch (SQLException e) {
            System.out.println("--------------------ERROR--------------------");
            System.out.println("SQL:" + sz);
            System.out.println("Exception: " + e);
        }

    }

}
