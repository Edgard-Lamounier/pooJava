/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jacircunferencia;

/**
 *
 * @author EDGARD LAMOUNIER
 */
public class Circunferencia {
    
    private double  raio; 
    
    Circunferencia()
    {
        raio = 10.0;
    }
    
    Circunferencia(double r)
    {
        raio = r;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    double  Area()
    {
        return (Math.PI * this.raio * this.raio);
    }
    
    double Comprimento()
    {
        return (2 * Math.PI * this.raio);
    }
    
    
    
}
