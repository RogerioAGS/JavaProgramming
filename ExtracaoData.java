import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtracaoData {
    public static void main(String[] args) {
        //Texto de entrada contendo uma data
        String texto = "A reuniao esta marcada para 25/09/2025, anote ai.";

        //Expressão regular com 3 grupos de captura:
        // (\d{2}) → dois dígitos para o dia
        // (\d{2}) → dois dígitos para o mês
        // (\d{4}) → quatro dígitos para o ano
        String regex = "(\\d{2})/(\\d{2})/(\\d{4})";

        //Compila o padrão regex
        Pattern padrao = Pattern.compile(regex);

        //Aplica o padrão ao texto
        Matcher matcher = padrao.matcher(texto);

        System.out.println("Texto Original: " + texto);
        System.out.println("Padrão: " + regex);
        System.out.println("----------------------------------------");

        //Verifica se a data foi encontrada
        if (matcher.find()) {
            // group(0) → corresponde à data completa
            System.out.println("Data Completa: " + matcher.group(0));

            // group(1) → primeiro grupo de captura: dia
            String dia = matcher.group(1);

            // group(2) → segundo grupo de captura: mês
            String mes = matcher.group(2);

            // group(3) → terceiro grupo de captura: ano
            String ano = matcher.group(3);

            //Imprime os componentes extraídos
            System.out.println("Dia (Grupo 1): " + dia);
            System.out.println("Mês (Grupo 2): " + mes);
            System.out.println("Ano (Grupo 3): " + ano);
        } else {
            System.out.println("Data não encontrada no formato DD/MM/AAAA.");
        }
    }
}