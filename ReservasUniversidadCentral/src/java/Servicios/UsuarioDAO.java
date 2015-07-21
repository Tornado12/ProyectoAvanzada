
package Servicios;

import BD.Conexion;
import Model.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class UsuarioDAO {
    
    public boolean GuardarUsuario (Usuario user) {
        try{
          int pos;
          Conexion conn = Conexion.getInstance();
          Statement stm = conn.getConnect().createStatement();
        
           String insert="INSERT INTO usuario ( nombre, apellido, cedula, cargo, genero, username, password, rol)"
                   + "VALUES ('"+user.getNombre()+"','"+user.getApellido()+"',"+user.getCedula()+",'"+user.getCargo()+"','"+user.getGenero()+"','"+user.getUsername()+"','"+user.getPassword()+"','"+user.getRol()+"');";
           
          
           pos = stm.executeUpdate(insert);
           
           if(pos>0){
               System.out.println("Usuario registrado"+pos);
               return true;
              
           }else{
               System.out.println("Error al insertar usuario "+pos);
               return false;
               
           }
          
         
        }catch(Exception e){
            System.out.println("Error en la clase usuario metodo GuardarUsuario " +e);
            return false;
        }       
            
 
    }
    
    

    public boolean Validar(String user, String pass){
      
      Usuario comp = new Usuario();
      boolean status = false;
      try{  
       // String pos;
        Conexion conn = Conexion.getInstance();
        Statement stm = conn.getConnect().createStatement();
        
       // LinkedList<Usuario> listaContactos=new LinkedList<Usuario>();
      
        
         String query="select * from usuario where username = '"+user+"' and password = "+pass+"; ";
                 
          ResultSet rs = stm.executeQuery(query);
         
                  //  comp.setUsername(rs.getString("username"));
                  //  comp.setPassword(rs.getString("password"));
                    
                    //listaContactos.add(comp);

            status = rs.next(); 
             
             if (rs != null) {  
                try {  
                    rs.close();  
                } catch (SQLException e) {  
                    System.out.println(" ERROR validar datos "+e);
                }  
            }  
            

        }catch(Exception e){
             System.out.println("Error credenciales invalidas " + e);
             
         }         
      
        return status;  
        
   }
    
    
}
