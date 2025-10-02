package br.com.estoque.modelo; // Define o pacote onde esta classe está localizada

/**
 * Classe de Modelo (Dados): Representa um item no estoque.
 * Fica no package br.com.estoque.modelo.
 */
public class Produto {
    // Atributos privados para encapsulamento
    private String nome;         // Nome do produto
    private int quantidade;      // Quantidade disponível no estoque

    // Construtor para inicializar o produto com nome e quantidade
    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    // Método getter para acessar o nome do produto
    public String getNome() {
        return nome;
    }

    // Método getter para acessar a quantidade atual do produto
    public int getQuantidade() {
        return quantidade;
    }

    // Método para adicionar unidades ao estoque
    public void adicionarEstoque(int valor) {
        this.quantidade += valor; // Soma o valor recebido à quantidade atual
    }

    // Método sobrescrito para representar o produto como uma string
    @Override
    public String toString() {
        return nome + " (Qtd: " + quantidade + ")"; // Ex: "Livro Java Avançado (Qtd: 10)"
    }
}
