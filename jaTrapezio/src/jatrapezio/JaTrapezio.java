/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jatrapezio;

/**
 *
 * @author Edgard Lamounier Jr.
 * Aula POO - 05/12/2013 
 */
public class JaTrapezio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Classe Trapezio");
        
        Trapezio     t1 = new Trapezio(); // objeto t1 da classe Trapezio
        Trapezio     t2 = new Trapezio(9.0, 5.5, 5.0); // objeto t2 da classe Trapezio
        Trapezio     t3 = new Trapezio(9.0, 5.5);
        
        t1.setBaseMaior(10.0);
        t1.setBaseMenor(5.0);
        t1.setAltura(3.0);
        
        System.out.println("Area Trapezio t1 = " + t1.Area());
        System.out.println("Area Trapezio t2 = " + t2.Area());
        System.out.println("Area Trapezio t3 = " + t3.Area());
 
        
        
        
        
    }
}
