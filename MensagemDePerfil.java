// Importa a classe Scanner para permitir a leitura de dados digitados pelo usuário
import java.util.Scanner;

// Define a classe principal do programa
public class MensagemDePerfil {

    // Método principal que inicia a execução do programa
    public static void main(String[] args) {

        // 1. Cria o objeto Scanner para ler a entrada do usuário via teclado
        Scanner scanner = new Scanner(System.in);

        // 2. Declara as variáveis que armazenarão os dados coletados
        String nomeCompleto;   // Armazena o nome completo do usuário
        String cidade;         // Armazena a cidade onde o usuário mora
        int anoNascimento;     // Armazena o ano de nascimento do usuário

        // --- ENTRADA (INPUT) ---

        // 3. Solicita o nome completo e armazena usando nextLine()
        // nextLine() é ideal para capturar frases com espaços
        System.out.print("Digite seu nome completo: ");
        nomeCompleto = scanner.nextLine();

        // 4. Solicita a cidade e armazena usando nextLine()
        System.out.print("Em qual cidade você mora? ");
        cidade = scanner.nextLine();

        // 5. Solicita o ano de nascimento e armazena usando nextInt()
        // nextInt() lê apenas o número inteiro
        System.out.print("Qual seu ano de nascimento? ");
        anoNascimento = scanner.nextInt();

        // 6. Fecha o Scanner para liberar os recursos do sistema
        scanner.close();

        // --- SAÍDA (OUTPUT) ---

        // 7. Exibe uma linha de separação para destacar o resultado
        System.out.println("---");

        // 8. Exibe todas as informações coletadas em uma única linha
        // Usa concatenação de Strings para montar a mensagem final
        System.out.println("Perfil criado: " + nomeCompleto + ", de " + cidade + ", nascido(a) em " + anoNascimento + ".");
    }
}