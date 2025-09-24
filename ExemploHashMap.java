import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        // Criamos um mapa onde a chave é um Integer (matrícula) e o valor é uma String (nome)
        Map<Integer, String> alunos = new HashMap<>();

        // 1. Adicionar alunos (pares de matrícula-nome)
        System.out.println("--- Cadastrando alunos ---");
        //Cada chamada de put() insere um par chave-valor no mapa.
        //Deve ser única a chave — se usar a mesma chave novamente, o valor será substituído.
        alunos.put(101, "João Silva");
        alunos.put(102, "Maria Oliveira");
        alunos.put(103, "Carlos Santos");
        System.out.println("Mapa de alunos: " + alunos); // Ex: {101=João Silva, 102=Maria Oliveira, 103=Carlos Santos}

        // 2. Encontrar o nome de um aluno pela sua matrícula (chave)
        System.out.println("\n--- Buscando um aluno ---");
        //O método get() retorna o valor associado à chave fornecida.
        //Uma das maiores vantagens do HashMap: acesso rápido e direto aos dados.
        String nomeAluno = alunos.get(102);
        System.out.println("O nome do aluno com matrícula 102 é: " + nomeAluno); // Saída: Maria Oliveira

        // 3. Verificar se uma matrícula já existe
        System.out.println("\n--- Verificando matrícula ---");
        //Verifica se uma determinada chave está presente no mapa.
        //Retorna true ou false.
        boolean temMatricula = alunos.containsKey(101);
        System.out.println("A matrícula 101 existe? " + temMatricula); // Saída: true

        // 4. Remover um aluno pela sua matrícula
        System.out.println("\n--- Removendo um aluno ---");
        //Remove o par chave-valor correspondente à chave fornecida.
        //Se a chave não existir
        alunos.remove(103);
        System.out.println("Mapa após remover o aluno 103: " + alunos); // Ex: {101=João Silva, 102=Maria Oliveira}
    }
}
