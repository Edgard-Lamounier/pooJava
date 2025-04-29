/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jatrapezio;

/**
 *
 * @author Edgard Lamounier Jr. 
 */
public class Trapezio {
    // atributos - private (encapsulamento)
    private double B;
    private double b;
    private double h;
    
    // contrutor default
    public Trapezio()
    {
        B = 0.0;
        b = 0.0;
        h = 0.0; 
    }
    
    // construtor de aridade (qtde de parametros) 2 
    public Trapezio(double BM, double bm)
            
    {
        B = BM;
        b = bm;
        h = 5.0; 
    }
    
    // construtor construtor de aridade (qtde de parametros) 3
    public Trapezio(double BM, double bm, double ht)
    {
        B = BM;
        b = bm;
        h = ht; 
    }
    
    public double  Area()
    {
        return(((B + b) * h) / 2.0);
    }
    
    public void setBaseMaior(double BM)
    {
        B = BM;
    }
    
    public void setBaseMenor(double bm)
    {
        b = bm;
    }
    
    public void setAltura(double ha)
    {
        h = ha;
    }
    
}
