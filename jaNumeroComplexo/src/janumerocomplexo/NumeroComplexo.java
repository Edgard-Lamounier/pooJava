/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package janumerocomplexo;

/**
 *
 * @author Edgard Lamounier Jr.
 */
public class NumeroComplexo {
    private double x;
    private double y;

    // construtor 
    public NumeroComplexo() {
        x = 0.0;
        y = 0.0;
    }
    
    public NumeroComplexo(double re, double im)
    {
        x = re;
        y = im;
    }
    
    public double  getX()
    {
        return(x);
    }
    
    public void setX(double n)
    {
        x = n;
    }
    
    public double  getY()
    {
        return(y);
    }
    
    public void setY(double n)
    {
        y = n;
    }
    
    public void Imprime()
    {
        System.out.println("Parte real = " + x);
        System.out.println("Parte imaginaria = " + y);
        
    }
    
    public double Modulo()
    {
        return(Math.sqrt(x*x + y*y));
    }
    
    
    
    
}
