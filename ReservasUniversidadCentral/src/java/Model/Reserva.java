
package Model;

import java.util.Date;

public class Reserva {
    
    
    private int id;
    private boolean estado;
    private Date fecha;
    private String hora;

    

    public int getId() {
        return id;
    }

    public boolean isEstado() {
        return estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
    

    
    public Reserva(){
    }
    
   /* 
    public void hacerReserva(){
    
    }
    
    
    public void verEstado(){
          
    }
    */
    
    
}
