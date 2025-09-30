//Pattern: representa o padrão regex compilado.
import java.util.regex.Pattern;
//Matcher: aplica esse padrão a uma string específica.
import java.util.regex.Matcher;

//Declaração da classe principal. O nome é claro e descritivo, indicando que o foco é validar códigos numéricos.
public class ValidacaoCodigoNumerico {
    //Objetivo: Validar se uma string contém exatamente 6 dígitos numéricos, usando expressões regulares com os metacaracteres \d (dígito) e o quantificador {6} (quantidade exata).
    //Método principal da aplicação. É onde o programa começa a ser executado.
    public static void main(String[] args) {
        
        // Define o padrão regex: exatamente 6 dígitos numéricos
        // \d representa um dígito, {6} indica que devem ser 6 dígitos
        // Em Java, usamos \\ para escapar a barra invertida
        //Define o padrão regex:
        //\d representa um dígito (0 a 9).
        //{6} exige exatamente 6 ocorrências.
        //Em Java, a barra invertida precisa ser escapada com outra barra (\\), por isso \\d.
        String regex = "\\d{6}";
        //Compila o padrão regex em um objeto Pattern, que será usado para validar múltiplas strings.
        Pattern padrao = Pattern.compile(regex);

        //Exemplos de códigos para testar
        //Define quatro exemplos de códigos para testar:
        //Um válido e três inválidos por diferentes motivos: quantidade errada de dígitos ou presença de caracteres não numéricos.
        String[] codigos = {
            "123456",   // ✅ Válido
            "12345",    // ❌ Inválido (5 dígitos)
            "12345a",   // ❌ Inválido (contém letra)
            "1234567",  // ❌ Inválido (7 dígitos)
            "abcdef",   // ❌ Inválido (só letras)
            "000000"    // ✅ Válido (todos zeros)
        };

        //Imprime o padrão usado e uma linha divisória para organizar visualmente a saída.
        System.out.println("Padrão usado: " + regex);
        System.out.println("----------------------------------------");

        //Testa cada código usando a função auxiliar
        //Chama a função auxiliar para testar cada código individualmente.

        for (String codigo : codigos) {
            testarCodigo(padrao, codigo);
        }
    }

    //Função auxiliar para validar e imprimir o resultado
    //Cria um Matcher que aplica o padrão à string codigo.
    public static void testarCodigo(Pattern padrao, String codigo) {
        Matcher matcher = padrao.matcher(codigo);
        //Usa matches() para verificar se a string inteira corresponde ao padrão.
        //Se apenas parte da string corresponder, o resultado será false.
        boolean isValido = matcher.matches(); // Verifica se a string inteira corresponde ao padrão
        //Imprime o resultado da validação de forma clara e formatada.
        //Usa operador ternário para decidir entre "VALIDO" e "INVALIDO".
        System.out.printf("Código '%s': %s%n", codigo, isValido ? "✅ VÁLIDO" : "❌ INVÁLIDO");
    }
}