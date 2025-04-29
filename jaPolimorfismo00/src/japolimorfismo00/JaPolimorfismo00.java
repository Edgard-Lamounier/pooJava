/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package japolimorfismo00;

/**
 *
 * @author Edgard Lamounier
 */
public class JaPolimorfismo00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal bicho[] = new Animal[2]; 
        bicho[0] = new Carrocho("Hercules", "preto", 70, 5);
        bicho[1] = new Gato("Lulu", "cinza", 15);
        
        for(int i=0; i <bicho.length; i++) {
           System.out.println(bicho[i].getNome());
           System.out.println(bicho[i].tipoComida());
           System.out.println(bicho[i].getPeso());
           System.out.println("/*************/");
           
        }
    }
}
