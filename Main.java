package br.com.estoque.app; // Define o pacote onde esta classe está localizada

// Importa as classes necessárias de outros pacotes
import br.com.estoque.modelo.Produto;
import br.com.estoque.servico.ServicoEstoque;

/**
 * Classe Principal da Aplicação (App): Ponto de entrada (método main).
 * Fica no package br.com.estoque.app.
 */
public class Main {

    // Método principal que inicia a aplicação
    public static void main(String[] args) {

        // Imprime a estrutura de pacotes para demonstrar organização
        System.out.println("--- ESTRUTURA DE PACKAGES ---");
        System.out.println("Aplicação Principal: br.com.estoque.app");
        System.out.println("Modelo de Dados:     br.com.estoque.modelo");
        System.out.println("Lógica de Negócio:   br.com.estoque.servico");
        System.out.println("-----------------------------\n");

        // Cria uma instância de Produto com nome e quantidade inicial
        Produto livro = new Produto("Livro Java Avançado", 10);

        // Cria uma instância do serviço de estoque
        ServicoEstoque servico = new ServicoEstoque();

        // Mostra o estado do produto antes da operação
        System.out.println("Produto antes da operação: " + livro);

        // Usa o serviço para adicionar unidades ao estoque do produto
        servico.adicionarProduto(livro, 5);

        // Mostra o estado do produto após a operação
        System.out.println("Produto após a operação:  " + livro);
    }
}
