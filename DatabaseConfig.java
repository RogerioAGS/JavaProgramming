package infra.data; // Define o pacote onde esta classe está localizada

/**
 * Classe que armazena as configurações de conexão com o banco de dados.
 * O uso de 'public static final' garante que esses valores:
 * - Sejam constantes (final): não podem ser alterados.
 * - Pertençam à classe (static): acessíveis sem instanciar.
 * - Sejam visíveis globalmente (public): acessíveis de qualquer lugar.
 */
public class DatabaseConfig {

    // URL de conexão JDBC simulada
    public static final String DB_URL = "jdbc:mysql://localhost:3306/estoque_db";

    // Usuário do banco de dados
    public static final String DB_USER = "usuario_app";

    // Senha do banco de dados
    public static final String DB_PASSWORD = "senha123";

    // Construtor privado para impedir instanciamento
    private DatabaseConfig() {
        // Esta classe serve apenas para armazenar constantes
    }
}
