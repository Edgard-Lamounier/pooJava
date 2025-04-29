/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jamenued;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author EDGARD LAMOUNIER
 */
public class JaMenuED {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        {
	  for (int i = 0; i < 100; ++i)   // equivalente a system("cls");
               System.out.println();
	
	int op;
	
	do
	{
		for (int i = 0; i < 50; ++i)  
                    System.out.println();
                
                System.out.println("MENU");
                System.out.println("[1] Inserir no inicio da lista");
                System.out.println("[2] Inserir no fim da lista");
                System.out.println("[3] Remover um elemento da lista");
                System.out.println("[4] Imprime a lista do Fim ao Inicio");
                System.out.println("[5] Imprime a lista do Inicio ao Fim");
                System.out.println("[6] Sair");
		
		Scanner item = new Scanner(System.in);
                op = item.nextInt(); 
		switch(op)
		{
			case '1':
				for (int i = 0; i < 50; ++i)  
                                    System.out.println();
				System.out.println("Insere no inicio");
				System.out.println();
                                System.in.read();
				break;

			case '2':
				for (int i = 0; i < 50; ++i)  
                                    System.out.println();
				System.out.println("Insere no fim");
				System.out.println();
                                System.in.read();
				break;
				
			case '3':
				for (int i = 0; i < 50; ++i)  
                                    System.out.println();
				System.out.println("Remove");
				System.out.println();
                                System.in.read();
				break;

			case '4':
				for (int i = 0; i < 50; ++i)  
                                    System.out.println();
				System.out.println("Lista do Inicio ao Fim");
				System.out.println();
                                System.in.read();
				break;

			case '5':
				for (int i = 0; i < 50; ++i)  
                                    System.out.println();
				System.out.println("Lista do Fim ao Inicio");
				System.out.println();
                                System.in.read();
				break;

			case '6':
				System.exit(0); 
				break;

			default:
				for (int i = 0; i < 50; ++i)  
                                    System.out.println();
				System.out.println("OPCAO INCORRETA!");
				System.out.println();
				System.in.read();
		}
	}while(op !='6');
}
    }
    
}
