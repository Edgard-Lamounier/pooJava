/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package janumerocomplexo2;

/**
 *
 * @author EDGARD
 */
public class JaNumeroComplexo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Complexo  c1 = new Complexo();
        Complexo  c2 = new Complexo(3.0, 4.0);
        c1.printComplexo();
        c1.setRe(3.5);
        c1.printComplexo();
        System.out.println("Modulo do c1 = " + c1.modulo());
        System.out.println("Modulo do c2 = " + c2.modulo());
    }
    
}
