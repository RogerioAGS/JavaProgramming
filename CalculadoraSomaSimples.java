// Importa a classe Scanner da biblioteca java.util para permitir a leitura de dados do usuário via teclado
import java.util.Scanner;

//O objetivo principal deste programa é realizar a soma de dois números inteiros fornecidos pelo usuário.

// Define a classe principal do programa
public class CalculadoraSomaSimples {

    // Método principal que inicia a execução do programa
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado 'scanner' para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis que armazenarão os números digitados e o resultado da soma
        int primeiroNumero;  // Armazena o primeiro número inteiro digitado pelo usuário
        int segundoNumero;   // Armazena o segundo número inteiro digitado pelo usuário
        int soma;            // Armazena o resultado da soma dos dois números

        // --- ENTRADA DE DADOS ---

        // Solicita ao usuário que digite o primeiro número inteiro
        System.out.print("Por favor, digite o primeiro número inteiro: ");
        // Lê o número digitado e armazena na variável 'primeiroNumero'
        primeiroNumero = scanner.nextInt();

        // Solicita ao usuário que digite o segundo número inteiro
        System.out.print("Agora, digite o segundo número inteiro: ");
        // Lê o número digitado e armazena na variável 'segundoNumero'
        segundoNumero = scanner.nextInt();

        // Fecha o objeto Scanner para liberar os recursos do sistema
        scanner.close();

        // --- PROCESSAMENTO ---

        // Realiza a soma dos dois números digitados
        soma = primeiroNumero + segundoNumero;

        // --- SAÍDA DE DADOS ---

        // Exibe uma linha de separação para destacar o resultado
        System.out.println("\n--- Resultado ---");

        // Exibe o resultado da soma de forma clara e amigável
        System.out.println("A soma dos números " + primeiroNumero + " e " + segundoNumero + " é: " + soma);
    }
}