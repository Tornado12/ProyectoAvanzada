/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;
import Model.Usuario;
import Servicios.DBManager;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author ryu
 */
public class UsuarioBD extends DBManager{
    public static UsuarioBD mgr= new UsuarioBD();

    
    protected void addObject(ArrayList v, ResultSet rs){
        v.add(new Usuario(rs));
    }
    
    public void save(Usuario usuario,Boolean valor){
        if(valor){
            mgr.execute("insert into usuario(codigo,nombre,genero,ocupacion,usuario,password) values('"+
                    usuario.getCodigo()+"','"+
                    usuario.getNombre()+"','"+
                    usuario.getGenero()+"','"+
                    usuario.getOcupacion()+"','"+
                    usuario.getUsuario()+"','"+
                    usuario.getPassword()+"')");
        }
    }
    
    public ArrayList<Usuario>getUsuarios(){
        ArrayList<Usuario> es = executeQuery("select * from usuario");
        return es;
    }
    
    public Usuario getEstudiante(String codigo){
        ArrayList c = executeQuery("select * from usuario where codigo='"+codigo+"'");
        if(c.size()>0){
            return (Usuario)c.get(0);
        }
        Usuario e = null;
        return e;
    }
}
