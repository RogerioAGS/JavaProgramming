package br.com.estoque.servico; // Define o pacote onde esta classe está localizada

// Importa a classe Produto do pacote modelo para poder usá-la aqui
import br.com.estoque.modelo.Produto;

/**
 * Classe de Serviço (Lógica): Contém regras de negócio.
 * Fica no package br.com.estoque.servico.
 */
public class ServicoEstoque {

    /**
     * Método que simula a adição de produtos ao estoque.
     * Aplica uma regra simples: só adiciona se o valor for positivo.
     */
    public void adicionarProduto(Produto p, int valor) {
        if (valor > 0) {
            // Chama o método da classe Produto para adicionar ao estoque
            p.adicionarEstoque(valor);
            // Imprime um log informando a operação realizada
            System.out.println("LOG: Adicionado " + valor + " unidades de " + p.getNome() + ".");
        } else {
            // Caso o valor seja inválido, imprime uma mensagem de erro
            System.out.println("LOG: Valor de adição deve ser positivo.");
        }
    }
}
