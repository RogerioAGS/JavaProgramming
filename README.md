# JavaProgramming
Progração oracle - Java Programing

Exercício 1

public class Atividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declare e inicialize as seguintes variáveis:
        byte idade = 28;
        short ano = 2025;
        int populacao = 11000;
        long distanciaViaLactea = 100000;
        float preco = 100;
        double pi = 3.141592;
        char letra = 'R';
        boolean ehVerdadeiro = true;
        
        
     //display all values to screen
        System.out.println(idade);
        System.out.println(ano);
        System.out.println(populacao);
        System.out.println(distanciaViaLactea);
        System.out.println(preco);
        System.out.println(pi);
        System.out.println(letra);
        System.out.println(ehVerdadeiro);
        // Imprima o valor de cada variável
    }
    
}

Exercício 2

Atividade 2: Tipos de Dados e Limites

Objetivo: Entender a diferença de tamanho e faixa de valores entre os tipos inteiros.
Instruções: Identifique qual tipo primitivo (byte, short, int, long) é o mais apropriado para armazenar cada um dos seguintes valores, sem desperdiçar memória.
A idade de uma pessoa (ex: 25)
A população mundial (ex: 8.000.000.000)
A distância entre duas cidades em km (ex: 500)
O número de dias em um ano (ex: 365)

package tiposdados;

/**
 *
 * @author Aluno
 */
public class TiposDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        byte idadepessoa = 25;
        long populacaomundial = 800000000;
        int distanciacidade = 500;
        short diaanos = 365;

        
        
     //display all values to screen
        System.out.println(idadepessoa);
        System.out.println(populacaomundial);
        System.out.println(distanciacidade);
        System.out.println(diaanos);
        // Imprima o valor de cada variável

