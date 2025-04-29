/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package  br.ufu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/**
 *
 * @author EDGARD LAMOUNIER
 */
public class CadastroAutorConsole {
    public static void main(String[] args) {
		
		try {
			// Registrar um driver
			Class.forName("com.mysql.jdbc.Driver");
			// Abrir a conexão
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books","root", "adminPOO");
			// Após estabelecermos a conexão com o banco de dados
			// Método createStatement para criar o Statement 
			Statement stm = con.createStatement();
			
			// Entrada de dados
			Scanner entrada = new Scanner(System.in);
			int op;
			do{
				System.out.println("[1]-Cadastrar Autor");
				System.out.println("[2]-Alterar Cadastro");
				System.out.println("[3]-Consultar Cadastros");
				System.out.println("[4]-Excluir Autor");
				System.out.println("[5]-Sair");
				op=entrada.nextInt();
				switch(op){
					case 1:
						// CADASTRA UM AUTOR
						System.out.println("Informe o primeiro nome do autor: ");
						String primeiroNome=entrada.next();
						System.out.println("Informe o último nome do autor: ");
						String ultimoNome=entrada.next();
						
						String sqlCadastro = " INSERT INTO authors (firstName, lastName) VALUES ('" + primeiroNome + "','" + ultimoNome + "')";
						stm.executeUpdate(sqlCadastro);
                                                System.out.println("Cadastro efetuado com sucesso!");
						break;
					case 2:
						// ALTERAR UM AUTOR
						System.out.println("Informe o id do autor que deseja alterar:");
						int id = entrada.nextInt();
						
						System.out.println("Informe o novo primeiro nome do autor:");
						String primeiroAlterar = entrada.next();
						System.out.println("Informe o novo último nome do autor:");
						String ultimoAlterar = entrada.next();
                                                
						String sqlAlterar = " UPDATE authors SET firstName='" + primeiroAlterar + "', lastName='" + ultimoAlterar + "' WHERE authorid = " + id;
						stm.executeUpdate(sqlAlterar);
                                                System.out.println("Alteração realizada com sucesso!");
						break;
					case 3:
						// CONSULTAR AUTORES
						String sqlConsulta = " SELECT authorid, firstName, lastName FROM authors ORDER BY firstName ";
						ResultSet rs = stm.executeQuery(sqlConsulta);
						while (rs.next()) {
							int idConsulta = rs.getInt("authorid");
							String primeiroNomeConsulta = rs.getString("firstName");
                                                        String ultimoNomeConsulta = rs.getString("lastName");
							System.out.println(" Id do autor: "+ idConsulta +" Primeiro nome: " + primeiroNomeConsulta + " ultimo nome:" + ultimoNomeConsulta);
						}
						break;
					case 4:
						// EXCLUIR AUTOR
						System.out.println("Informe o id do autor que deseja excluir:");
						int IDexc = entrada.nextInt();						
						
						String sqlExcluir = " DELETE FROM authors WHERE authorid = " + IDexc;
						stm.executeUpdate(sqlExcluir);
                                                System.out.println("Exclusão realizada com sucesso!");
						break;
					case 5:
						break;
					default:
						System.out.println("Número inválido!");
				}
				
			}while(op!=5);			
			// Fecha a conexão
			con.close();			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // vejamos que erro foi gerado e quem o gerou
		} catch (SQLException e) {
			// se houve algum erro, uma exceção é gerada para informar o erro
			e.printStackTrace(); // vejamos que erro foi gerado e quem o gerou
		} 

	}
}
