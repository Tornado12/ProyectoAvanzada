package Model;

/**
 *
 * @author Javier
 */
/*abstract class Creator {
    public abstract FactoryTipoEspacio factoryMethod();     
}*/

public class FactoryTipoEspacio{
    
    /**
    public FactoryTipoEspacio factoryMethod() {
        return new FactoryTipoEspacio();
    }
    **/
    
             public final static int SALON = 0;
             public final static int TEATRO = 1;
             public final static int AUDITORIO = 2;
             public final static int LABORATORIO = 3;
            
    
            public static ITipoEspacio crearEspacio(String tipol) {
              
                int tipo = 0;
                
                if(tipol.equals("salon")){
                    tipo=0;
                }else if(tipol.equals("teatro")){
                    tipo=1;
                }else if(tipol.equals("auditorio")){
                    tipo=2;
                }else if(tipol.equals("laboratorio")){
                    tipo=3;
                }
                
                switch(tipo) {
                   case SALON:
                       return new Salon();
                   case TEATRO:
                       return new Teatro();
                   case AUDITORIO:
                       return new Auditorio();
                   case LABORATORIO:
                       return new Laboratorio();
                }  
                 return null;
            }

}
