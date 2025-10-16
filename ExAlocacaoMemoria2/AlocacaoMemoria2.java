// Classe principal que contém os métodos para demonstrar alocação de memória na pilha
public class AlocacaoMemoria2 {

    // Método A: ponto de entrada do programa
    public static void main(String[] args) { 
        // VARIÁVEL A: variável local do tipo String
        // Armazenada no Frame 1 da pilha (stack). O valor "Inicial" é um objeto alocado no Heap.
        String s = "Inicial"; 
        
        // Chamada 1: invocação do método B
        // Cria o Frame 2 na pilha, acima do Frame 1
        chamarMetodoB(10);     
    }

    // Método B: recebe um inteiro como parâmetro
    public static int chamarMetodoB(int x) { 
        // VARIÁVEL B: variável local do tipo boolean
        // Armazenada no Frame 2 da pilha, junto com o parâmetro x
        boolean flag = true; 
        
        // Chamada 2: invocação do método C
        // Cria o Frame 3 na pilha, acima do Frame 2
        return chamarMetodoC(x, flag); 
    }

    // Método C: recebe dois parâmetros e realiza um cálculo
    public static int chamarMetodoC(int a, boolean b) { 
        // VARIÁVEL C: variável local do tipo int
        // Armazenada no Frame 3 da pilha, junto com os parâmetros a e b
        int resultado = a * 2; 
        
        // Retorna o resultado da multiplicação
        // Após o retorno, o Frame 3 é destruído e a memória de a, b e resultado é liberada
        return resultado;
    } 
}
