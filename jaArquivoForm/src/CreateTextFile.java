/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;
/**
 *
 * @author EDGARD LAMOUNIER -- JAN/2015
 */
public class CreateTextFile {
    // permite ao usuário abrir o arquivo
    private Formatter output; // atributo utilizado para gerar saída de texto no 
                              // arquivo
  
    
    public void openFile()
   {
      try
      {
          output = new Formatter( "clientes.txt");
     
          //output = new Formatter( new BufferedWriter(new FileWriter("clientes.txt", true)) );
      } // fim do try
      catch ( FileNotFoundException filesNotFoundException )
      {
         System.err.println( "Error creating file." );
         System.exit( 1 );
      } // fim do catch
   } // fim do método openFile
   
   
   
   public void addRecords(int acc, String fn, String ln, double b)
   {
       AccountRecord record = new AccountRecord();
       
       try // gera saída dos valores para o arquivo
       {       
            record.setAccount( acc ); // lê o número de conta
            record.setFirstName( fn ); // lê o primeiro nome     
            record.setLastName( ln ); // lê o sobrenome       
            record.setBalance( b ); 
           
           if ( acc > 0 )
            {
               // grava um novo registro
               output.format( "%d %s %s %.2f \n", record.getAccount(),
                  record.getFirstName(), record.getLastName(),       
                  record.getBalance() );
               output.flush();
               JOptionPane.showMessageDialog(null, "Registro Inserido!!!");
            } // fim do if
            else
            {
                JOptionPane.showMessageDialog(null, "O número da conta deve ser maior que zero!!!");
            } // fim do else
         } // fim do try
         catch ( FormatterClosedException formatterClosedException )
         {
            JOptionPane.showMessageDialog(null, "Erro ao escrever no arquivo!!!");
            return;
         } // fim do catch
         catch ( NoSuchElementException elementException )
         {
             JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor tente novamente!!!");
         } // fim do catch
   } // fim do método addRecords
   
   // fecha o arquivo
   public void closeFile()
   {
      if ( output != null )
         output.close();
   } // fim do método closeFile
                 
} // fim da classe CreateTextFile


/*
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
       
//      return output; 
//   } // fim do método openFile
//    
//*/
//*/