/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package japolimorfismo02;

/**
 *
 * @author Edgard Lamounier 
 */
public class EmpregadoCLT extends Empregado {
    private double ISS;
   
    public EmpregadoCLT(String  _nome, String  _secao, double  _salario, double _ISS)
    {
       super(_nome, _secao, _salario);
       ISS = _ISS;
    }
    
    public double SalarioLiquido()
    {
        return (((100-ISS)/100)*salario_bruto);
    }
    
    
}
