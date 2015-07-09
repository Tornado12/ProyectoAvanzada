/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author ryu
 */
public class Conexion {

    private String user = "admin";
    private String password = "admin";
    private String url = "jdbc:mysql://localhost:3308/hoteles";
    protected Connection conn = null;
    
    Conexion() {

        loadDriver();
        conexionBD();
    }
    
    private void loadDriver() {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.out.println("Error Exception loading Driver:" + ex);
        }
    }

    private void conexionBD() {
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception ex) {
            System.err.println("Error DriverManager.getConnection(): " + ex);
        }
    }    
}
