public class Produto {
    // 1. Atributos privados
    private String nome;
    private double preco;
    private int qtdemestoque;

    // Getter para Nome
    public String getNome() {
        return nome;
    }

    // Setter para Nome
    public void setNome(String n) {
        this.nome = n;
    }

    // Getter para Preco
    public double getPreco() {
        return preco;
    }

    // Setter para Preco
    public void setPreco(double pr) {
        this.preco = pr;
    }    

    // Getter para QtdEmEstoque
    public double getQtdEmEstoque() {
        return qtdemestoque;
    }

    // Setter para QtdEmEstoque
    public void setQtdEmEstoque(int qt) {
        this.qtdemestoque = qt;
    }
    public static void main(String[] args) {
        // Criando objeto da própria classe
        Produto produto = new Produto();

        // Setando valores
        produto.setNome("João");
        produto.setPreco(20);
        produto.setQtdEmEstoque(8);

        // Imprimindo nome
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preco: " + produto.getPreco());
        System.out.println("Quantidade em Estoque: " + produto.getQtdEmEstoque());
    }
}

