package jaretangulo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;



public class Retangulo extends JPanel {
    
    private double base, altura; // atributos

    public Retangulo() { // construtor default
        base = 10.0;
        altura = 5.0;
    }
        public Retangulo(double b ) {
        base = b;
        altura = 5.0;
    }
        public Retangulo(double b,double a) {
        base = b;
        altura = a;
    }
        
    public void desenhaRetangulo( Graphics g)
    {
        super.paintComponent( g );
        this.setBackground(Color.white);
        g.setColor(Color.blue);
        g.drawRect(5, 40, 90, 55);
        
    }

   
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
    
    
}



