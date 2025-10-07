// Importação das classes necessárias para trabalhar com JDBC
import java.sql.Connection;   // Representa a conexão com o banco de dados
import java.sql.DriverManager; // Gerencia os drivers JDBC e cria conexões
import java.sql.ResultSet;     // Armazena os resultados de uma consulta SQL
import java.sql.SQLException;  // Trata exceções relacionadas a operações SQL
import java.sql.Statement;     // Permite executar comandos SQL como SELECT, INSERT, etc.

public class ConsultaBasica {

    // Constantes de conexão com o banco de dados Oracle
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE"; // Endereço do banco Oracle local
    private static final String USUARIO = "system"; // Nome de usuário do banco
    private static final String SENHA = "oracle";   // Senha do usuário
    private static final String SQL_SELECT = "SELECT ID, NOME FROM PRODUTOS"; // Comando SQL para recuperar dados da tabela PRODUTOS

    public static void main(String[] args) {

        // Mensagem inicial para indicar o início do teste de conexão e consulta
        System.out.println("Iniciando teste de consulta JDBC...");

        // Bloco try-with-resources: garante que os recursos (Connection, Statement, ResultSet) sejam fechados automaticamente
        try (
            // Estabelece a conexão com o banco de dados usando DriverManager
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            
            // Cria um Statement para enviar comandos SQL ao banco
            Statement stmt = conn.createStatement();
            
            // Executa a consulta SQL e armazena os resultados em um ResultSet
            ResultSet rs = stmt.executeQuery(SQL_SELECT)

        ) {
            // Mensagem de sucesso após criar a conexão e o Statement
            System.out.println("Conexão e Statement criados com sucesso.");
            System.out.println("--- Resultados da Consulta ---");

            // Loop para percorrer cada linha do ResultSet
            while (rs.next()) {
                // Recupera o valor da coluna "ID" como inteiro
                int id = rs.getInt("ID");

                // Recupera o valor da coluna "NOME" como String
                String nome = rs.getString("NOME");

                // Exibe os dados formatados no console
                System.out.println("ID: " + id + ", Nome: " + nome);
            }

            // Mensagem final após exibir todos os resultados
            System.out.println("------------------------------");

        } catch (SQLException e) {
            // Tratamento de exceções específicas de SQL, como erro de sintaxe ou falha de conexão
            System.err.println("ERRO: Falha na execução da consulta JDBC.");
            System.err.println("Mensagem: " + e.getMessage());

        } catch (Exception e) {
            // Tratamento de exceções genéricas e inesperadas
            System.err.println("ERRO Inesperado: " + e.getMessage());
        }
    }
}
