/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jatratamentoexcecao02;

/**
 *
 * @author EDGARD LAMOUNIER
 */

import java.util.InputMismatchException;
import java.util.Scanner; 

public class JaTratamentoExcecao02 {

    /**
     * lançamento de uma excecção quando divisão por zero
     * @param numerador
     */
    
    public static int quociente( int numerador, int denominador)
              
    {
        return (numerador/denominador);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner( System.in );
        /*
        System.out.printf( "Entre o numerador: ");
            int numerador = scanner.nextInt();
            System.out.printf( "Entre o denominador: ");
            int denominador = scanner.nextInt();
            
            int resultado = quociente( numerador, denominador);
            System.out.printf(
                "\nResultado: %d / %d = %d\n", numerador, denominador,
                                               resultado);
        
        */
        
        
        boolean continueLoop = true;
        
        do
        { // TRATAMENTO DE EXCECOES
          try  // "tente" rodar o codigo abaixo
          {
            System.out.printf( "Entre o numerador: ");
            int numerador = scanner.nextInt();
            System.out.printf( "Entre o denominador: ");
            int denominador = scanner.nextInt();
            
            int resultado = quociente( numerador, denominador);
            System.out.printf(
                "\nResultado: %d / %d = %d\n", numerador, denominador,
                                               resultado);
            continueLoop = false;
          } // fim do try
          
          // caso não funcione, "pegue" o tratamento das 
          // excecoes abaixo 
          catch ( InputMismatchException inputMismatchException )
          {
             System.err.printf( "\nException: %s\n", 
                     inputMismatchException );
             scanner.nextLine(); 
             System.out.println( "Tem que ser inteiros. Tente de novo.\n");
          } // fim do catch 
          catch  ( ArithmeticException   arithmeticException )
          {
             System.err.printf( "\nException: %s\n", 
                      arithmeticException ); 
             System.out.println( "Nao existe divisao por zero. Tente de novo.\n");
          } // fim do catch
        } while ( continueLoop ); // fim da instrução do...while

        } // fim do main
    } // fim da classe JaTratamentoExcecao02
    