
package Model;


import BD.Conexion;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Usuario {
    
    private int id ;
    private String nombre;
    private String apellido;
    private String cedula;
    private String cargo;
    private String genero;
    private String username;
    private String password;
    private String rol;
    public static Usuario mgr= new Usuario();

    

    //Metodo constructor
    public Usuario() {
      /* 
        int id,String nombre,String apellido,int cedula,String cargo,String genero,String username,String password,String rol
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.cargo = cargo;
        this.genero = genero;
        this.username = username;
        this.password = password;
        this.rol = rol;
      */  
    }


    //MEtodos get y set 
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    
    public String getCargo() {
        return cargo;
    }

    public String getGenero() {
        return genero;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRol() {
        return rol;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    
    
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

    /*
    public int getUsuario_privilegio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Usuario verificarUsuario(String user, String clave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */

   


    
}