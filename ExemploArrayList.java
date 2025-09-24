import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        // Criamos uma lista que só aceita nomes (String)
        //Essa prática é recomendada para assim garantir a segurança de tipo e facilitar a leitura do código.
        ArrayList<String> listaPresenca = new ArrayList<>();

        // 1. Adicionar nomes à lista (eles são adicionados no final)
        System.out.println("--- Adicionando nomes ---");
        //Nomes serão adicionados na ordem em que aparecem.
        //No ArrayList a ardom se mantém na inserção, por isso, a lista será: [Ana, Bruno, Carla].
        listaPresenca.add("Ana");
        listaPresenca.add("Bruno");
        listaPresenca.add("Carla");
        System.out.println("Lista inicial: " + listaPresenca); // Saída: [Ana, Bruno, Carla]

        // 2. Acessar um nome pela sua posição (índice)
        //O método get(int index) o elemento vai ser retornado na posição indicada.
        //Como os índices começam em 0, get(0) retorna "Ana", o primeiro nome adicionado.
        String primeiroNome = listaPresenca.get(0);
        System.out.println("O primeiro nome da lista é: " + primeiroNome); // Saída: Ana

        // 3. Remover um nome
        System.out.println("\n--- Removendo um nome ---");
        //O primeiro elemento é removido que é ao valor "Bruno".
        //Fica a lista sendo: [Ana, Carla].
        //Os elementos que restam são ordenado dos elementos restantes permanece inalterada.
        listaPresenca.remove("Bruno");
        System.out.println("Lista após remover 'Bruno': " + listaPresenca); // Saída: [Ana, Carla]
    }
}
