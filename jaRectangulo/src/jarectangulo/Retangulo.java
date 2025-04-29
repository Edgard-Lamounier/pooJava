/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarectangulo;

/**
 *
 * @author Edgard
 */
public class Retangulo {
    // atributos
    private double base;
    private double altura;
    
    // metodos 
    
    // Construtor --> cria objetos da classe
    public  Retangulo()
    {
        base = 10.0;
        altura = 10.0;
    }
    
    public Retangulo(double b)
    {
            base = b;
            altura = 8.0;
    }
    
    public  Retangulo( double b, double a )
    {
        base = b;
        altura = a;
    }
    
    public double areaRet()
    {
        return(base * altura);
    } // fim do metodo areaRet() 
    
    public void setBase(double b)
    {
        base = b;
    } // fim do metodo setBase()
    
    
    public void setAltura(double a)
    {
        altura = a;
    } // fim do metodo setAltura()
    
    public double getBase()
    {
        return base;
    } // fim do metodo getBase()
    
    
    public double getAltura()
    {
        return altura;
    } // fim do metodo getAltura()
} // fim da classe Retangulo



/* Em C#

	     Console.WriteLine("Hello World!" + "\n");

            Retangulo r1 = new Retangulo();

            Console.WriteLine("Area do Retnagulo = " + r1.Area());

            Console.Read();

*/

