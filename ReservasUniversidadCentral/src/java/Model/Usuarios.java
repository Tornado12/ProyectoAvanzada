/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

public class Usuarios {
    
    ArrayList listaUsuarios = new ArrayList();

    public Usuarios() {
    }

    public ArrayList getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    public void adicionarUsuario(Usuario est){
        listaUsuarios.add(est);
    }
    
}

    

