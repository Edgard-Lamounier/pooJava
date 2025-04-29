/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package japolimorfismo00;

/**
 *
 * @author Edgard Lamounier
 */
public class Carrocho extends Animal {
    
    private  int  idade;
    
    public Carrocho(String  _nome, String  _cor, int  _peso, int _idade)
    {
        super(_nome, _cor, _peso);
        idade = _idade;
    }
    
    
    @Override 
    public String tipoComida() {
        return("Carrocho come osso;");
    }
    
    public String tipoRacao() {
        return("Carne;");
    }
}
