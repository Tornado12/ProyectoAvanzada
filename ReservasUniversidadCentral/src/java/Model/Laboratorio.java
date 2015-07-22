/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Javier
 */
public class Laboratorio implements ITipoEspacio{
    
    
    private String nombre;
    private String torre;
    private String videoBeam;
    private String computadores;
    private String capacidad;
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTorre(String torre) {
        this.torre = torre;
    }

    public void setVideoBeam(String videoBeam) {
        this.videoBeam = videoBeam;
    }

    public void setComputadores(String computadores) {
        this.computadores = computadores;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    
    
  
    

    public String getNombre() {
        return nombre;
    }

    public String getTorre() {
        return torre;
    }

    public String getVideoBeam() {
        return videoBeam;
    }

    public String getComputadores() {
        return computadores;
    }

    public String getCapacidad() {
        return capacidad;
    }

    @Override
    public String crearLugar() {
       return "LABORATORIO";
    }
    
    
  
    
    
}
