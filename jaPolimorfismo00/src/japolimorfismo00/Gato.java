/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package japolimorfismo00;

/**
 *
 * @author Edgard Lamounier
 */
public class Gato extends Animal {
    
    public Gato(String  _nome, String  _cor, int  _peso)
    {
        super(_nome, _cor, _peso);
    }
    
    @Override 
    public String tipoComida() {
        return("Gato come rato;");
    }
    
}
