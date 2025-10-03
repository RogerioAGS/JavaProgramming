//package br.com.estoque.modelo;


/**
 * Classe de Modelo (Dados): Representa um item no estoque.
 * Fica no package br.com.estoque.modelo.
 */
public class ProdutoEstoque {
    private String nome;
    private int quantidade;


    public ProdutoEstoque(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }


    public String getNome() {
        return nome;
    }


    public int getQuantidade() {
        return quantidade;
    }


    public void adicionarEstoque(int valor) {
        this.quantidade += valor;
    }


    @Override
    public String toString() {
        return nome + " (Qtd: " + quantidade + ")";
    }
}
