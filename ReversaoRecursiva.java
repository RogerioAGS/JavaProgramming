public class ReversaoRecursiva {
    public static void main(String[] args) {
        //Define a string original que será invertida
        String original = "JAVA";

        //Chama o método recursivo para inverter a string
        String invertida = reverterString(original);

        //Exibe os resultados
        System.out.println("String Original: " + original);
        System.out.println("----------------------------------------");
        System.out.println("String Invertida (Recursiva): " + invertida);
    }

    /**
     * Método recursivo para inverter uma string.
     * Regras:
     * - Caso base: se a string for nula, vazia ou tiver um único caractere, retorna ela mesma.
     * - Chamada recursiva: inverte o restante da string e adiciona o primeiro caractere no final.
     */
    public static String reverterString(String texto) {
        //Caso base: string nula ou com 0 ou 1 caractere
        if (texto == null || texto.length() <= 1) {
            return texto;
        }

        //Chamada recursiva:
        // - texto.substring(1): remove o primeiro caractere
        // - texto.charAt(0): pega o primeiro caractere
        // - A inversão ocorre ao retornar das chamadas recursivas
        return reverterString(texto.substring(1)) + texto.charAt(0);
    }
}