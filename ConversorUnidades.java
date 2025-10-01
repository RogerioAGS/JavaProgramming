// Importa a classe Scanner da biblioteca java.util para permitir a leitura de dados do usuário via teclado
import java.util.Scanner;

// Define a classe principal chamada ConversorUnidades
public class ConversorUnidades {

    // Método principal que inicia a execução do programa
    public static void main(String[] args) {

        // 1. Cria um objeto Scanner chamado 'scanner' para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // 2. Declara duas variáveis do tipo double para armazenar:
        // - o valor digitado em metros
        // - o valor convertido em centímetros
        double valorEmMetros;
        double valorEmCentimetros;

        // 3. Define uma constante chamada FATOR_CONVERSAO com valor 100.0
        // Isso representa que 1 metro equivale a 100 centímetros
        final double FATOR_CONVERSAO = 100.0;

        // --- ENTRADA DE DADOS ---

        // 4. Solicita ao usuário que digite um valor em metros
        // O uso de System.out.print mantém o cursor na mesma linha
        System.out.print("Digite o valor em metros (ex: 1,75): ");

        // 5. Lê o valor digitado pelo usuário e armazena na variável 'valorEmMetros'
        // O método nextDouble() é usado para ler números com ponto flutuante
        valorEmMetros = scanner.nextDouble();

        // 6. Fecha o objeto Scanner para liberar os recursos do sistema
        scanner.close();

        // --- PROCESSAMENTO ---

        // 7. Calcula o valor equivalente em centímetros
        // Multiplica o valor em metros pelo fator de conversão
        valorEmCentimetros = valorEmMetros * FATOR_CONVERSAO;

        // --- SAÍDA DE DADOS ---

        // 8. Exibe uma linha de separação para destacar o resultado
        System.out.println("\n--- Conversão ---");

        // 9. Imprime o resultado da conversão de forma clara e amigável
        // Exibe tanto o valor original em metros quanto o resultado em centímetros
        System.out.println(valorEmMetros + " metros equivalem a " + valorEmCentimetros + " centímetros.");
    }
}