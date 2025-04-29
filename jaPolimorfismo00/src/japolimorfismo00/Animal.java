/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package japolimorfismo00;

/**
 *
 * @author Edgard Lamounier
 */
public abstract class Animal {
    protected String nome;
    protected String cor;
    protected int    peso; 
    
    public Animal(String  _nome, String  _cor, int  _peso)
    {
        nome = _nome;
        cor = _cor;
        peso = _peso;
    }
    public int getPeso() { return peso; }
    public String getNome() { return nome; }
    public abstract String tipoComida();
}
