// Importa as classes necessárias para leitura e escrita de arquivos com buffer
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Define a classe principal do programa
public class NumeradorDeLinhas {

    // Método principal que inicia a execução do programa
    public static void main(String[] args) {

        // Define os nomes dos arquivos de entrada e saída
        String arquivoEntrada = "entrada.txt";           // Arquivo original com o conteúdo
        String arquivoSaida = "saida_numerada.txt";      // Arquivo que será gerado com numeração

        // Mensagens informativas no console
        System.out.println("Processando o arquivo: " + arquivoEntrada);
        System.out.println("Gerando arquivo de saída: " + arquivoSaida + "\n");

        // Inicializa o contador de linhas
        int contadorLinhas = 1;

        // Usa try-with-resources para garantir o fechamento automático dos streams
        try (
            // Cria um BufferedReader para leitura eficiente linha por linha
            BufferedReader leitor = new BufferedReader(new FileReader(arquivoEntrada));

            // Cria um BufferedWriter para escrita eficiente no novo arquivo
            BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoSaida))
        ) {
            String linha; // Variável para armazenar cada linha lida

            // Lê o arquivo linha por linha até que readLine() retorne null (fim do arquivo)
            while ((linha = leitor.readLine()) != null) {

                // Constrói a nova linha com prefixo numérico
                String novaLinha = contadorLinhas + ": " + linha;

                // Escreve a nova linha no arquivo de saída
                escritor.write(novaLinha);

                // Adiciona uma quebra de linha após cada escrita
                escritor.newLine();

                // Exibe no console a linha processada
                System.out.println("Linha processada: " + novaLinha);

                // Incrementa o contador para a próxima linha
                contadorLinhas++;
            }

        } catch (IOException e) {
            // Trata qualquer erro de entrada/saída (ex: arquivo não encontrado)
            System.err.println("\n--- ERRO de I/O ---");
            System.err.println("Ocorreu um erro no processamento: " + e.getMessage());
        }

        // Mensagem final com o total de linhas processadas
        System.out.println("\nProcessamento finalizado. Total de " + (contadorLinhas - 1) + " linhas gravadas.");
    }
}
