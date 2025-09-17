# JavaProgramming
Progração oracle - Java Programing

Exercício 1


public class Atividade 1 {
     
     /**
     *Desafios de Código
     *Desafio 1: Invertendo Valores
     *Objetivo: Utilizar uma variável temporária para trocar os valores de duas variáveis primitivas sem usar List ou Array.
     *Instruções: Troque os valores das variáveis a e b. No final, a variável a deve ter o valor 25 e b o valor 10.
     */
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

Execício 2

public class TiposDados {

     /**
    *Atividade 2: Tipos de Dados e Limites
    *Objetivo: Entender a diferença de tamanho e faixa de valores entre os tipos inteiros.
    *Instruções: Identifique qual tipo primitivo (byte, short, int, long) é o mais apropriado para armazenar cada um dos seguintes valores, sem desperdiçar memória.
    *A idade de uma pessoa (ex: 25)
    *A população mundial (ex: 8.000.000.000)
    *A distância entre duas cidades em km (ex: 500)
    *O número de dias em um ano (ex: 365)
    *Crie um programa e atribua a ele as  variáveis. Teste suas variações e tente executar o seu programa. Veja o que acontece. 
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        byte idadepessoa = 25;
        long populacaomundial = 8000000000L;
        int distanciacidade = 500;
        short diaanos = 365;

        
        
     //display all values to screen
        System.out.println(idadepessoa);
        System.out.println(populacaomundial);
        System.out.println(distanciacidade);
        System.out.println(diaanos);
        // Imprima o valor de cada variável
      }  
}

Exercício 3


     public class Exercício 2 {
     /**
     *Atividade 3: Cast (Conversão de Tipos)
     *Objetivo: Praticar a conversão entre tipos de dados.
     *Instruções: O código a seguir está incompleto e não compila devido a erros de tipo. Adicione a conversão (casting) necessária para que o programa compile e imprima os valores corretos.
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int meuInt = 150;
        short meuShort = (short)meuInt; // Erro de compilação!
        
        double meuDouble = 9.78;
        int outroInt = (int)meuDouble; // Erro de compilação!

        double meuFloat = 12.34;
        
        System.out.println(meuShort);
        System.out.println(outroInt);
        System.out.println(meuFloat);

        // Imprima o valor de cada variável

    }
    
}

Exercício 4

     public class TiposDados {
     /**
     *Atividade 4: Operações Aritméticas
     *Objetivo: Usar operadores aritméticos com diferentes tipos primitivos.
     *Instruções: Crie um programa que faça o seguinte:
     *Declare duas variáveis do tipo int.
     *Declare duas variáveis do tipo double.
     *Calcule e imprima a soma, subtração, multiplicação e divisão de:
     *int com int
     *double com double
     *int com double (observe o tipo do resultado!)
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade = 30, ano = 2000;  
        double altura = 1.80, peso = 80.0;
        
        int idadesoma = (idade + ano);
        int idadesub = (idade - ano);
        int idademult = (idade * ano);
        int idadedivi = (idade / ano); 
        
        double alturasoma = (altura + peso);
        double alturasub = (altura - peso);
        double alturamult = (altura * peso);
        double alturadivi = (altura / peso); 
        
        double idadealturasoma = (idadesoma + alturasoma);
        double idadealturasub = (idadesub - alturasub);
        double idadealturamult = (idademult * alturamult);
        double idadealturadivi = (idadedivi / alturadivi);

        
        System.out.println(idadesoma);
        System.out.println(idadesub);
        System.out.println(idademult);
        System.out.println(idadedivi);
        
        System.out.println(idadesoma);
        System.out.println(alturasub);
        System.out.println(alturamult);
        System.out.println(alturadivi);
        
        System.out.println(idadealturasoma);
        System.out.println(idadealturasub);
        System.out.println(idadealturamult);
        System.out.println(idadealturadivi);

        // Imprima o valor de cada variável

    }
    
}

Atividade 5   

     public class Atividade5 {
          /**
          *Atividade 5: Booleans e Lógica
          *Objetivo: Compreender o uso do tipo boolean e operadores lógicos.
          *Instruções: Crie duas variáveis booleanas, estudanteAprovado e temAtestado. Baseado nas variáveis, crie uma expressão booleana que imprima true ou false para as seguintes condições:
          *O aluno foi aprovado E não tem atestado.
          *O aluno foi aprovado OU tem atestado.
          *O aluno não foi aprovado.
          *Anexe o seu trabalho e envie ao professor !
          */
    public static void main(String[] args) {
        boolean estudanteAprovado = true;
        boolean temAtestado = false;

        boolean condicao1 = estudanteAprovado && !temAtestado;
        System.out.println("Ele foi Aprovado E não tem atestado: " +condicao1);

        boolean condicao2 = estudanteAprovado || temAtestado;
        System.err.println("Ele foi Aprovado OU tem atestado: " + condicao2);

        boolean condicao3 = !estudanteAprovado;
        System.err.println ("Ele Não foi aprovado: "+condicao3);
    }
}

Dasafio 1

public class Desafio {
     /**
     *Desafios de Código
     *Desafio 1: Invertendo Valores
     *Objetivo: Utilizar uma variável temporária para trocar os valores de duas variáveis primitivas sem usar List ou Array.
     *Instruções: Troque os valores das variáveis a e b. No final, a variável a deve ter o valor 25 e b o valor 10.
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a); // Deve imprimir 25
        System.out.println("b = " + b); // Deve imprimir 10

    }
}

Desafio 2
   
public class Desafio2 {
     /**
     *Desafio 2: Média com Precisão
     *Objetivo: Lidar com a precisão dos números de ponto flutuante e a conversão de tipos.
     *Instruções: Calcule a média de 3 notas. O resultado deve ser um número decimal, mesmo que as notas sejam inteiras.
     */
    public static void main(String[] args) {
        int nota1 = 7;
        int nota2 = 8;
        int nota3 = 9;
        
        // Seu código para calcular a média
        double media = 0; // Altere esta linha
        media = ((nota1 + nota2 + nota3)/3);
        
        System.out.println("A média é: " + media); // Deve imprimir 8.0


    }
}

Exercício 6
     
     /**
     * A classe 'VarTest' demonstra a declaração e exibicao de
     * variaveis primitivas em java, como 'int', 'int', 'char' e 'boolean'
     */
     public class VarTest {
     
         /**
          * O metodo principal, ponto de entrada para a aplicacao.
          * Exibe o valor de variaveis de doferentes tipos de dados no console.
          * *@param args Argumentos da linha de comando (nao utilizados neste exemplo)
          */
         public static void main(String[] args) {
             // Declaracao de variaveis com nomes descritivos em camelCase.
             int  integerValue = 25;
             char characterValue = 'B';
             boolean isActive = true;
             
             //display all values to screen
             System.out.println("Valor inteiro: " +integerValue);
             System.out.println("Valor do carctere: " +characterValue);
             System.out.println("Valor booleano: " +isActive);
     
         }
         
     }
     
Exercício Extra (7)

     public class StringOperations {
    public static void main(String[] args) {
        
    
        String str1 = "Hello";
        String str2 = "Duke";
        String str3;

        str3 = "You are " + str2;
        System.out.println("Welcome: "+ str3);

        System.out.println("Length: " + str1.length());

        System.out.println("Sub: " + str3.substring(0,5));

        System.out.println("Upper: "+ str2.toUpperCase());
      }
}

Exercício Oracle input variable
          
import java.util.Scanner;
/*
 *
 * Inputar a leitura do usuário no console utilizando a classe java scanner, 
 * você deve usar o método mais importante para acessar a classe, java.util.Scanner.
 * 
 */
public class InputVariables {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
         * 
         * Para inicializar o scanner, escreva: 
         * Você deveria explorar a classe Scanner mais profundamente, 
         * você verá que a muitos métodos diferentes de leitura, vindo do console.
         * 
         */
        boolean boolVal = true;
        byte byteVal = 8;
        char charVal = 'R';
        short shortVal = 12;
        int intVal = 6;
        long longVal = 77777;
        float floatVal = 6.00f;
        double doubleVal = 7;

        System.out.print("Please enter a double value: ");
        doubleVal = in.nextDouble();
        in.close();
        System.out.println("boolean value: " + boolVal);
        System.out.println("byte value : " + byteVal);
        System.out.println("char value : " + charVal);
        System.out.println("short value : " + shortVal);
        System.out.println("int value : " + intVal);
        System.out.println("long value : " + longVal);
        System.out.println("double value : " + floatVal);
        System.out.println("double value : " + doubleVal);
        /*
        * 
        * Programas são sempre melhores quando você usa a interatividade. 
        * 
        */
        
    }
    
}

Exercício Oracle Age Checker
               
import java.util.Scanner;
               
public class AgeChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;

        System.out.print("Please enter your age: ");
        /*
         * 
         * Leia o valor do caractere para identificar se um usuário está permitido a dirigir. 
         * 
         */

        age = in.nextInt();

        if(age > 20)
        /*
         * 
         * Você precisa de ambos 21 ou acima e ter uma licença para dirigir um carro.
         * 
         */
            System.out.println("You are an adult");
        else
            System.out.println("You are not an adult");
        //endif
        in.close();
        /*
         * 
         * Vamos ver se o usuário pode dirigir.
         * 
         */
    }
}

Exercício 8: Crie sua Primeira Classe Encapsulada
Objetivo: Aplicar os conceitos básicos de encapsulamento.
Instruções:
Crie uma classe Pessoa.
Declare os atributos nome e idade como private.
Crie métodos public getNome(), setNome(), getIdade() e setIdade() para acessar e modificar os atributos.
No método main, crie um objeto da classe Pessoa, defina seus valores usando os setters e imprima-os usando os getters.

public class Pessoa {
    // 1. Atributos privados
    private String Nome; // Atributo privado

    // Getter para obter o valor de Nome
    public String getNome() {
        return Nome;
    }

    // Setter para definir um novo valor para Nome
    public void setNome(String n) {
        // Poderia adicionar validações aqui, por exemplo
        this.Nome = n;
    }
    private int Idade; // Atributo privado

    // Getter para obter o valor de Idade
    public int getIdade() {
        return Idade;
    }

    // Setter para definir um novo valor para Idade
    public void setIdade(int id) {
        // Poderia adicionar validações aqui, por exemplo
        this.Idade = id;
    }
    public static void main(String[] args) {
        
    
    // 2. Getters e Setters públicos
        Pessoa pessoa = new Pessoa();

        
        // Os setters para atribuir valores
        pessoa.setNome("João");
        
        pessoa.setIdade(30);
        
        // Os getters para obter e imprimir os valores
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
