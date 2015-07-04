/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;

/**
 *
  * @author ryu
 */
public class Usuario {
    private String id ;
    private String codigo;
    private String nombre;
    private String genero;
    private String ocupacion;
    private String usuario;
    private String password;

    public Usuario(String id, String codigo, String nombre, String genero, String ocupacion, String usuario, String password) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.genero = genero;
        this.ocupacion = ocupacion;
        this.usuario = usuario;
        this.password = password;
    }
     public Usuario(String codigo, String nombre, String genero, String ocupacion, String usuario, String password) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.genero = genero;
        this.ocupacion = ocupacion;
        this.usuario = usuario;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     
    public Usuario (ResultSet rs) {
        try {
            id = rs.getString("id");
            codigo = rs.getString("codigo");
            nombre = rs.getString("nombre");
            genero = rs.getString("genero");
            ocupacion = rs.getString("ocupacion");
            usuario = rs.getString("usuario");
            password = rs.getString("password");

        } catch (Exception e) {
        }
    }
    
    
    
}