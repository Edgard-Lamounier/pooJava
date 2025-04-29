/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package japrimeiraaula;

/**
 *
 * @author EDGARD LAMOUNIER -- 09/10/2014
 */
public class Vetor2D {
    private double x;
    private double y;
    
    public Vetor2D() // construtor default
    {
        x = 5.0;
        y = 5.0;
    }
    
    public Vetor2D(double a, double b)
    {
        x = a;
        y = b;
    }
    
    public void  setX(double a)
    {
        x = a;
    }
    
    public void  setY(double b)
    {
        y = b;
    }
    
    public double  getX()
    {
        return x;
    }
    
    public double  getY()
    {
        return y;
    }
    
    public void imprime()
    {
        System.out.println("Abscissa x = " + x);
        System.out.println("Ordenada y = " + y);
    }
    
    public double produtoEscalar(Vetor2D  v)
    {
        return(x * v.x + y * v.getY());
    }
            
    
    
    
}
