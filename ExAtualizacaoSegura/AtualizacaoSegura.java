import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AtualizacaoSegura {

    // Constantes de conexão com o banco de dados Oracle
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE"; // Endereço do banco
    private static final String USUARIO = "system"; // Usuário do banco
    private static final String SENHA = "oracle";   // Senha do banco

    public static void main(String[] args) {

        // ID do produto a ser atualizado
        int produtoId = 101;

        // Novo preço que será aplicado ao produto
        double novoPreco = 785.50;

        // 1. Definindo a instrução SQL com placeholders (?) para segurança
        String sql = "UPDATE PRODUTOS SET PRECO = ? WHERE ID = ?";

        System.out.println("Iniciando atualização com PreparedStatement...");

        // 2. Usando try-with-resources para garantir fechamento automático da conexão e do PreparedStatement
        try (
            // 🔌 Estabelecendo conexão com o banco
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);

            // Criando o PreparedStatement com a instrução SQL segura
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            // 3. Vinculando o novo preço ao primeiro placeholder (?)
            ps.setDouble(1, novoPreco); // índice 1 corresponde ao primeiro '?'

            // 4. Vinculando o ID do produto ao segundo placeholder (?)
            ps.setInt(2, produtoId); // índice 2 corresponde ao segundo '?'

            System.out.println("SQL preparado para execução: " + sql);

            // 5. Executando a atualização no banco
            int linhasAfetadas = ps.executeUpdate(); // retorna o número de linhas modificadas

            // 6. Verificando se a atualização foi bem-sucedida
            if (linhasAfetadas > 0) {
                System.out.println("✅ Sucesso! " + linhasAfetadas + " linha(s) atualizada(s).");
            } else {
                System.out.println("⚠️ Nenhuma linha foi atualizada. O ID " + produtoId + " pode não existir.");
            }

        } catch (SQLException e) {
            // Tratamento de erro em caso de falha na execução
            System.err.println("ERRO: Falha na execução do PreparedStatement.");
            System.err.println("Mensagem: " + e.getMessage());
        }
    }
}
