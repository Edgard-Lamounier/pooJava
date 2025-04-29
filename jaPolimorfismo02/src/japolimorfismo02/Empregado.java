/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package japolimorfismo02;

/**
 *
 * @author Edgard Lamounier 
 */
public abstract class Empregado {
    protected String nome;
    protected String secao;
    protected double salario_bruto;
    
    public Empregado (String  _nome, String  _secao, double  _salario)
    {
      nome = _nome;
      secao = _secao;
      salario_bruto = _salario;
    }
    
     abstract double SalarioLiquido(); 

}
