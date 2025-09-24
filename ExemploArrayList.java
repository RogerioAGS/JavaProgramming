import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        // Criamos uma lista que só aceita nomes (String)
        ArrayList<String> listaPresenca = new ArrayList<>();

        // 1. Adicionar nomes à lista (eles são adicionados no final)
        System.out.println("--- Adicionando nomes ---");
        listaPresenca.add("Ana");
        listaPresenca.add("Bruno");
        listaPresenca.add("Carla");
        System.out.println("Lista inicial: " + listaPresenca); // Saída: [Ana, Bruno, Carla]

        // 2. Acessar um nome pela sua posição (índice)
        String primeiroNome = listaPresenca.get(0);
        System.out.println("O primeiro nome da lista é: " + primeiroNome); // Saída: Ana

        // 3. Remover um nome
        System.out.println("\n--- Removendo um nome ---");
        listaPresenca.remove("Bruno");
        System.out.println("Lista após remover 'Bruno': " + listaPresenca); // Saída: [Ana, Carla]
    }
}
