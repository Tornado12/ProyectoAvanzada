
package Model;


public class Salon implements ITipoEspacio{
    
    private int idSalon;
    private int numero;
    private int capacidad;
    
    
    public Salon(){}
    
    @Override
    public boolean getDisponibilidad(){
 
        return true;
    }

    @Override
    public String getCaracteristicas() {
       
        return "";
    }

    @Override
    public String getCapacidad() {

        return "";
    }

    @Override
    public void clonar() {
        
        
    }
    
    
}
