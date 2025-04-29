/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jaretangulo02;

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author EDGARD LAMOUNIER
 * @date: 08/03/2016
 */
public class JaRetangulo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World"); 
        
        Retangulo   r1 = new Retangulo(); // criando um objeto da classe
                                          // Retangulo e chamando este 
                                          // objeto de r1
        
        
        Retangulo   r3 = new Retangulo(5.0); // criando um objeto da classe
                                                  // Retangulo e chamando este 
                                                  // objeto de r3
        
        Retangulo   r2 = new Retangulo(100.0, 200.0); // criando um objeto da classe
                                                  // Retangulo e chamando este 
                                                  // objeto de r2
        
        double area1;
        double area2;
        
        area1 = r1.getArea();
        area2 = r2.getArea();
        
        System.out.println("Area do r1 = " + area1);
        System.out.println("Area do r2 = " + area2);
        System.out.println("Area do r3 = " + r3.getArea());
        
        System.out.println("Perimetro do r1 = " + r1.getPerimetro());
        System.out.println("Perimetro do r2 = " + r2.getPerimetro());
        System.out.println("Perimetro do r3 = " + r3.getPerimetro());
        
        r1.setBase(300);
        r1.setAltura(100);
        r1.paint(50, 150, null);
        r2.paint(50, 50, null);
        
        
        
        
  }
        
        
}
  