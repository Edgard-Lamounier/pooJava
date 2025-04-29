/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jaretangulo02;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;

/**
 *
 * @author EDGARD LAMOUNIER
 * @datae  08/03/2016
 */
public class Retangulo {
    // atributos
    private double  base;
    private double  altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    // metodos
    Retangulo()  // construtor default -- aridade 0 (zero).
    {
        base = 1.0;
        altura = 1.0;
    }
    
    Retangulo(double b) // aridade 1.
    {
        base = b;
        altura = 4.0;
    }
    
    Retangulo(double b, double a) // aridade 2.
    {
        base = b;
        altura = a;
    }
    
    public double getArea()
    {
        return (this.base * this.altura);
    }
    
    public double getPerimetro()
    {
        double b = this.base;
        return (2* (base + altura)); 
       
    }
    
    
    public void paint (int x, int y, Graphics g) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(x, y, 500, 500);
        window.getContentPane().add(new MyCanvas(this));
        window.setVisible(true);
    }
    
}
