/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jaheranca01;

/**
 *
 * @author Edgard Lamounier
 */
public class Gerente extends Empregado {
    
    private String secretaria;
    
    
    public Gerente (String _nome, String _secao, 
                     double _salario, String _secretaria)
    {
      super (_nome,_secao,_salario); // Aqui eu chamo a super classe do Gerente
      secretaria = _secretaria;
    }
    
    public String getSecretaria ()
    {
        return (secretaria);
    }
    
    public void setSecretaria (String _secretaria)
    {
        secretaria = _secretaria;
    }
    
    // Este método sobrescreve um método da superclasse.
    // O compilador compara as assinaturas dos métodos da
    // subclasse e da superclasse.
    // Se não houver correspondência exata:
    // "method does not override or implement a method from 
    // supertype". 
    
    @Override  
    public void aumentaSalario (double percentagem)
    {
        double novaPercentagem = percentagem + 15.0;
        //salario *= 1 + novaPercentagem / 100;
        super.aumentaSalario(novaPercentagem);
    }
    
}
