import java.io.*;

public class SerializacaoEDesserializacao {

    // Nome do arquivo onde o objeto será salvo
    private static final String ARQUIVO_SER = "produto.ser";

    public static void main(String[] args) {

        // 1. Criação do Objeto Original
        // O campo 'codigo' é marcado como transient e não será salvo na serialização
        Produto original = new Produto("Celular S10", 1500.0, 101);

        System.out.println("--- 1. OBJETO ORIGINAL ---");
        System.out.println("Objeto Original: " + original);
        System.out.println("Código Original (transient): " + original.getCodigo());

        // ----------------------------------------
        // A. SERIALIZAÇÃO (Salvando o Objeto)
        // ----------------------------------------
        System.out.println("\n--- 2. SERIALIZANDO Objeto para o arquivo: " + ARQUIVO_SER);

        try (
            // Cria um fluxo de saída para o arquivo
            FileOutputStream fileOut = new FileOutputStream(ARQUIVO_SER);
            // Cria um fluxo de saída de objetos para serializar o objeto Produto
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut)
        ) {
            // Escreve o objeto no arquivo
            objOut.writeObject(original);
            System.out.println("Serialização concluída. Estado salvo.");

        } catch (IOException i) {
            // Trata erro de escrita no arquivo
            i.printStackTrace();
            return;
        }

        // ----------------------------------------
        // B. DESSERIALIZAÇÃO (Carregando o Objeto)
        // ----------------------------------------
        System.out.println("\n--- 3. DESSERIALIZANDO Objeto do arquivo: " + ARQUIVO_SER);
        Produto restaurado = null;

        try (
            // Cria um fluxo de entrada para ler o arquivo
            FileInputStream fileIn = new FileInputStream(ARQUIVO_SER);
            // Cria um fluxo de entrada de objetos para desserializar o objeto Produto
            ObjectInputStream objIn = new ObjectInputStream(fileIn)
        ) {
            // Lê o objeto do arquivo e faz o casting para Produto
            restaurado = (Produto) objIn.readObject();
            System.out.println("Desserialização concluída. Objeto restaurado.");

        } catch (IOException i) {
            // Trata erro de leitura do arquivo
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            // Trata erro caso a classe Produto não seja encontrada
            System.out.println("Classe Produto não encontrada.");
            c.printStackTrace();
            return;
        }

        // ----------------------------------------
        // 4. COMPROVAÇÃO DO EFEITO TRANSIENT
        // ----------------------------------------
        System.out.println("\n--- 4. COMPROVAÇÃO ---");
        System.out.println("Objeto Restaurado: " + restaurado);

        // Exibe os campos do objeto restaurado
        System.out.println("\nEfeito Transient:");
        System.out.println("Nome (Salvo): " + restaurado.getNome());
        System.out.println("Preço (Salvo): " + restaurado.getPreco());
        System.out.println("Código (Transient, PERDIDO): " + restaurado.getCodigo());
    }
}
