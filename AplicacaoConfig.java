import infra.data.DatabaseConfig;
import infra.data.ProdutoDAO;

/**
 * Classe principal que demonstra o uso das constantes de configuração
 * e a simulação de uma conexão com o banco de dados.
 */
public class AplicacaoConfig {

    public static void main(String[] args) {

        System.out.println("--- DEMONSTRAÇÃO DE ACESSO ÀS CONSTANTES ---");

        // Acessando as constantes diretamente da classe DatabaseConfig
        System.out.println("1. Acessando DB_URL: " + DatabaseConfig.DB_URL);
        System.out.println("2. Acessando DB_USER: " + DatabaseConfig.DB_USER);
        System.out.println("3. Acessando DB_PASSWORD: " + DatabaseConfig.DB_PASSWORD);

        System.out.println("\n-------------------------------------------");

        // Cria uma instância do DAO e simula a conexão
        ProdutoDAO dao = new ProdutoDAO();
        dao.conectar();
    }
}
