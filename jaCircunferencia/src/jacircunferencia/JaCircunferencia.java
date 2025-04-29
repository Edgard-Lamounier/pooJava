/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jacircunferencia;

/**
 *
 * @author EDGARD
 */
public class JaCircunferencia {

    
    public static void main(String[] args) {
        
        Circunferencia   c1 = new Circunferencia();
        Circunferencia   c2 = new Circunferencia(5.0);
        
        System.out.println("Area do c1 = " + c1.Area());
        System.out.println("Comprimento do c2 = " + c2.Comprimento());
    }
    
}
