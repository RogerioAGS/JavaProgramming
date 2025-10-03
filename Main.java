//package br.com.estoque.app;


// Importa classes de outros packages para poder usá-las
import br.com.estoque.modelo.Produto;
import br.com.estoque.servico.ServicoEstoque;


/**
 * Classe Principal da Aplicação (App): Ponto de entrada (método main).
 * Fica no package br.com.estoque.app.
 */
public class Main {


    public static void main(String[] args) {
       
        System.out.println("--- ESTRUTURA DE PACKAGES ---");
        System.out.println("Aplicação Principal: br.com.estoque.app");
        System.out.println("Modelo de Dados:     br.com.estoque.modelo");
        System.out.println("Lógica de Negócio:   br.com.estoque.servico");
        System.out.println("-----------------------------\n");




        // 1. Cria uma instância de Produto (do package 'modelo')
        ProdutoEstoque livro = new ProdutoEstoque("Livro Java Avançado", 10);
       
        // 2. Cria uma instância de ServicoEstoque (do package 'servico')
        ServicoEstoque servico = new ServicoEstoque();
       
        System.out.println("Produto antes da operação: " + livro);
       
        // 3. Usa o ServicoEstoque para operar sobre o Produto,
        // demonstrando o uso de classes de diferentes packages.
        servico.adicionarProduto(livro, 5);
       
        System.out.println("Produto após a operação:  " + livro);
    }
}
