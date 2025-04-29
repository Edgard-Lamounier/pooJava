/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package janumerocomplexo;

/**
 *
 * @author Edgard Lamounier JR
 */
public class JaNumeroComplexo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("= = = Classe Numero Complexo = = =");
        
        NumeroComplexo   c1 = new NumeroComplexo();
        NumeroComplexo   c2 = new NumeroComplexo(3.0, 4.0);
        
        c1.Imprime();
        c2.Imprime();
        
        System.out.println("O modulo do c1 eh = " + c1.Modulo());
        System.out.println("O modulo do c2 eh = " + c2.Modulo());
        c2.setX(6.0);
        c2.setY(8.0);
        System.out.println("O modulo do c2 eh = " + c2.Modulo());
    }
}
