import java.io.FileOutputStream;
import java.io.IOException;

public class EscritaDadosBrutos {

    public static void main(String[] args) {

        // 1. Cria um array de bytes com valores numéricos
        // Cada número representa um byte que será gravado no arquivo
        byte[] dados = {10, 20, 30, 40, 50, 60, 70};

        // Nome do arquivo de saída
        String nomeArquivo = "dados_brutos.dat";

        // Mensagem inicial indicando o início da escrita
        System.out.println("Iniciando a escrita de " + dados.length + " bytes no arquivo: " + nomeArquivo);

        // 2. Usa try-with-resources para garantir o fechamento automático do stream
        // FileOutputStream é usado para gravar dados binários (byte stream)
        try (FileOutputStream outputStream = new FileOutputStream(nomeArquivo)) {

            // 3. Grava o array de bytes no arquivo usando o método write()
            outputStream.write(dados);

            // Mensagem de sucesso
            System.out.println("Escrita concluída com sucesso.");

        } catch (IOException e) {
            // 4. Trata exceções de I/O (como erro de permissão ou caminho inválido)
            System.err.println("\n--- ERRO de I/O ---");
            System.err.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }

        // Observação: O arquivo gerado contém dados binários.
        // Se aberto em um editor de texto, os bytes podem aparecer como símbolos não legíveis.
    }
}
