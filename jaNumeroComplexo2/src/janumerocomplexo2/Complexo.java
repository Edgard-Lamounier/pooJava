/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package janumerocomplexo2;

/**
 *
 * @author EDGARD LAMOUNIER -- 07/04/2015
 */
public class Complexo {
    // atributos da classe 
    private double  re; // parte Real
    private double  im; // parte Imaginaria

    public Complexo()
    {
        re = 0.0;
        im = 0.0;
    }
    
    public Complexo(double _re, double _im)
    {
        re = _re;
        im = _im;
    }
    
    public double modulo()
    {
        return( Math.sqrt(re*re + im*im) );
    }
    
    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }
    
    // métodos da classe 
    public void printComplexo()
    {
        System.out.println("Parte real = " + re);
        System.out.println("Parte imaginaria = " + im);
    }
    
    
}
