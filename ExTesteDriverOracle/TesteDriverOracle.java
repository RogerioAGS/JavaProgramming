// Importação das classes necessárias para trabalhar com JDBC
import java.sql.Connection;   // Representa a conexão com o banco de dados
import java.sql.DriverManager; // Gerencia os drivers JDBC e cria conexões
import java.sql.SQLException;  // Trata exceções relacionadas a SQL

public class TesteDriverOracle {

    // Constantes de conexão com o banco Oracle
    private static final String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:XE"; // URL de conexão no formato JDBC Thin
    private static final String USUARIO = "system"; // Nome de usuário do banco
    private static final String SENHA = "oracle";   // Senha do usuário

    // Nome da classe do driver JDBC Oracle Thin
    private static final String DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";

    public static void main(String[] args) {

        // --- Passo 1: Carregamento explícito do driver JDBC ---
        try {
            System.out.println("Tentando carregar o driver: " + DRIVER_CLASS);

            // Carrega explicitamente a classe do driver JDBC
            // Essa prática era comum em versões antigas do Java (antes do Java 6)
            Class.forName(DRIVER_CLASS);

            System.out.println("Driver JDBC carregado com sucesso.");

        } catch (ClassNotFoundException e) {
            // Tratamento da exceção caso o driver não seja encontrado no classpath
            System.err.println("ERRO: Driver JDBC Oracle não encontrado.");
            System.err.println("Certifique-se de que o arquivo ojdbc8.jar está incluído no classpath do projeto.");
            return; // Encerra o programa se o driver não puder ser carregado
        }

        // --- Passo 2: Estabelecimento da conexão com o banco de dados ---
        try (
            // Tenta estabelecer a conexão usando DriverManager
            Connection conn = DriverManager.getConnection(ORACLE_URL, USUARIO, SENHA)
        ) {
            System.out.println("\nStatus: Conexão estabelecida com sucesso!");

            // Exibe informações sobre o driver JDBC em uso
            System.out.println("Driver utilizado: " + conn.getMetaData().getDriverName());
            System.out.println("Versão do driver: " + conn.getMetaData().getDriverVersion());
            System.out.println("URL do banco: " + conn.getMetaData().getURL());
            System.out.println("Usuário conectado: " + conn.getMetaData().getUserName());

        } catch (SQLException e) {
            // Tratamento de falhas na conexão com o banco
            System.err.println("\nERRO: Falha ao conectar ao banco de dados Oracle.");
            System.err.println("Mensagem: " + e.getMessage());
        }
    }
}
