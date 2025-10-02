package infra.data; // Define o pacote onde esta classe está localizada

/**
 * Classe ProdutoDAO (Data Access Object).
 * Responsável por simular operações de acesso ao banco de dados
 * utilizando as configurações definidas em DatabaseConfig.
 */
public class ProdutoDAO {

    // Construtor que exibe uma mensagem ao ser chamado
    public ProdutoDAO() {
        System.out.println("ProdutoDAO inicializado.");
    }

    /**
     * Método que simula a abertura de uma conexão com o banco.
     * Utiliza as constantes da classe DatabaseConfig.
     */
    public void conectar() {
        System.out.println("\nTentando conectar ao banco de dados...");
        System.out.println("URL: " + DatabaseConfig.DB_URL);       // Acessa a URL do banco
        System.out.println("Usuário: " + DatabaseConfig.DB_USER); // Acessa o usuário
        System.out.println("Senha: " + DatabaseConfig.DB_PASSWORD); // Acessa a senha
        System.out.println("Conexão simulada com sucesso!");
    }
}
