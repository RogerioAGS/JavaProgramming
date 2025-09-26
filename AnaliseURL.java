public class AnaliseURL {
    //Método principal (main) onde o programa começa a ser executado.
    //String[] args permite que argumentos sejam passados pela linha de comando (não usados aqui).
    public static void main(String[] args) {
        //Declara e inicializa uma variável url com uma URL de exemplo.
        String url = "https://www.oracle.com/java/documentation";
        //Imprime a URL que será analisada e uma linha separadora para organizar a saída.
        System.out.println("URL em análise: " + url);
        System.out.println("----------------------------------------");
        // 1. Verificar o protocolo (http ou https)
        //Usa o método startsWith() para verificar se a URL começa com http:// ou https://.
        //Retorna true ou false e armazena nas variáveis usaHttp e usaHttps.
        boolean usaHttp = url.startsWith("http://");
        boolean usaHttps = url.startsWith("https://");
        //Imprime os resultados da verificação do protocolo.
        System.out.println("Usa HTTPS? " + usaHttps);
        System.out.println("Usa HTTP?  " + usaHttp);
        // 2. Verificar se contém o indicador de domínio (.com)
        //Usa o método contains() para verificar se a URL contém o texto .com, indicando que é um domínio comercial.
        boolean isComercial = url.contains(".com");
        //Imprime o resultado da verificação.
        System.out.println("Contém .com? " + isComercial);
        // 3. Extrair o domínio
        //indexOf("://") encontra a posição onde o protocolo termina (ex: https://).
        //O domínio começa 3 caracteres depois de ://, por isso somamos 3.
        int inicioProtocolo = url.indexOf("://");
        int inicioDominio = inicioProtocolo + 3;
        //indexOf("/", inicioDominio) procura a próxima / após o início do domínio.
        //Se não encontrar (-1), significa que a URL termina no domínio, então usamos url.length() como fim.
        int fimDominio = url.indexOf("/", inicioDominio);
        if (fimDominio == -1) {
            //Usa substring() para extrair o texto entre inicioDominio e fimDominio, que é o nome do domínio.
            fimDominio = url.length();
        }
        String dominio = url.substring(inicioDominio, fimDominio);
        //Imprime o domínio extraído e uma linha separadora.
        System.out.println("----------------------------------------");
        System.out.println("Domínio Extraído: " + dominio);
    }
}
