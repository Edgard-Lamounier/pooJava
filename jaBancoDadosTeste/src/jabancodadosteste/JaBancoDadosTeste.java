/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jabancodadosteste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Edgard Lamounier
 */
public class JaBancoDadosTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
			// Registrar um driver
			Class.forName("com.mysql.jdbc.Driver");
			// Registrado o driver, vamos estabelecer uma conexão
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_bcoaluno",
					"root", "root");
			// Após estabelecermos a conexão com o banco de dados
			// Método createStatement para criar o Statement 
			Statement stm = con.createStatement(); // cria o comando SQL
			// CADASTRA UM ALUNO
			// Entrada de dados
			Scanner entrada = new Scanner(System.in);
			System.out.println("Informe o nome do aluno que deseja cadastrar:");
			String nomeAluno = entrada.nextLine();
			// Montar o comando SQL para inserir
			String sqlCadastro = " INSERT INTO tb_aluno (nome) VALUES ('" + nomeAluno + "')";
			stm.executeUpdate(sqlCadastro);
			// CONSULTA ALUNOS
			// Montar o comando SQL
			String sqlConsulta = " SELECT * FROM tb_aluno ORDER BY nome ";
			// Executar o SQL (a query) no banco de dados
			ResultSet rs = stm.executeQuery(sqlConsulta);
			// O método next () informa se houve resultados e posiciona o cursor
			// do banco na próxima linha disponível para recuperação
			while (rs.next()) {
				// Os métodos getXXX recuperam os dados de acordo com o tipo SQL do dado:
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				System.out.println(" ID do aluno: " + id + 
						           " nome: " + nome);
			}
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
