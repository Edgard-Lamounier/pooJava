/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jaretangulo;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Edgard Lamounier
 */
public class JaRetangulo {

    
    public static void main(String[] args) {
    System.out.println("Hello world");
    Retangulo r1 = new Retangulo();
    Retangulo r2 = new Retangulo();
    
    System.out.println(r1.getBase());
    System.out.println(r2.getAltura());
    r1.setBase(5.6);
    
    System.out.println(r1.getBase());
    
    // Para desenhar retangulos
    JFrame frame = 
            new JFrame( "Desenhando Retangulos");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    r1.setBackground(Color.white);
    frame.add( r1);
    frame.setSize(400, 210);
    frame.setVisible(true);
    
    } // fim do main 
}
