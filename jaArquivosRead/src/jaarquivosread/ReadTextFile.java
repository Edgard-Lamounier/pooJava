/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jaarquivosread;

// This program reads a text file and displays each record.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Edgard Lamounier JR
 */
public class ReadTextFile {
    private Scanner input;  // atributo criado para leitura de arquivo

   // enable user to open file
   public void openFile()
   {
      try
      {
         input = new Scanner( 
                 new File( "C:/Users/Edgard/Documents/NetBeansProjects/jaArquivos/clients.txt" ) );
      } // end try
      catch ( FileNotFoundException fileNotFoundException )
      {
         System.err.println( "Error opening file!!." );
         System.exit( 1 );
      } // end catch
   } // end method openFile

   // read record from file
   public void readRecords()
   {
      // object to be written to screen
      AccountRecord record = new AccountRecord();

      System.out.printf( "%-10s%-12s%-12s%10s\n", "Account",
         "First Name", "Last Name", "Balance" );

      try // read records from file using Scanner object
      {
         while ( input.hasNext() )
         {
            record.setAccount( input.nextInt() ); // read account number
            record.setFirstName( input.next() ); // read first name
            record.setLastName( input.next() ); // read last name
            record.setBalance( input.nextDouble() ); // read balance

            // display record contents
            System.out.printf( "%-10d%-12s%-12s%10.2f\n",
               record.getAccount(), record.getFirstName(),
               record.getLastName(), record.getBalance() );
         } // end while
      } // end try
      catch ( NoSuchElementException elementException )
      {
         System.err.println( "File improperly formed." );
         input.close();
         System.exit( 1 );
      } // end catch
      catch ( IllegalStateException stateException )
      {
         System.err.println( "Error reading from file." );
         System.exit( 1 );
      } // end catch
   } // end method readRecords

   // close file and terminate application
   public void closeFile()
   {
      if ( input != null )
         input.close(); // close file
   } // end method closeFile
}  // end class ReadTextFile 
