/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalivrodenotas;

import java.util.Scanner;


/**
 *
 * @author Edgard
 */
public class JaLivroDeNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int      j;
        int[ ]   copiaArray = new int[8];
        Scanner  input = new Scanner( System.in );

        System.out.println("Criando o array de notas: ");
        
        for(int i = 0; i < 8; i++)
        {
            j = i + 1;
            System.out.println("Entre a " + j + "a. nota:");
            copiaArray[ i ] = input.nextInt();
        }
        
        
        LivroDeNotas   ln1 = new LivroDeNotas("POO", copiaArray);
        
        System.out.println("Menor nota = " + ln1.getNotaMinima());
        System.out.println("Maior nota = " + ln1.getNotaMaxima());
        System.out.println("Media das notas = " + ln1.getMediaNotas());
        
        
    }
    
}
