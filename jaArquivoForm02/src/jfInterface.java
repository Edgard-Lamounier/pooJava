
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EDGARD LAMOUNIER -- JAN/2015
 */
public class jfInterface extends javax.swing.JFrame {

    /**
     * Creates new form jfInterface
     */
    public jfInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfAccount = new javax.swing.JTextField();
        jbGrava = new javax.swing.JButton();
        jbRelatorio = new javax.swing.JButton();
        jtfFirstName = new javax.swing.JTextField();
        jtfLastName = new javax.swing.JTextField();
        jtfBalance = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arquivo de Contas");

        jLabel1.setText("Nro. da Conta:");

        jLabel2.setText("Primeiro Nome:");

        jLabel3.setText("Ultimo Nome:");

        jLabel4.setText("Saldo:");

        jtfAccount.setToolTipText("");
        jtfAccount.setName(""); // NOI18N
        jtfAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAccountActionPerformed(evt);
            }
        });

        jbGrava.setText("GRAVA");
        jbGrava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravaActionPerformed(evt);
            }
        });

        jbRelatorio.setText("RELATÓRIO");
        jbRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRelatorioActionPerformed(evt);
            }
        });

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        jLabel5.setText("Relatorio:");
        jLabel5.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtfLastName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfAccount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jtfBalance))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(453, Short.MAX_VALUE)
                .addComponent(jbGrava)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbRelatorio)
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGrava)
                    .addComponent(jbRelatorio))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGravaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravaActionPerformed
        System.out.println("Teste de insercao de registros");
        
        
        
        if (!"".equals(jtfAccount.getText()) || jtfAccount.getText()!= null)
        {
            CreateTextFile application = new CreateTextFile();
            BufferedWriter output = application.openFile();


            AccountRecord record = new AccountRecord();
            int     nConta;
            double  saldo;
            
            nConta = Integer.parseInt(jtfAccount.getText());
            saldo = Double.parseDouble(jtfBalance.getText());

            try // gera saída dos valores para o arquivo
             {
                // recupera os dados para saída
                record.setAccount( nConta ); // lê o número de conta
                record.setFirstName( jtfFirstName.getText()); // lê o primeiro nome     
                record.setLastName( jtfLastName.getText()); // lê o sobrenome       
                record.setBalance( saldo ); // lê o saldo

                if ( record.getAccount() > 0 )
                {
                   /*
                   // grava um novo registro
                   output.format( "%d %s %s %.2f\n", record.getAccount(),
                      record.getFirstName(), record.getLastName(),       
                      record.getBalance() ); 
                   */

                   // grava um novo registro
                   try {
                   output.write(String.valueOf(record.getAccount()) +
                                " " + record.getFirstName() +
                                " " + record.getLastName() + 
                                " " + String.valueOf(record.getBalance()));

                   //output.write(String.valueOf(record.getAccount()));
                   //output.write(record.getFirstName());
                   //output.write(record.getLastName());
                   //output.write(String.valueOf(record.getBalance()));
                   output.newLine();
                   output.flush();
                   }
                   catch (IOException ioe)
                    {
                        ioe.printStackTrace();
                    }

                } // fim do if
                else
                {
                   System.out.println(
                      "Account number must be greater than 0." );
                } // fim do else
             } // fim do try
            catch ( FormatterClosedException formatterClosedException )
             {
                System.err.println( "Error writing to file." );
                return;
             } // fim do catch
             catch ( NoSuchElementException elementException )
             {
                System.err.println( "Invalid input. Please try again." );
             } // fim do catch

            finally {
                if ( output != null ) 
                  try {
                       output.close();
                  } catch (IOException ioe2) {
                      // just ignore it
                  }
            }
        }
        else
        {
            System.out.println("Campo Conta Vazia...");
        }
        jtfAccount.setText("");
        jtfFirstName.setText("");
        jtfLastName.setText("");
        jtfBalance.setText("");
    }//GEN-LAST:event_jbGravaActionPerformed

    private void jtfAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAccountActionPerformed

    private void jbRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRelatorioActionPerformed
        // TODO add your handling code here:
        ReadTextFile application = new ReadTextFile();

        application.openFile();
        application.readRecords();
        application.closeFile();
    }//GEN-LAST:event_jbRelatorioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfInterface().setVisible(true);
                
                
            }
        });
    }
    
    public class ReadTextFile {
    private Scanner input;  // atributo criado para leitura de arquivo

   // enable user to open file
   public void openFile()
   {
      try
      {
         input = new Scanner( 
                 new File( "clients.txt" ) );
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
      jTextArea.setText("Account\tFirst Name\tLast Name\tBalance\n" );
      try // read records from file using Scanner object
      {
         while ( input.hasNext() )
         {
            
            record.setAccount( Integer.parseInt(input.next()) ); // read account number
            record.setFirstName( input.next() ); // read first name
            record.setLastName( input.next() ); // read last name
            record.setBalance( Double.parseDouble(input.next()) ); // read balance
            
            // display record contents
            System.out.printf( "%-10d%-12s%-12s%10.2f\n",
               record.getAccount(), record.getFirstName(),
               record.getLastName(), record.getBalance() );
            
            jTextArea.append(String.valueOf(record.getAccount()) +
                            "\t" + record.getFirstName() +
                            "\t" + record.getLastName() + 
                            "\t" + String.valueOf(record.getBalance()) +
                            "\n");
            
            //jTextArea.
           
            
            //String bla = input.next();
            //System.out.printf("%s ",bla);
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

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JButton jbGrava;
    private javax.swing.JButton jbRelatorio;
    private javax.swing.JTextField jtfAccount;
    private javax.swing.JTextField jtfBalance;
    private javax.swing.JTextField jtfFirstName;
    private javax.swing.JTextField jtfLastName;
    // End of variables declaration//GEN-END:variables
}
