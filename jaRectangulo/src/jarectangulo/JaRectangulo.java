/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarectangulo;

/**
 *
 * @author Edgard
 */
public class JaRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        
        // Criando dois objetos da classe Retangulo
        
        Retangulo r1 = new Retangulo();
        Retangulo r3 = new Retangulo(4.0);
        Retangulo r2 = new Retangulo(7.0, 3.0);
        
        System.out.println("A base do objeto r1: " + r1.getBase());
        
        System.out.println("A area do objeto r1: " + r1.areaRet());
        System.out.println("A area do objeto r2: " + r2.areaRet());
        System.out.println("A area do objeto r3: " + r3.areaRet());
        
        r1.setBase(5.0);
        r1.setAltura(4.0);
        
        System.out.println("A area do objeto r1: " + r1.areaRet());
        System.out.println("A area do objeto r2: " + r2.areaRet());
        
        System.out.println("A base do objeto r1: " + r1.getBase());
        System.out.println("A altura do objeto r2: " + r2.getAltura());
        
    }
    
}
