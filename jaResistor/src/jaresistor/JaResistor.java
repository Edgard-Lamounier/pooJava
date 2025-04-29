/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jaresistor;

/**
 *
 * @author Edgard
 */
public class JaResistor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bem vindo a POO");
        
        Resistor  r1 = new Resistor(2.0, 5.0);
        Resistor  r2 = new Resistor(3.0, 2.0);
        Resistor  r3 = new Resistor();
        Resistor  r4 = new Resistor();
        
        System.out.println(r1.getResistencia());
        System.out.println(r1.getPotencia());
        
        System.out.println(r2.getResistencia());
        System.out.println(r2.getPotencia());
        
        r3 = r1.somaSerie(r2);  
        
        System.out.println(r3.getResistencia());
        System.out.println(r3.getPotencia());
        
        r4 = r1.somaParalelo(r3);   
        System.out.println(r4.getResistencia());
        System.out.println(r4.getPotencia());
    }
}
