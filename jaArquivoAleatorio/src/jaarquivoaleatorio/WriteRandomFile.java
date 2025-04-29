/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jaarquivoaleatorio;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.NoSuchElementException;
import java.util.Scanner;


/**
 *
 * @author Edgard Lamounier JR
 */
public class WriteRandomFile {
   private RandomAccessFile output;
   
   private static final int NUMBER_RECORDS = 100;

   // permite que o usuário escolha o arquivo a abrir
   public void openFile()
   {
      try // abre o arquivo
      {
         output = new RandomAccessFile( "clients.dat", "rw" );
      } // fim do try
      catch ( IOException ioException )
      {
         System.err.println( "File does not exist." );
      } // fim do catch
   } // fim do método openFile

   // fecha o arquivo e termina o aplicativo
   public void closeFile() 
   {
      try // fecha o arquivo e encerra
      {
         if ( output != null )
            output.close();
      } // fim do try
      catch ( IOException ioException )
      {
         System.err.println( "Error closing file." );
         System.exit( 1 );
      } // fim do catch
   } // fim do método closeFile

   // adiciona registros ao arquivo
   public void addRecords()
   {
      // objeto (de nome record) a ser gravado no arquivo
      RandomAccessAccountRecord record = new RandomAccessAccountRecord();

      int accountNumber; // número de conta para o objeto AccountRecord
      String firstName; // primeiro nome para o objeto AccountRecord
      String lastName; // sobrenome para objeto AccountRecord
      double balance; // saldo para objeto AccountRecord

      Scanner input = new Scanner( System.in );

      

      System.out.printf( "%s %s\n%s", "Enter account number (1-100),",
         "first name, last name and balance.", "? " );

      //while ( input.hasNext() ) // faz um loop até o indicador de fim de arquivo
      //{
         try // gera a saída dos valores para o arquivo
         {
            accountNumber = input.nextInt(); // lê o número de conta
            firstName = input.next(); // lê o primeiro nome
            lastName = input.next(); // lê o sobrenome
            balance = input.nextDouble(); // lê o saldo

            if ( accountNumber > 0 && accountNumber <= NUMBER_RECORDS )
            {
               record.setAccount( accountNumber );
               record.setFirstName( firstName );  
               record.setLastName( lastName );    
               record.setBalance( balance );      

               output.seek( ( accountNumber - 1 ) * // posição para a localização 
                  RandomAccessAccountRecord.SIZE ); // adequada do arquivo
               record.write( output );                                   
            } // fim do if
            else
               System.out.println( "Account must be between 0 and 100." );
         } // fim do try
         catch ( IOException ioException )
         {
            System.err.println( "Error writing to file." );
            return;
         } // fim do catch
         catch ( NoSuchElementException elementException )
         {
            System.err.println( "Invalid input. Please try again." );
            input.nextLine(); // descarta entrada para o usuário tentar de novo
         } // fim do catch

        //System.out.printf( "%s %s\n%s", "Enter account number (1-100),",
           // "first name, last name and balance.", "? " );
      //} // fim do while
   } // fim do método addRecords

    
} // fim da classe WriteRandomFile
