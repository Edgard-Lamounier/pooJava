/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javetor2d;

/**
 *
 * @author EDGARD
 */
public class Vetor2D {
    protected double x, y;
    
    public Vetor2D() {
        x = 0.0;  y = 0.0; // vetor nulo
    }
    
    public Vetor2D(double x1, double y1) {
        x = x1;   y = y1;    
    }
    
    public double Modulo() {
        return(Math.sqrt(x * x + y * y));
    }
    
    public double ProdutoEscalar(Vetor2D  u) {
        return(this.x * u.x + this.y * u.y);
    }
    
    public double Angulo(Vetor2D  u) {
        return(Math.acos(ProdutoEscalar(u)/(Modulo()*u.Modulo())));
    }
    
    public Vetor2D Soma(Vetor2D  u) {
        Vetor2D temp = new Vetor2D();
        temp.x = this.x + u.x;
        temp.y = this.y + u.y;
        return(temp);
    }
            
            

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
 }
    