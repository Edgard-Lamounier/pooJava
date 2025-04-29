
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws Exception {

        // we need to register the sqldriver we are going to use...
        // this code calls the static block from the driver that registers
        // itself.
        Class.forName("org.postgresql.Driver");

        // run the program
        new Program().run();
    }

    public void run() throws Exception {
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/books", "postgres", "junior2005");
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }

        boolean wasLastOperationInvalid = false;
        do {
            String title = ".: Menu :.";
            String invalidMessage = "Opção inválida";

            String[] options = new String[]{
                "Insert",
                "Read",
                "Update",
                "Delete",
                "Exit",};

            int option = printMenu(title, invalidMessage, options, wasLastOperationInvalid);
            
            if (option == 5) {
                System.out.println("Obrigado por escolher nosso programa!");
                System.exit(0);
            }

            String tabela = ".: TABELAS :.";
            String[] nomes = new String[]{
                "authors",
                "publishers",
                "titles",
                "authorISBN",};

            int nome = printMenu(tabela, invalidMessage, nomes, wasLastOperationInvalid);

            wasLastOperationInvalid = false;

            switch (option) {
                case 1:
                    executeInsertOperation(con, nome);
                    break;

                case 2:
                    executeReadOperation(con, nome);
                    break;

                case 3:
                    executeUpdateOperation(con, nome);
                    break;

                case 4:
                    executeDeleteOperation(con, nome);
                    break;

//                case 5:
//                    System.out.println("Obrigado por escolher nosso programa!");
//                    System.exit(0);
//                    break;

                default:
                    wasLastOperationInvalid = true;
                    break;
            }

        } while (true);
    }

    private void executeInsertOperation(Connection con, int table) {
        try {
            Statement sta = con.createStatement();
            Scanner scanner = new Scanner(System.in);
            String sql = null;

            clearScreen();

            switch (table) {
                case 1:
                    System.out.println("Digite os dados do autor: ");
                    System.out.print("ID:        ");
                    int id = scanner.nextInt();
                    System.out.print("Nome:      ");
                    String nome = scanner.next();
                    System.out.print("Sobrenome: ");
                    String sobrenome = scanner.next();

                    sql = "INSERT INTO authors (\"authorsID\", \"firstName\", \"lastName\") VALUES (" + id + ", '" + nome + "', '" + sobrenome + "')";
                    break;
                    
                case 2:
                    System.out.println("Digite os dados da Editora: ");
                    System.out.print("ID:       ");
                    int pub = scanner.nextInt();
                    System.out.print("Editora:  ");
                    String pubName = scanner.next();
                    
                    sql = "INSERT INTO publishers (\"pubID\", \"pubName\") VALUES (" + pub + ", '" + pubName + "')";
                    break;
                
                case 3:
                    System.out.println("Digite os dados do livro: ");
                    System.out.print("ISBN:         ");
                    int isbn = scanner.nextInt();
                    System.out.print("Título:       ");
                    String titulo = scanner.next();
                    System.out.print("Edição n°:    ");
                    int ed = scanner.nextInt();
                    System.out.print("Ano edição:   ");
                    int copy = scanner.nextInt();
                    System.out.print("ID editora:   ");
                    int pubId = scanner.nextInt();
                    System.out.print("Imagem:       ");
                    String image = scanner.next();
                    System.out.print("Preço:        ");
                    String preco = scanner.next();

                    sql = "INSERT INTO titles (\"isbn\", \"title\", \"edNumber\", \"copyright\", \"pubID\", \"image\", \"price\")" +
                            " VALUES (" + isbn + ", '" + titulo + "', " + ed + ", " + copy + ", " + pubId + ", '" + image + "', " + preco + ")";
                    break;
                    
                case 4:
                    System.out.println("Digite os dados da tabela relacionamento Autor x Título: ");
                    System.out.print("ID do autor: ");
                    int autId = scanner.nextInt();
                    System.out.print("ISBN:        ");
                    int isbnFK = scanner.nextInt();
                    
                    sql = "INSERT INTO authorisbn (\"authorID\", \"isbn\") VALUES (" + autId + ", " + isbnFK + ")";
                    break;
                    
                default:
                    System.out.println("Tabela não enncontrada, tente novamente!");
                    break;
            }

            sta.execute(sql);
            sta.close();
            pause();    
            
        } catch (SQLException e) {
            System.out.println("Erro ao ler a tabela");
        }
    }

    private void executeReadOperation(Connection con, int table) {
        try {
             Statement sta = con.createStatement();
             ResultSet res = null;
             //String sql = null;
             clearScreen();
             
             switch (table) {
                case 1:
                   System.out.println("Tabela autores: ");
                   res = sta.executeQuery("SELECT * FROM authors");
                   while (res.next()) {
                       int id = res.getInt("authorsID");
                       String nome = res.getString("firstName");
                       String sobrenome = res.getString("lastName");
                       System.out.println(id + "\t" + nome + "\t" + sobrenome + "\n");
                   }
                     break;
                case 2:
                     break;
                case 3:
                    break;
                case 4:
                    break;
             }

           
            res.close();
            sta.close();

            pause();
        } catch (SQLException e) {
            System.out.println("Erro ao ler a tabela");
        }

    }

    private void executeUpdateOperation(Connection con, int table) {
        try {
            Statement sta = con.createStatement();
            ResultSet res = null;
            Scanner scanner = new Scanner(System.in);
            String sql = null;

            clearScreen();

            System.out.println("Digite o id da entrada que deseja atualizar: ");
            System.out.print(">>> ");
            int id = scanner.nextInt();
            //scanner.nextLine();
            
            switch (table){
                case 1:
                    sql = "SELECT * FROM authors WHERE \"authorsID\" = " + id;
                    break;
                case 2:
                    sql = "SELECT * FROM publishers WHERE \"pubID\" = " + id;
                    break;
                case 3:
                    sql = "SELECT * FROM titles WHERE \"isbn\" = " + id;
                    break;
                case 4:
                    sql = "SELECT * FROM authorisbn WHERE \"authorID\" = " + id;
                    break;
                default:
                    System.out.println("Tabela não enncontrada, tente novamente!");
                    break;
            }
            
            res = sta.executeQuery(sql);
            
            if (res.next()) {
                switch (table) {
                    case 1:
                        System.out.print("Digite o nome: ");
                        String nome = scanner.next();
                        System.out.print("Digite o sobrenome: ");
                        String sobrenome = scanner.next();
                        
                        sql = "UPDATE authors SET \"firstName\" = '" + nome + "', \"lastName\" = '" + sobrenome + "' WHERE \"authorsID\" = " + id;
                        break;
                    case 2:
                        System.out.print("Digite o nome da editora:  ");
                        String pubName = scanner.next();
                        
                        sql = "UPDATE publishers SET \"pubName\" = '" + pubName + "' WHERE \"pubID\" = " + id;
                        break;
                    case 3:
                        System.out.print("Digite o título: ");
                        String titulo = scanner.next();
                        System.out.print("Digite o nº da edição: ");
                        int ed = scanner.nextInt();
                        System.out.print("Digite o ano edição: ");
                        int copy = scanner.nextInt();
                        System.out.print("Digite o ID da editora: ");
                        int pubId = scanner.nextInt();
                        System.out.print("Digite o nome da imagem: ");
                        String image = scanner.next();
                        System.out.print("Digite o preço: ");
                        String preco = scanner.next();
                        
                        sql = "UPDATE titles SET \"title\" = '" +titulo+ "', \"edNumber\" = " +ed+ ", \"copyright\" = " +copy+ ", \"pubID\" = " +pubId+ ", \"image\" = '" 
                                +image+ "', \"price\" = " +preco+ " WHERE  isbn = " + id;
                        break;
                    case 4:
                        System.out.println("Não é possível atualizar a tabela relacionamento!");
                        pause();
                        break;
                    default:
                        break;
                }
                
                sta.close();
                
                sta = con.createStatement();
                sta.executeUpdate(sql);
            } 
            else {
                System.out.println("Não há entrada de id " + id);
            }

            sta.close();
            pause();
            
        } catch (SQLException e) {
            System.out.println("Erro ao ler a tabela");
        }
    }

    private void executeDeleteOperation(Connection con, int table) {
        try {
            Statement sta = con.createStatement();
            Scanner scanner = new Scanner(System.in);
            String sql = null;

            clearScreen();
            
            System.out.println("Digite o id da entrada que deseja remover: ");
            System.out.print(">>> ");
            int id = scanner.nextInt();
            
            switch (table) {
                case 1:
                    sql = "DELETE FROM authors WHERE \"authorsID\" = " + id;
                    break;
                case 2:
                    sql = "DELETE FROM publishers WHERE \"pubID\" = " + id;
                    break;
                case 3:
                    sql = "DELETE FROM titles WHERE isbn = " + id;
                    break;
                case 4:
                    System.out.println("Não é possível apagar registros da tabela relacionamento!");
                    pause();
                    break;
            }
            
            sta.executeUpdate(sql);
            sta.close();

        } catch (SQLException e) {
            System.out.println("Erro ao ler a tabela");
        }
    }

    private int printMenu(String title, String invalidMessage, String[] options,
            boolean isInvalidMessageVisible) throws IOException {
        clearScreen();

        System.out.println(title);
        for (int i = 0, len = title.length(); i < len; i++) {
            System.out.print('-');
        }
        System.out.println();

        if (isInvalidMessageVisible && (invalidMessage == null || invalidMessage.isEmpty())) {
            System.out.println();
            System.out.println(invalidMessage);
        }

        System.out.println();
        for (int i = 0, len = options.length; i < len; i++) {
            System.out.println((i + 1) + " - " + options[i]);
        }

        System.out.print("\n>>> ");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

//	private int getNextId(Connection con) throws SQLException {
//		Statement sta = con.createStatement();
//		ResultSet res = sta.executeQuery("SELECT max(id) + 1 FROM entry");
//
//		if (res.next()) {
//			return res.getInt(1);
//		} else {
//			return 1;
//		}
//
//	}
    private void clearScreen() {
        System.out.println("\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n");
    }

    private void pause() {
        System.out.println("\nPressione qualquer tecla para continuar...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
