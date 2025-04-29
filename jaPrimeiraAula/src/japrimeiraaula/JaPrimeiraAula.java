/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package japrimeiraaula;



/**
 *
 * @author EDGARD LAMOUNIER -- 09/10/2014
 */
public class JaPrimeiraAula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        
        Vetor2D  u = new Vetor2D();
        u.imprime();
        
        u.setX(2.0);
        u.setY(8.0);
        
        u.imprime();
        
        
        Vetor2D  v = new Vetor2D(4.5, 9.0);
        v.imprime();
        
        System.out.println( "O produto escalar entre u e v = "
                + u.produtoEscalar(v));
               
    }
    
}
