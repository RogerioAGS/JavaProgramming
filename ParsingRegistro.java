public class ParsingRegistro {
    //Método principal (main) que serve como ponto de entrada da aplicação.
    //String[] args permite receber argumentos da linha de comando (não utilizados aqui).
    public static void main(String[] args) {
        //Declara uma variável registro contendo os dados do aluno em formato estruturado.
        //Os campos são separados por ;: matrícula, nome, curso e nota.
        String registro = "2024001;Joao Silva;Java Programming;9.5";
        //Imprime a string original e uma linha divisória para organizar visualmente a saída.
        System.out.println("Registro Original: " + registro);
        System.out.println("----------------------------------------");
        
        // 1. Use split() para dividir a string pelo delimitador ";"
        //Usa o método split() para dividir a string em partes, com base no delimitador ;
        //O resultado é um array de strings chamado dados.
        String[] dados = registro.split(";");
        
        // Os dados sao armazenados nas seguintes posicoes:
        // dados[0]: Matricula
        // dados[1]: Nome do Aluno
        // dados[2]: Curso
        // dados[3]: Nota
        
        //Verifica se o array contém exatamente 4 elementos.
        //Isso garante que o formato do registro está correto.
        if (dados.length == 4) {
            //Imprime a matrícula do aluno, que está na posição 0 do array
            //A nota ainda está em formato de string. Poderia ser convertida para double e formatada com casas decimais usando printf.
            System.out.println("Matricula: " + dados[0]);
            
            // 2. Imprimir o nome em maiusculas
            //Converte o nome do aluno (posição 1) para letras maiúsculas usando toUpperCase().
            String nomeUpper = dados[1].toUpperCase();
            System.out.println("Nome:      " + nomeUpper);
            
            System.out.println("Curso:     " + dados[2]);
            
            // 3. Imprimir a nota
            //Imprime o nome do curso, que está na posição 2.
            System.out.println("Nota:      " + dados[3]);
            //Caso o array não tenha 4 elementos, exibe uma mensagem de erro indicando que o formato está incorreto.
        } else {
            System.out.println("Erro: O formato do registro nao corresponde ao esperado.");
        }
    }
}