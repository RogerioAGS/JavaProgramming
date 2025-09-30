import java.util.regex.Pattern;
import java.util.regex.Matcher;

//Objetivo: Identificar e listar todas as palavras com 5 ou mais caracteres dentro de um texto, utilizando:
//-\w{5,}: metacaractere para palavras com 5 ou mais caracteres.
//-Matcher.find(): busca múltiplas ocorrências.
//-Matcher.group(): extrai a palavra encontrada.
public class BuscaPalavrasLongas {
    public static void main(String[] args) {
        // Texto de entrada para análise
        String texto = "Este eh um exercicio sobre Java e Expressoes Regulares em programacao.";

        // Expressão regular: \w{5,}
        // \w → caractere de palavra (letras, dígitos e underscore)
        // {5,} → 5 ou mais ocorrências consecutivas
        String regex = "\\w{5,}";

        //Compila o padrão regex
        Pattern padrao = Pattern.compile(regex);

        //Aplica o padrão ao texto
        Matcher matcher = padrao.matcher(texto);

        System.out.println("Texto em análise: " + texto);
        System.out.println("----------------------------------------");
        System.out.println("Palavras com 5 ou mais caracteres:");

        int contador = 0;

        //Loop para encontrar todas as ocorrências
        while (matcher.find()) {
            // matcher.group() retorna a palavra encontrada
            String palavraEncontrada = matcher.group();
            System.out.println(" - " + palavraEncontrada);
            contador++;
        }

        System.out.println("----------------------------------------");
        System.out.println("Total de palavras longas encontradas: " + contador);
    }
}