/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jaarquivoaleatorio;

import java.util.Scanner;

/**
 *
 * @author Edgard Lamounier 
 */
public class JaArquivoAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CreateRandomFile  application = new CreateRandomFile();
        // application.createFile();
        System.out.println("Teste de Arquivos em Java");
        Scanner input = new Scanner( System.in );
        int escolha;
        
        do {
             
                // Obs.: as operações de 1 a 3 abaixo abrem e fecham o arquivo.
                System.out.println("                     MENU PRINCIPAL  ");
                System.out.println("\n                (1) - Cria arquivo - acesso randômico");
                System.out.println("\n                (2) - Insere registros no arquivo");
                System.out.println("\n                (3) - Le registros do arquivo");
                System.out.println("\n                (4) - Para SAIR");
            escolha = input.nextInt();
            switch (escolha)
            {
                case 1:
                    for(int i = 0; i <= 25; i++)
                        System.out.print("\r\n");
                    System.out.println("\napplication.openFile();");
                    CreateRandomFile  appCreate = new CreateRandomFile();
                    appCreate.createFile();
                    break;

                case 2:
                    for(int i = 0; i <= 25; i++)
                        System.out.print("\r\n");
                    System.out.println("\napplication.addRecords(); ");
                    WriteRandomFile appWrite = new WriteRandomFile();
                    appWrite.openFile();
                    appWrite.addRecords();
                    appWrite.closeFile();
                    break;

                case 3:
                    for(int i = 0; i <= 25; i++)
                        System.out.print("\r\n");
                    System.out.println("\napplication.readRecords();");
                    ReadRandomFile appRead = new ReadRandomFile();
                    appRead.openFile();
                    appRead.readRecords();
                    appRead.closeFile();
		break;

	   case 4:
		System.exit(1);
		break;

	   default :
		for(int i = 0; i <= 25; i++)
                        System.out.print("\r\n");
                System.out.println("\naLEIA AS INSTRUÇÕES!");
                break;
	 }
     } while (escolha!=4);
    } // fim do método void main
} // fim da classe JaArquivoAleatorio
