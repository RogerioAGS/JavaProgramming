public class ConstrutorEmail {
    //Método main, ponto de entrada da aplicação. O uso de String[] args permite receber argumentos via linha de comando, embora não sejam usados aqui.
    public static void main(String[] args) {
        //Declaração e inicialização de um array de String com os e-mails dos destinatários. É uma estrutura simples e direta para armazenar múltiplos valores.
        String[] destinatarios = {"ana@dominio.com", "beto@dominio.com", "carla@dominio.com", "daniel@dominio.com"};
        
        //Imprime um cabeçalho para indicar o início da listagem. Boa prática para tornar a saída mais legível.
        System.out.println("Lista de Destinatarios:");
        // 1. Inicializa o StringBuilder (melhor performance para muitas modificacoes)
        //Criação de um objeto StringBuilder. Diferente da classe String, StringBuilder é mutável e mais eficiente para operações repetidas de concatenação.
        StringBuilder listaEmails = new StringBuilder();
        
        // 2. Itera sobre o array e usa append()
        //Loop for-each que percorre o array de e-mails.
        //append(email) adiciona o e-mail à string.
        //append(";") adiciona o delimitador após cada e-mail.
        //Essa abordagem evita o uso de +, que criaria múltiplos objetos String e seria menos eficiente.
        for (String email : destinatarios) {
            listaEmails.append(email);
            listaEmails.append(";"); // Adiciona o delimitador
        }
        //Imprime a string construída até o momento, que inclui um ponto e vírgula extra no final. Isso é útil para mostrar o estado intermediário da string.
        System.out.println("String construida (com delimitador extra): " + listaEmails.toString());

        // 3. Remove o ultimo caractere (o ';' extra)
        //Verifica se a StringBuilder tem conteúdo antes de tentar remover o último caractere.
        //deleteCharAt() remove o ponto e vírgula extra no final, garantindo que a string final esteja corretamente formatada.
        //Boa prática: evita erro de índice negativo em caso de array vazio.
        if (listaEmails.length() > 0) {
            int ultimoIndice = listaEmails.length() - 1;
            listaEmails.deleteCharAt(ultimoIndice);
        }
        //Imprime uma linha divisória para separar visualmente as seções da saída.
        System.out.println("----------------------------------------");
        
        // 4. Imprime o resultado final (convertendo para String)
        //Converte o conteúdo do StringBuilder para uma String com toString().
        //Imprime a string final, agora corretamente formatada.
        String mensagemFinal = listaEmails.toString();
        System.out.println("Lista de E-mails Final: " + mensagemFinal);
    }
}