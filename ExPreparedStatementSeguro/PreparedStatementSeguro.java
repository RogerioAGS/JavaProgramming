// Importação das classes necessárias para trabalhar com JDBC
import java.sql.Connection;         // Representa a conexão com o banco de dados
import java.sql.DriverManager;      // Gerencia os drivers JDBC e cria conexões
import java.sql.PreparedStatement;  // Permite executar comandos SQL com segurança (evita SQL Injection)
import java.sql.SQLException;       // Trata exceções relacionadas a SQL
import java.sql.Statement;          // Permite executar comandos SQL simples (sem segurança contra SQL Injection)

public class PreparedStatementSeguro {

    // Constantes de Conexão com o banco Oracle
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE"; // Endereço do banco Oracle local
    private static final String USUARIO = "system"; // Usuário do banco
    private static final String SENHA = "oracle";   // Senha do usuário

    public static void main(String[] args) {

        // Dados simulados como se viessem de um formulário ou entrada do usuário
        int novoId = 3;
        String novoNome = "Teclado Mecânico";
        double novoPreco = 450.00;

        System.out.println("Iniciando teste de INSERT seguro com JDBC...");

        // Bloco try-with-resources para garantir fechamento automático da conexão
        try (
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA)
        ) {
            System.out.println("Conexão estabelecida com sucesso.");

            // --- PARTE 1: Demonstração Insegura (Apenas para fins de estudo) ---
            // NUNCA use esse método em produção!
            String sqlInseguro = "INSERT INTO PRODUTOS (ID, NOME, PRECO) VALUES (" 
                               + novoId + ", '" + novoNome + "', " + novoPreco + ")";

            try (Statement stmtInseguro = conn.createStatement()) {
                int linhasAfetadas = stmtInseguro.executeUpdate(sqlInseguro);
                System.out.println("Linhas afetadas (Inseguro): " + linhasAfetadas);
            }

            // Risco: Vulnerabilidade a SQL Injection
            // Exemplo de ataque: Se o nome fosse "'); DROP TABLE PRODUTOS; --", o banco poderia executar comandos destrutivos

            // --- PARTE 2: Implementação SEGURA (Recomendada) ---
            // Usa PreparedStatement com placeholders (?) para evitar SQL Injection
            String sqlSeguro = "INSERT INTO PRODUTOS (ID, NOME, PRECO) VALUES (?, ?, ?)";

            try (
                PreparedStatement ps = conn.prepareStatement(sqlSeguro)
            ) {
                // Vincula os valores às posições dos placeholders
                ps.setInt(1, novoId);         // 1º placeholder: ID
                ps.setString(2, novoNome);    // 2º placeholder: NOME
                ps.setDouble(3, novoPreco);   // 3º placeholder: PRECO

                // Executa o comando SQL seguro
                int linhasAfetadasSeguras = ps.executeUpdate();

                System.out.println("INSERT Seguro executado com sucesso.");
                System.out.println("Linhas afetadas: " + linhasAfetadasSeguras);
            }

        } catch (SQLException e) {
            // Tratamento de erros relacionados a SQL
            System.err.println("ERRO: Falha na execução da operação JDBC.");
            System.err.println("Mensagem: " + e.getMessage());

        } catch (Exception e) {
            // Tratamento de erros inesperados
            System.err.println("ERRO Inesperado: " + e.getMessage());
        }
    }
}
