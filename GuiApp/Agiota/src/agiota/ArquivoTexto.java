package agiota;

import java.io.BufferedWriter;
import java.util.Formatter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArquivoTexto {

    private Formatter output; // atributo utilizado para gerar saída de texto no 
    // arquivo

    public void abreArquivoGrava() {
        try {
            //output = new Formatter("C:\\Doutorado\\NetBeansProjects\\Agiota\\clientes.txt");
            output = new Formatter( new BufferedWriter(new FileWriter("D:\\clientes.txt", true)) );
        } // fim do try
        catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Error creating file.");
            System.exit(1);
        } catch (IOException ex) {
            Logger.getLogger(ArquivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        } // fim do catch
    } // fim do método abreArquivo

    public void adicionaRegistro(String cpf, int acc, String fn, String ln, double b) {
        ContaCliente registro = new ContaCliente();

        try // gera saída dos valores para o arquivo
        {
            registro.setCpf(cpf);
            registro.setConta(acc);
            registro.setNome(fn);
            registro.setSobrenome(ln);
            registro.setSaldo(b);

            if (acc > 0) {
                // grava um novo registro
                output.format("%s %d %s %s %.2f \n", registro.getCpf(),
                        registro.getConta(),
                        registro.getNome(), registro.getSobrenome(),
                        registro.getSaldo());
                output.flush();
                JOptionPane.showMessageDialog(null, "Registro Inserido!!!");
            } // fim do if
            else {
                JOptionPane.showMessageDialog(null, "O número da conta deve ser maior que zero!!!");
            } // fim do else
        } // fim do try
        catch (FormatterClosedException formatterClosedException) {
            JOptionPane.showMessageDialog(null, "Erro ao escrever no arquivo!!!");
        } // fim do catch
        catch (NoSuchElementException elementException) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor tente novamente!!!");
        } // fim do catch
    } // fim do método addRecords

    public void fechaArquivoGrava() {
        if (output != null) {
            output.close();
        }
    } // fim do método fechaArquivo

} // fim da classe Arquivo