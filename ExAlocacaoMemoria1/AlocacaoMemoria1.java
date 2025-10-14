public class AlocacaoMemoria1 {

    // VARIÁVEL A: Variável estática final da classe.
    // Armazenada na Method Area / Metaspace, pois é parte da definição da classe.
    private static final String NOME_CLASSE = "Produto"; 

    public void criarProduto(int id) {
        
        // VARIÁVEL B: Variável local primitiva.
        // Armazenada na Stack, pois é uma variável local de tipo primitivo.
        double preco = 50.0; 
        
        // VARIÁVEL C: Objeto String instanciado com new.
        // A referência 'descricao' está na Stack, mas o objeto "Monitor LED" está na Heap.
        String descricao = new String("Monitor LED");
        
        // VARIÁVEL D: Referência local ao objeto Produto.
        // A referência 'meuProduto' está na Stack, mas o objeto Produto está na Heap.
        Produto meuProduto = new Produto(id, descricao, preco); 
        
        // Ao final do método, todas as variáveis locais (preco, descricao, meuProduto) são removidas da Stack.
        // Os objetos na Heap permanecem até serem coletados pelo Garbage Collector.
    } 

    // Classe interna estática Produto.
    // A estrutura da classe (campos e métodos) é carregada na Method Area / Metaspace.
    static class Produto {
        int id;           // campo primitivo, armazenado na Heap como parte do objeto Produto
        String nome;      // referência a um objeto String, armazenado na Heap
        double valor;     // campo primitivo, armazenado na Heap como parte do objeto Produto

        // Construtor que inicializa os campos do objeto Produto.
        public Produto(int id, String nome, double valor) {
            this.id = id; 
            this.nome = nome; 
            this.valor = valor;
        }
    }
}