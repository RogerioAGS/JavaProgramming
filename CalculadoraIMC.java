// Importa a classe Scanner para permitir a leitura de dados do usuário via teclado
import java.util.Scanner;

// Define a classe principal chamada CalculadoraIMC
public class CalculadoraIMC {

    // Método principal que inicia a execução do programa
    public static void main(String[] args) {

        // Cria o objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declara as variáveis do tipo double para armazenar os dados
        double peso;   // Peso em quilogramas
        double altura; // Altura em metros
        double imc;    // Índice de Massa Corporal calculado

        // --- 1. ENTRADA (INPUT) ---

        // Solicita ao usuário que digite o peso
        // Usa nextDouble() para ler valores com ponto flutuante
        System.out.print("Digite seu peso em kg (ex: 75,5): ");
        peso = scanner.nextDouble();

        // Solicita ao usuário que digite a altura
        System.out.print("Digite sua altura em metros (ex: 1,75): ");
        altura = scanner.nextDouble();

        // Fecha o Scanner para liberar os recursos do sistema
        scanner.close();

        // --- 2. PROCESSAMENTO ---

        // Calcula o IMC usando a fórmula: IMC = peso / (altura * altura)
        imc = peso / (altura * altura);

        // --- 3. SAÍDA (OUTPUT FORMATADO) ---

        // Exibe uma linha de separação para destacar o resultado
        System.out.println("\n--- Resultado ---");

        // Usa System.out.printf para formatar o valor com duas casas decimais
        // %.2f → formata o número como ponto flutuante com 2 casas decimais
        // %n → quebra de linha (equivalente ao \n, mas mais portátil)
        System.out.printf("Seu IMC calculado é: %.2f%n", imc);
    }
}