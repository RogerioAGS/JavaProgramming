// Importação das classes necessárias para trabalhar com JDBC
import java.sql.Connection;   // Representa a conexão com o banco de dados
import java.sql.DriverManager; // Gerencia os drivers e cria conexões
import java.sql.SQLException;  // Trata exceções relacionadas a SQL
import java.sql.Statement;     // Permite executar comandos SQL
import java.sql.ResultSet;     // Armazena os resultados de uma consulta SQL

// Definição da classe principal
public class TesteConexao {

    // 1. Definição das constantes de conexão
    // URL: Endereço do banco de dados Oracle usando o driver JDBC Thin
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    
    // USUARIO: Nome de usuário do banco de dados
    private static final String USUARIO = "system";
    
    // SENHA: Senha correspondente ao usuário
    private static final String SENHA = "oracle";

    // Método principal que será executado ao rodar o programa
    public static void main(String[] args) {
        
        // 2. Declaração das variáveis Statement e ResultSet
        // Mesmo que não sejam usadas neste exemplo, é uma boa prática declará-las
        Statement stmt = null;
        ResultSet rs = null;

        // 3. Bloco try-with-resources para garantir o fechamento automático da conexão
        // O objeto Connection será fechado automaticamente ao final do bloco
        try (
            // Tentativa de estabelecer a conexão com o banco de dados
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA)
        ) {
            // 4. Mensagem de sucesso se a conexão for estabelecida
            System.out.println("Status: Conexão estabelecida com sucesso!");

            // Verificação adicional para garantir que a conexão está aberta
            if (conn != null && !conn.isClosed()) {
                System.out.println("Conexão está aberta e pronta para uso.");
            }

        // 5. Tratamento de exceções específicas de SQL
        } catch (SQLException e) {
            // Mensagem de erro personalizada
            System.err.println("ERRO: Falha ao estabelecer a conexão JDBC.");
            
            // Exibe o código SQL State que pode ajudar na identificação do erro
            System.err.println("Código SQL State: " + e.getSQLState());
            
            // Exibe a mensagem detalhada da exceção
            System.err.println("Mensagem: " + e.getMessage());

        // 6. Tratamento de outras exceções inesperadas
        } catch (Exception e) {
            // Mensagem genérica para qualquer outro tipo de erro
            System.err.println("ERRO Inesperado: " + e.getMessage());
        }
    }
}
