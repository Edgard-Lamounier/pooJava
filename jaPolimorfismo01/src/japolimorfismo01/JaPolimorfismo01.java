/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package japolimorfismo01;

/**
 *
 * @author Edgard Lamounier JR
 */
public class JaPolimorfismo01 {

    /**
     * Toda classe em Java herda implicitamente a classe Object. 
     * A classe Object possui alguns métodos, dentre eles o método toString().
     * O método toString() original, descreve qual instância de objeto está 
     * sendo utilizada. Resumidamente, ele cria um texto com o nome da classe 
     * mais um código hexadecimal que cada instância possui diferente de outra, 
     * chamado hash code (é como um RG daquela instância).
     **/
    
    public static void main(String[] args) {
        TV tv1 = new TV("Marca1", "SDX-22", 29);
        System.out.println(tv1.toString());
    }
}
