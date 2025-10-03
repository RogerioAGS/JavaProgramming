// Importa a interface Serializable, necessária para permitir a serialização de objetos
import java.io.Serializable;

/**
 * A classe Produto representa um item com nome, preço e código.
 * Ela implementa a interface Serializable, o que permite que seus objetos
 * sejam convertidos em um stream de bytes para persistência ou transmissão.
 */
public class Produto implements Serializable {

    // Define um identificador de versão da classe para garantir compatibilidade
    // durante o processo de serialização e desserialização.
    private static final long serialVersionUID = 1L;

    // Campo que representa o nome do produto. Será incluído na serialização.
    private String nome;

    // Campo que representa o preço do produto. Também será incluído na serialização.
    private double preco;

    // Campo que representa o código do produto.
    // A palavra-chave 'transient' indica que este campo NÃO será serializado.
    // Isso é útil para dados sensíveis ou temporários que não devem ser persistidos.
    private transient int codigo;

    /**
     * Construtor da classe Produto.
     * Permite criar um objeto Produto com nome, preço e código definidos.
     *
     * @param nome   Nome do produto
     * @param preco  Preço do produto
     * @param codigo Código do produto (não será serializado)
     */
    public Produto(String nome, double preco, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    // Método getter para acessar o nome do produto
    public String getNome() {
        return nome;
    }

    // Método getter para acessar o preço do produto
    public double getPreco() {
        return preco;
    }

    // Método getter para acessar o código do produto
    // Mesmo sendo transient, ainda pode ser acessado normalmente
    public int getCodigo() {
        return codigo;
    }

    /**
     * Método toString sobrescrito para facilitar a visualização do objeto.
     * Exibe os valores dos campos em formato legível.
     * Após a desserialização, o campo 'codigo' será 0 (valor padrão de int),
     * pois não foi incluído no processo de serialização.
     */
    @Override
    public String toString() {
        return "Produto [Nome: " + nome + ", Preço: " + preco + ", Código: " + codigo + "]";
    }
}
