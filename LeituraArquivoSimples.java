// Importa as classes necessárias para leitura de arquivo e tratamento de exceções
import java.io.FileReader;
import java.io.IOException;

// Define a classe principal do programa
public class LeituraArquivoSimples {

    // Método principal que inicia a execução do programa
    public static void main(String[] args) {

        // Nome do arquivo a ser lido (deve estar na raiz do projeto)
        String nomeArquivo = "entrada.txt";

        // Declara o objeto FileReader fora do try para poder acessá-lo no finally
        FileReader leitor = null;

        // Mensagem inicial indicando o início da leitura
        System.out.println("Iniciando a leitura do arquivo: " + nomeArquivo + "\n");

        try {
            // 1. Instancia o FileReader para abrir o arquivo em modo leitura
            leitor = new FileReader(nomeArquivo);

            int caractereLido; // Variável para armazenar o código ASCII do caractere lido

            // 2. Loop para ler caractere por caractere até o fim do arquivo
            // O método read() retorna -1 quando não há mais caracteres para ler
            while ((caractereLido = leitor.read()) != -1) {
                // Converte o código ASCII para caractere e imprime no console
                System.out.print((char) caractereLido);
            }

        } catch (IOException e) {
            // 3. Trata qualquer exceção de I/O (como arquivo não encontrado ou erro de leitura)
            System.err.println("\n--- ERRO de I/O ---");
            System.err.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());

        } finally {
            // 4. Garante que o recurso será fechado mesmo que ocorra uma exceção
            try {
                if (leitor != null) {
                    leitor.close(); // Fecha o FileReader
                    System.out.println("\n\nLeitor de arquivo fechado com sucesso.");
                }
            } catch (IOException e) {
                // Trata exceção caso ocorra erro ao fechar o arquivo
                System.err.println("Erro ao tentar fechar o arquivo: " + e.getMessage());
            }
        }
    }
}
