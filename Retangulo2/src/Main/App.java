/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

/**
 *
 * @author EDGARD
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Retangulo r1 = new Retangulo(3, 5);
        System.out.println("Area do objeto r1: "+r1.area());
        System.out.println("Perimetro do objeto r1: "+r1.perimetro());
        
        Retangulo r2 = new Retangulo(11, 13);
        System.out.println("Area do objeto r2: "+r2.area());
        System.out.println("Perimetro do objeto r2: "+r2.perimetro());
        
        Retangulo r3 = new Retangulo();
        r3.setBase(5);
        r3.
        System.out.println("Base do r3:"+r3.getBase());
        
        
    }
    
}
