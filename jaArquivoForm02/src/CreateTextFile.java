/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
/**
 *
 * @author EDGARD LAMOUNIER -- JAN/2015
 */
public class CreateTextFile {
    // private Formatter output; // atributo utilizado para gerar saída de texto no 
                              // arquivo
    
    private BufferedWriter output;
    
    public BufferedWriter openFile()
   {
       
       try
      {
         // output = new Formatter( "clients.txt" );
         output = new BufferedWriter( 
                   new FileWriter("clients.txt", true));
      } // fim do try
       
      catch (IOException ioe)
      {
          ioe.printStackTrace();
      }
      catch ( SecurityException securityException )
      {
         System.err.println(
            "You do not have write access to this file." );
         System.exit( 1 );
      } // fim do catch
      
      /*
       catch ( FileNotFoundException filesNotFoundException )
      {
         System.err.println( "Error creating file." );
         System.exit( 1 );
      } // fim do catch 
      */
       
      return output; 
   } // fim do método openFile
    
    
} // fim da classe CreateTextFile
