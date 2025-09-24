import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        //<String> garante que só Strings podem ser adicionadas.
        //Evita erros de tipo e torna o código mais seguro e legível.
        Set<String> tarefas = new HashSet<>();

        System.out.println("--- Adicionando tarefas ---");
        tarefas.add("Comprar pão");
        tarefas.add("Estudar Java");
        //A segunda tentativa de adicionar "Comprar pão" é ignorada automaticamente.
        //O HashSet não permite elementos duplicados, garantindo que cada tarefa apareça uma única vez.
        tarefas.add("Comprar pão"); // Tentando adicionar uma duplicata
        tarefas.add("Lavar o carro");
        //Não Garante a ordem dos elementos.
        //Mesmo que você adicione "Comprar pão" primeiro, ele pode aparecer por último na impressão.
        //Isso acontece porque o HashSet organiza os dados internamente por hash, não por posição.
        System.out.println("Conjunto de tarefas: " + tarefas);
        //Verifica se a tarefa está presente no conjunto.
        //Retorna true ou false.
        boolean temTarefa = tarefas.contains("Estudar Java");
        System.out.println("\nA tarefa 'Estudar Java' está no conjunto? " + temTarefa);

        System.out.println("\n--- Removendo uma tarefa ---");
        tarefas.remove("Lavar o carro");
        System.out.println("Conjunto após remover 'Lavar o carro': " + tarefas);
    }
}
