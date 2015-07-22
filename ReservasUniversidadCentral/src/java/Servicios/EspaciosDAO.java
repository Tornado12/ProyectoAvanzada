/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import BD.Conexion;
import Model.Salon;
import Model.Auditorio;
import Model.Laboratorio;
import Model.Teatro;
import java.sql.Statement;

/**
 *
 * @author Javier
 */
public class EspaciosDAO {
    
    
    public boolean GuardarSalon (Salon user) {
        try{
          int pos;
          Conexion conn = Conexion.getInstance();
          Statement stm = conn.getConnect().createStatement();
        
           String insert="insert into salon (nombre,torre,video_beam,computadores,capacidad)  "
                     + " VALUES ('"+user.getNombre()+"','"+user.getTorre()+"','"+user.getVideoBeam()+"',"+user.getComputadores()+","+user.getCapacidad()+");";
           
          
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
 
        
     
     
     
    public boolean GuardarTeatro (Teatro user) {
        try{
          int pos;
          Conexion conn = Conexion.getInstance();
          Statement stm = conn.getConnect().createStatement();
        
           String insert="insert into teatro (nombre,torre,video_beam,computadores,capacidad) "
                     + " VALUES ('"+user.getNombre()+"','"+user.getTorre()+"','"+user.getVideoBeam()+"',"+user.getComputadores()+","+user.getCapacidad()+");";
           
          
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
        
        
        
    public boolean GuardarAuditorio (Auditorio user) {
        try{
          int pos;
          Conexion conn = Conexion.getInstance();
          Statement stm = conn.getConnect().createStatement();
        
           String insert="insert into auditorio (nombre,video_beam,computadores,capacidad)"
                   + " VALUES ('"+user.getNombre()+"','"+user.getVideoBeam()+"',"+user.getComputadores()+","+user.getCapacidad()+");";
           
          
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
        
        
        
        
        
    public boolean GuardarLaboratorio (Laboratorio user) {
        try{
          int pos;
          Conexion conn = Conexion.getInstance();
          Statement stm = conn.getConnect().createStatement();
        
           String insert="insert into laboratorio (nombre,torre,video_beam,computadores,capacidad)"
                  + "VALUES ('"+user.getNombre()+"','"+user.getTorre()+"','"+user.getVideoBeam()+"',"+user.getComputadores()+","+user.getCapacidad()+");";
           
          
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
    
}
