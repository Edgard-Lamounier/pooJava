/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jaheranca01;

/**
 *
 * @author Edgard Lamounier
 */
public class JaHeranca01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Teste da Heranca");
        
        Empregado e1 = new Empregado("Joao", "Contabilidade",
                       1000.0);
        Gerente   g1 = new Gerente("Jose", "Almoxarifado",
                       1000.0, "Maria");
        
        System.out.println(g1.getSecretaria());
        System.out.println(g1.getNome());
        System.out.println(g1.getSalario());
        System.out.println(e1.getSalario());
        e1.aumentaSalario(30.0);
        g1.aumentaSalario(30.0);
        System.out.println(g1.getSalario());
        System.out.println(e1.getSalario());
        

    }
}
