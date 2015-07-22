package Model;

/**
 *
 * @author Javier
 */
public class Auditorio implements ITipoEspacio{

        
    private String nombre;
    private String videoBeam;
    private String computadores;
    private String capacidad;
    
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "AUDITORIO";
    }
    

    
    
 
    

 
  
}
