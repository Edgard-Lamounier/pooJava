/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conta_cliente;

import java.util.Formatter;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;


/**
 *
 * @author EDGARD LAMOUNIER
 */
public class ArquivoTexto {
    // atributos
    private Formatter output; // atributo utilizado para gerar saída de texto no 
                              // arquivo

    
    // métodos
    public void abreArquivoGrava()
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
   } // fim do método abreArquivoGrava

    public void adicionaRegistro(String cpf, int acc, String fn, String ln, double b)
   {
       ContaCliente registro = new ContaCliente();
       
       try // gera saída dos valores para o arquivo
       {       
            registro.setCPF(cpf);
            registro.setNumero_conta(acc);
            registro.setPrimeiro_nome(fn);
            registro.setSegundo_nome(ln);
            registro.setSaldo(b);
            
           
           if ( acc > 0 )
            {
               // grava um novo registro
               output.format( "%s %d %s %s %.2f \n", registro.getCPF(),
                       registro.getNumero_conta(),
                  registro.getPrimeiro_nome(), registro.getSegundo_nome(),       
                  registro.getSaldo() );
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
   } // fim do método adicionaRegistro

    public void fechaArquivoGrava()
   {
      if ( output != null )
         output.close();
   } // fim do método fechaArquivoGrava

    
} // fim da classe ArquivoTexto
