// Declaração da classe pública chamada AlocacaoMemoria3
public class AlocacaoMemoria3 {

    // Campo estático e final: pertence à classe, não a instâncias
    // Armazenado na área de memória chamada Metaspace (antiga Method Area)
    private static final int MAX_VALOR = 1000; 

    // Método principal que inicia a execução do programa
    public static void main(String[] args) {
        
        // Loop que será executado 5 vezes
        for (int i = 0; i < 5; i++) {
            
            // Criação explícita de um novo objeto String
            // Cada objeto é alocado na memória Heap
            new String("Objeto " + i);
            
            // A variável 'i' é uma variável local do método
            // Armazenada na Stack, junto com o contexto da chamada do método main
        }
    }
}
