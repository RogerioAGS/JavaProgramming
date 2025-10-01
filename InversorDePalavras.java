// Importa a classe Scanner para permitir a leitura de dados do usuário via teclado
import java.util.Scanner;

public class InversorDePalavras {

    /**
     * Função auxiliar para inverter uma String.
     * @param palavra A string a ser invertida.
     * @return A string invertida.
     */
    public static String inverterString(String palavra) {
        // Usa a classe StringBuilder, que possui o método reverse()
        StringBuilder sb = new StringBuilder(palavra);
        return sb.reverse().toString(); // Retorna a palavra invertida
    }

    public static void main(String[] args) {
        // Cria o objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        String entrada; // Variável para armazenar a linha digitada

        // --- 1. ENTRADA ---

        // Solicita ao usuário que digite três palavras separadas por espaço
        // Usa apenas uma chamada nextLine() para capturar a linha inteira
        System.out.print("Digite três palavras separadas por espaço: ");
        entrada = scanner.nextLine();

        // Exibe a frase original digitada
        System.out.println("Frase original: " + entrada);

        // --- 2. PROCESSAMENTO (Split e Inversão) ---

        // Divide a string em um array de palavras usando espaço como delimitador
        String[] palavras = entrada.split(" ");

        // Verifica se o usuário digitou pelo menos três palavras
        if (palavras.length >= 3) {
            // A segunda palavra está na posição 1 do array
            String palavraAInverter = palavras[1];

            // Chama a função auxiliar para inverter a segunda palavra
            String palavraInvertida = inverterString(palavraAInverter);

            // Substitui a palavra original pela invertida no array
            palavras[1] = palavraInvertida;

            // Junta as palavras novamente em uma única string com espaços
            String fraseModificada = String.join(" ", palavras);

            // --- 3. SAÍDA ---

            // Exibe a frase modificada com a segunda palavra invertida
            System.out.println("Frase modificada: " + fraseModificada);

        } else {
            // Caso o usuário não tenha digitado três palavras, exibe uma mensagem de erro
            System.out.println("Erro: Por favor, digite pelo menos três palavras.");
        }

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
