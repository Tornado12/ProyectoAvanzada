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
abstract class Creator {
    
    public abstract FactoryTipoEspacio factoryMethod();
      
}


public class FactoryTipoEspacio extends Creator{
    
    public FactoryTipoEspacio factoryMethod() {
        return new FactoryTipoEspacio();
    }
    
    
    
    
}


