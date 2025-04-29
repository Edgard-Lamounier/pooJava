/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package japilhadinamicaint;

/**
 *
 * @author EDGARD LAMOUNIER
 */
public class JaPilhaDinamicaInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pilha pilha = new Pilha();
        
        System.out.println("Testando a classe Pilha");
        pilha.push(3);
        pilha.push(5);
        pilha.push(8);
        pilha.print();
        System.out.println("Desempilhando ... " +
                      pilha.pop());
        pilha.print();
    }
    
}
