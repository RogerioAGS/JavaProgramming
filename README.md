# JavaProgramming
Progração oracle - Java Programing

Seção 1 - Atividade 1: Declaração e Inicialização
Objetivo: Familiarizar-se com a sintaxe de declaração e inicialização de variáveis primitivas.
Instruções: No método main abaixo, declare uma variável para cada tipo primitivo e atribua um valor a ela.


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

Seção 1 - Atividade 2: Tipos de Dados e Limites

Objetivo: Entender a diferença de tamanho e faixa de valores entre os tipos inteiros.
Instruções: Identifique qual tipo primitivo (byte, short, int, long) é o mais apropriado para armazenar cada um dos seguintes valores, sem desperdiçar memória.
A idade de uma pessoa (ex: 25)
A população mundial (ex: 8.000.000.000)
A distância entre duas cidades em km (ex: 500)
O número de dias em um ano (ex: 365)
Crie um programa e atribua a ele as  variáveis. Teste suas variações e tente executar o seu programa. Veja o que acontece. 


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

Seção 1 - Atividade 3: Cast (Conversão de Tipos)
Objetivo: Praticar a conversão entre tipos de dados.
Instruções: O código a seguir está incompleto e não compila devido a erros de tipo. Adicione a conversão (casting) necessária para que o programa compile e imprima os valores corretos.


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

Seção 1 - Atividade 4: Operações Aritméticas
Objetivo: Usar operadores aritméticos com diferentes tipos primitivos.
Instruções: Crie um programa que faça o seguinte:
Declare duas variáveis do tipo int.
Declare duas variáveis do tipo double.
Calcule e imprima a soma, subtração, multiplicação e divisão de:
int com int
double com double
int com double (observe o tipo do resultado!)


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

Seção 1 - Atividade 5: Booleans e Lógica
Objetivo: Compreender o uso do tipo boolean e operadores lógicos.
Instruções: Crie duas variáveis booleanas, estudanteAprovado e temAtestado. Baseado nas variáveis, crie uma expressão booleana que imprima true ou false para as seguintes condições:
O aluno foi aprovado E não tem atestado.
O aluno foi aprovado OU tem atestado.
O aluno não foi aprovado.
  

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

Seção 1 - Exercício 6 - Comentar Programa
     
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

Seção 1 - Desafios de Código
Desafio 1: Invertendo Valores
Objetivo: Utilizar uma variável temporária para trocar os valores de duas variáveis primitivas sem usar List ou Array.
Instruções: Troque os valores das variáveis a e b. No final, a variável a deve ter o valor 25 e b o valor 10.


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

Seção 1 - Desafio 2: Média com Precisão
Objetivo: Lidar com a precisão dos números de ponto flutuante e a conversão de tipos.
Instruções: Calcule a média de 3 notas. O resultado deve ser um número decimal, mesmo que as notas sejam inteiras.
   
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
	 
 - Exercício Extra (7)

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

Seção 2 - Exercício 1: Crie sua Primeira Classe Encapsulada
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

Seção 2 - Exercício 2: Validação de Dados
Objetivo: Usar setters para validar a entrada de dados e garantir a integridade do objeto.
Instruções:
Modifique a classe Pessoa do exercício anterior.
No método setIdade(), adicione uma validação: a idade só pode ser definida se for um valor positivo. Se a idade for menor que 0, imprima uma mensagem de erro no console e não altere o valor do atributo.
Teste a validação no método main, tentando definir uma idade negativa.

public class Pessoa2 {
   // 1. Atributos privados
    private String nome;
    private int idade;

    // Getter para Nome
    public String getNome() {
        return nome;
    }

    // Setter para Nome
    public void setNome(String n) {
        this.nome = n;
    }

    // Getter para Idade
    public int getIdade() {
        return idade;
    }

    // Setter para Idade
    public void setIdade(int id) {
        this.idade = id;
    }

    public static void main(String[] args) {
        // Criando objeto da própria classe
        Pessoa2 pessoa = new Pessoa2();

        // Setando valores
        pessoa.setNome("João");
        pessoa.setIdade(2);

        // Validação
        if (pessoa.getIdade() >= 0) {
            System.out.println("Idade definida: " + pessoa.getIdade());
        } else {
            System.out.println("Erro: A idade não pode ser um valor negativo.");
        }

        // Imprimindo nome
        System.out.println("Nome: " + pessoa.getNome());
    }
}

Seção 2 - Exercício 3: Classe Produto
Objetivo: Aplicar encapsulamento a uma nova classe com múltiplos atributos.
Instruções:
Crie uma classe Produto.
Os atributos devem ser: nome (String), preco (double) e quantidadeEmEstoque (int). Todos devem ser private.
Crie getters e setters para todos os atributos.
No main, crie um objeto Produto e use os métodos para definir seus valores e imprimi-los.

public class Produto {
    // 1. Atributos privados
    private String nome;
    private double preco;
    private int qtdemestoque;

    // Getter para Nome
    public String getNome() {
        return nome;
    }

    // Setter para Nome
    public void setNome(String n) {
        this.nome = n;
    }

    // Getter para Preco
    public double getPreco() {
        return preco;
    }

    // Setter para Preco
    public void setPreco(double pr) {
        this.preco = pr;
    }    

    // Getter para QtdEmEstoque
    public double getQtdEmEstoque() {
        return qtdemestoque;
    }

    // Setter para QtdEmEstoque
    public void setQtdEmEstoque(int qt) {
        this.qtdemestoque = qt;
    }
    public static void main(String[] args) {
        // Criando objeto da própria classe
        Produto produto = new Produto();

        // Setando valores
        produto.setNome("João");
        produto.setPreco(20);
        produto.setQtdEmEstoque(8);

        // Imprimindo nome
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preco: " + produto.getPreco());
        System.out.println("Quantidade em Estoque: " + produto.getQtdEmEstoque());
    }
}

Seção 2 - Exercício 4: Controle de Acesso de Escrita
Objetivo: Criar um atributo que só pode ser lido, mas não modificado.
Instruções:
Crie uma classe ContaBancaria.
Adicione um atributo saldo do tipo private double.
Crie um getter público para o saldo, mas não crie um setter.
Crie um método public chamado depositar(double valor) que adicione o valor ao saldo.
No main, crie um objeto ContaBancaria, chame o método depositar() e tente modificar o saldo diretamente (verifique que o compilador irá impedir).

public class ContaBancaria {
private double saldo;

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

// nossos métodos

public void depositar(double valor) {
	if(valor <= 0 ) {
		System.out.println("Valor para depósito inválido!");
		return;
	}
	
	saldo = saldo + valor;	
}

	public static void main(String[] args) {
	ContaBancaria conta = new ContaBancaria();

	conta.setSaldo(2500);

	System.out.println("Novo Saldo: " + conta.getSaldo());
	
	}
}

public class ContaBancaria1 {

    // 2. Atributo privado
    private double saldo;

    // 3. Getter público (sem setter)
    public double getSaldo() {
        return saldo;
    }

    // 4. Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    // Método principal para testar
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        // Depositando valor
        ContaBancaria.depositar(500.0);
        System.out.println("Saldo atual: " + conta.getSaldo());

public static void main(String[] args) {
public static void depositar(double valor) {	
	Conta minhaConta = new Conta();
	minhaConta.saldo = 200;
	minhaConta.saldo = minhaConta.saldo + valor;
	System.out.println("Saldo Atual");
	System.out.println(minhaConta.saldo);
	}

}
    }
} 

public class ContaBancaria {
	
	private String nome;
	private String numeroDaConta;
	private String agencia;
	private double saldo;
	private boolean ativa;
	
	//get -> retorna valor
	public String getNome() {
		return nome;
	}
	
	//set -> recebe valor
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//boolean - get
	public boolean isAtiva() {
		return ativa;
	}
	//boolean - set
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	// nossos métodos
	
	public void depositar(double valor) {
		if(valor <= 0 ) {
			System.out.println("Valor para depósito inválido!");
			return;
		}
		
		if(!ativa) {
			System.out.println("Conta inativa");
			return;
		}
		
		saldo = saldo + valor;		
		
	}
	
	public void sacar(double valor) {
		
		if(valor <= 0 ) {
			System.out.println("Valor inválido!");
			return;
		}
		
		if(!ativa) {
			System.out.println("Conta inativa");
			return;
		}
		
		if(saldo < valor) {
			System.out.println("Saldo insuficiente");
			return;
		}
		
		saldo = saldo - valor;
		// saldo -= valor;
		
	}	
}

public class App {
	
	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria();
		//- setters - setar os valores
		conta.setNome("Cida Castello");
		conta.setNumeroDaConta("12365-a");
		conta.setAgencia("Central");
		conta.setSaldo(2500);
		conta.setAtiva(true);
		
		//pegar os valores - getters
		System.out.println("Nome: " + conta.getNome());
		System.out.println("Numero da conta: " + conta.getNumeroDaConta());
		System.out.println("Agência: " + conta.getAgencia());
		System.out.println("Saldo: " + conta.getSaldo());
		System.out.println("Ativa? " + conta.isAtiva());
		
		// depositando valor na conta
		// conta.depositar(1000);
		conta.sacar(-500);
		System.out.println("Novo Saldo: " + conta.getSaldo());
		
	}
}

Seção 2 - Exercício 5: Atributos Calculados
Objetivo: Usar um getter para retornar um valor calculado, em vez de um atributo diretamente armazenado.
Instruções:
Crie uma classe Retangulo.
Adicione os atributos private double altura e largura.
Crie setters para altura e largura.
Crie um getter chamado getArea() que calcule e retorne a área do retângulo (altura * largura). Não crie um atributo para area.


public class Retangulo {
    //Atributos privados
    private double altura;
    private double largura;

    //Setters
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    //Getters usando para calcular a area
    public double getArea() {
        return altura * largura;
    }

    //Fazendo teste 
    public static void main(String[] args) {
        Retangulo r = new Retangulo();
        r.setAltura(5);
        r.setLargura(3);
        System.out.println("Área do retângulo: " + r.getArea());
    }
}

Seção 2 - Atividade 6: Leitura e Compreensao de Codigo

Este exercicio foca na leitura e no entendimento de um codigo pre-escrito, identificando classes, metodos e a interacao entre       objetos.

Instrucoes:
Analise o codigo abaixo. Ele representa um sistema simples de gerenciamento de uma biblioteca.

Sua Tarefa:

Descreva a funcao de cada classe (Livro, Biblioteca, Main).

Explique o que o metodo getInfo() faz e qual classe o utiliza.

Qual é o proposito do ArrayList na classe Biblioteca?

import java.util.ArrayList;

//A função classe atribui como string o título e autor
public class Livro {
    
    String titulo;
    String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // A função info retorna a formatação que no caso é a descrisão do título e autor do livro
    public String getInfo() {
        return "Título: " + this.titulo + ", Autor: " + this.autor;
    }
}

// Classe Biblioteca.java


class Biblioteca {
    ArrayList<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void listarLivros() {
        System.out.println("Livros na biblioteca:");
        for (Livro livro : this.livros) {
            System.out.println(livro.getInfo());
        }
    }
}

// Classe Main.java
class Main {

    //O Array nesse caso serve para armarzenar cada livro com seu título e autor
    public static void main(String[] args) {
        Biblioteca minhaBiblioteca = new Biblioteca();
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling");

        minhaBiblioteca.adicionarLivro(livro1);
        minhaBiblioteca.adicionarLivro(livro2);
        minhaBiblioteca.listarLivros();
    }
}

Seção 2 - Atividade 7 ArrayList vs. Array

Este exercício ajuda a entender a diferença fundamental entre ArrayList e Array, especialmente no contexto de tamanho dinâmico.

Instruções:
Compare a flexibilidade de um Array de tamanho fixo com um ArrayList de tamanho dinâmico.

Sua Tarefa:

Crie um Array de String chamado frutasArray com um tamanho fixo de 3 elementos. Tente adicionar um quarto elemento e observe o que acontece (irá causar um erro).

Crie um ArrayList de String chamado frutasList e adicione 3 elementos. Em seguida, adicione um quarto elemento sem problemas.

Imprima o conteúdo e o tamanho de ambas as estruturas após as adições.

Comente no código por que o ArrayList foi capaz de adicionar o quarto elemento e o Array não.

public class ListaDeCompras {
    private String[] itens = new String[5];

    public void adicionarItem(String item, int indice) {
        if (indice >= 0 && indice < itens.length) {
            itens[indice] = item;
        } else {
            System.out.println("Índice inválido! Deve estar entre 0 e " + (itens.length - 1));
        }
    }

    public String obterItem(int indice) {
        if (indice >= 0 && indice < itens.length) {
            return itens[indice];
        } else {
            return "Índice inválido!!!!";
        }
    }

    public void imprimirLista() {
        System.out.println("Lista de Compras: ");
        for (int i = 0; i < itens.length; i++) {
            System.out.println("Índice " + i + ": " + (itens[i] !=null ? itens[i] : "[vazio]"));
        }
    }
}

class Desafio2 {
    public static void main(String[] args) {
        ListaDeCompras lista = new ListaDeCompras();
        lista.adicionarItem("Pão", 0);
        lista.adicionarItem("Leite", 1);
        lista.imprimirLista();

        System.out.println("Item no índice 0: " + lista.obterItem(0));

        lista.adicionarItem("Ovos", 10);
    }    
}

Seção 2 - Atividade 8: Herança com ArrayList

Este exercício combina os conceitos de herança e ArrayList para criar um sistema mais complexo e funcional.

Instruções:
Aprimore o sistema de biblioteca do Exercício 1, utilizando herança.

Sua Tarefa:

Crie a classe Livro (do Exercício 1) com os campos titulo e autor.

Crie duas subclasses de Livro: LivroFisico e Ebook.

Adicione um campo numeroPaginas à classe LivroFisico e um campo formato (ex: PDF, EPUB) à classe Ebook.

Na classe Biblioteca, use um ArrayList de Livro (a superclasse).

No método main, crie instâncias de LivroFisico e Ebook, adicione-os à Biblioteca e chame o método listarLivros(). A saída deve mostrar que a Biblioteca pode armazenar e listar objetos de diferentes subclasses de forma polimórfica.

import java.util.ArrayList;

//Superclasse
class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    //Esse método pode ser sobrescrito pelas subclasses
    public String getDescricao() {
        return "Título: " + titulo + " | Autor: " + autor;
    }
}

//Subclasse Livro Físico
class LivroFisico extends Livro {
    private int numeroPaginas;

    public LivroFisico(String titulo, String autor, int numeroPaginas) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    public String getDescricao() {
        return super.getDescricao() + " | Páginas: " + numeroPaginas;
    }

}

//Subclasse Ebook
class Ebook extends Livro {
    private String formato;

    public Ebook(String titulo, String autor, String formato) {
        super(titulo, autor);
        this.formato = formato;
    }

    public String getDescricao() {
        return super.getDescricao() + " | Formato: " + formato;
    }
}

//Classe Biblioteca
class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        System.out.println("\n Lista de Livros na Biblioteca: ");
        for (Livro livro : livros) {
            System.out.println(livro.getDescricao());
        }
    }
}


// A classe principal
public class HerançaArrayLivro {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        //Instâncias criadas
        LivroFisico livro1 = new LivroFisico("O Senhor dos Anéis", "J.R.R. Tolkien", 1200);
        Ebook ebook1 = new Ebook("Clean Code", "Robert C. Martin", "PDF");

        //Adicionando na biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(ebook1);

        //Listando
        biblioteca.listarLivros();
    }
}

Seção 2 - Atividade 9: Modelagem de um Sistema de Veiculos

Crie um sistema para modelar diferentes tipos de veiculos.

Interface: Crie uma interface chamada Veiculo com os seguintes metodos:

double calcularCustoPorKm(double distancia): Retorna o custo total para uma determinada distancia.

String getTipo(): Retorna o tipo de veículo (ex: "Carro", "Bicicleta").

Classes: Implemente as seguintes classes que representam veiculos concretos, tornando-as imutaveis:

Carro: Propriedades: consumoPorLitro e precoCombustivelPorLitro.

Bicicleta: Propriedades: custoDeManutencaoPorKm.

Classe de Teste: Crie uma classe Main com o metodo main. Instancie um Carro e uma Bicicleta, e chame os metodos da interface para demonstrar o calculo do custo e o tipo de cada veiculo.
Dica: Para tornar as classes imutaveis, declare todos os campos como final, nao forneca metodos setters e inicialize os campos no construtor.

/Chave para Implementar a interface 
class Carro implements Veiculo {
    private final double consumoPorLitro;
    private final double precoCombustivelPorLitro;

    public Carro(double consumoPorLitro, double precoCombustivelPorLitro) {
        this.consumoPorLitro = consumoPorLitro;
        this.precoCombustivelPorLitro = precoCombustivelPorLitro;
    }
//Metodo Calcular custo
    @Override
    public double calcularCustoPorKm(double distancia) {
        return (distancia / consumoPorLitro) * precoCombustivelPorLitro;
    }

    @Override
    public String getTipo() {
        return "Carro";
    }
}

//Metodo para teste do Veiculo
class Bicicleta implements Veiculo {
    private final double custoDeManutencaoPorKm;

    public Bicicleta(double custoDeManutencaoPorKm) {
        this.custoDeManutencaoPorKm = custoDeManutencaoPorKm;
    }

    @Override
    public double calcularCustoPorKm(double distancia) {
        return distancia * custoDeManutencaoPorKm;
    }
	
Atividade 16: Sistema de Gestão de Formas Geométricas

Desenvolva um sistema para gerenciar e calcular propriedades de formas geométricas.

Interface: Crie uma interface chamada Forma com os métodos:

double getArea(): Calcula e retorna a área da forma.

double getPerimetro(): Calcula e retorna o perímetro da forma.

Classes: Implemente classes imutáveis para as seguintes formas:

Circulo: Propriedade: raio.

Retangulo: Propriedades: largura e altura.

Classe de Teste: No método main, crie uma lista de Forma e adicione instâncias de Circulo e Retangulo. Em seguida, itere sobre a lista e imprima a área e o perímetro de cada forma.

Dica: Utilize a constante Math.PI para os cálculos do círculo.

import java.util.ArrayList;
import java.util.List;

//Interface Veiculo 
public interface Forma {
    double getArea();
    double getPerimetro();
}
//Chave para Implementar a Circulo
class Circulo implements Forma {
    private final double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }
}
//Chave para Implementar a Retangulo
class Retangulo implements Forma {
    private final double largura;
    private final double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return largura * altura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (largura + altura);
    }
}

//Metodo para teste
class Main {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(3.0));       // Raio = 3.0
        formas.add(new Retangulo(4.0, 5.0)); // Largura = 4.0, Altura = 5.0

        for (Forma forma : formas) {
            System.out.println("----------------------------");
            System.out.printf("Área: %.2f%n", forma.getArea());
            System.out.printf("Perímetro: %.2f%n", forma.getPerimetro());
        }
    }
}

Seção 2 - Desafio 1: Classificação de Alunos
Objetivo: Combinar encapsulamento com lógica de validação complexa.
Instruções:
Crie uma classe Aluno.
Os atributos private devem ser nome (String) e nota (double).
Crie os getters e setters para ambos.
No setNota(), adicione a seguinte validação: a nota só pode ser atribuída se estiver entre 0.0 e 10.0 (inclusive). Se for inválida, lance uma exceção (você pode usar IllegalArgumentException).
Crie um getter adicional chamado getStatus() que, baseado na nota, retorne a String "Aprovado" (nota >= 7.0), "Em Recuperação" (nota >= 5.0) ou "Reprovado" (nota < 5.0).
No main, crie um Aluno, defina a nota e use o método getStatus() para imprimir o resultado. Tente também definir uma nota inválida para testar a exceção.

public class Aluno {
    //Atributos privados
    private String nome;
    private double nota;

    //Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Getter e Setter com validação
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            throw new IllegalArgumentException("Nota inválida!!! Atenção nota deve estar entre 0 e 10");
        }
    }

    //Getter adicional para Status
    public String getStatus() {
        if (nota >= 7) {
            return "Aprovado";
        } else if (nota >= 5) {
            return "Em Recuperação";
        } else {
            return "Reprovado";
        }
    }

    //Método para teste, junto com try catch para exceção de erro
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("João");

        try {
            aluno.setNota(6.5);
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Nota: " + aluno.getNota());
            System.out.println("Status: " + aluno.getStatus());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

Seção 2 - Desafio 2: Encapsulamento de Array
Objetivo: Encapsular um array e fornecer métodos controlados para interagir com ele.
Instruções:
Crie uma classe ListaDeCompras.
Adicione um atributo private String[] chamado itens. Inicialize-o com um tamanho fixo (ex: 5).
Não crie um getter ou setter para o array completo.
Crie os seguintes métodos public:
adicionarItem(String item, int indice): Adiciona um item no índice especificado. Valide o índice para evitar ArrayIndexOutOfBoundsException.
obterItem(int indice): Retorna o item no índice especificado, com validação de índice.
imprimirLista(): Itera sobre o array e imprime todos os itens.

public class ListaDeCompras {
    private String[] itens = new String[5];

    public void adicionarItem(String item, int indice) {
        if (indice >= 0 && indice < itens.length) {
            itens[indice] = item;
        } else {
            System.out.println("Índice inválido! Deve estar entre 0 e " + (itens.length - 1));
        }
    }

    public String obterItem(int indice) {
        if (indice >= 0 && indice < itens.length) {
            return itens[indice];
        } else {
            return "Índice inválido!!!!";
        }
    }

    public void imprimirLista() {
        System.out.println("Lista de Compras: ");
        for (int i = 0; i < itens.length; i++) {
            System.out.println("Índice " + i + ": " + (itens[i] !=null ? itens[i] : "[vazio]"));
        }
    }
}

class Desafio2 {
    public static void main(String[] args) {
        ListaDeCompras lista = new ListaDeCompras();
        lista.adicionarItem("Pão", 0);
        lista.adicionarItem("Leite", 1);
        lista.imprimirLista();

        System.out.println("Item no índice 0: " + lista.obterItem(0));

        lista.adicionarItem("Ovos", 10);
    } 
}

Seção 3 - Exercício 1: ArrayList (A Fila de Nomes)
Objetivo: Mostrar como uma ArrayList mantém a ordem de inserção e permite a adição e a remoção de elementos.
Imagine que você está criando a lista de presença da turma. A ordem em que os nomes são adicionados importa.

import java.util.ArrayList;

Remove o primeiro elemento que corresponde ao valor "Bruno".

A lista passa a ser: [Ana, Carla].

A ordem dos elementos restantes permanece inalterada.

Seção 3 - Exercício 2: HashSet (A Lista de Itens Únicos)
Objetivo: Demonstrar que uma HashSet não permite elementos duplicados e não garante ordem.
Imagine que você está fazendo uma lista de tarefas. Você não quer a mesma tarefa duas vezes na lista.

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

Seção 3 - Exercício 3: HashMap (O Dicionário)
Objetivo: Ilustrar como um HashMap armazena dados em pares de chave-valor e permite acesso rápido usando a chave.
Imagine que você está criando um cadastro de alunos. Cada aluno tem um número de matrícula único (a chave) e um nome (o valor).

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

Seção 4 - Exercicio 01: Analise de URL (String Processing)

Este exercicio utiliza os metodos startsWith(), contains(), indexOf() e substring() para analisar e extrair informacoes de uma URL.

Enunciado

Crie um programa que receba a String de uma URL e faca o seguinte:

Verifique se a URL comeca com "http://" ou "https://".

Verifique se a URL contem o texto ".com" (indicador de dominio comercial).

Extraia e imprima o nome do dominio, ou seja, o texto entre // e a proxima /.

Exemplo: Em "https://www.oracle.com/java/", o dominio eh "www.oracle.com".

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

Seção 4 - Exercicio 02: Parsing de Registro de Dados (String Processing)

Este exercicio utiliza o metodo split() para separar dados estruturados e metodos como toUpperCase() para formatar a saida.

Enunciado

Voce recebeu uma string que representa um registro de um aluno, onde os dados sao separados por um ponto e virgula (;). Use o metodo split() para separar os dados e imprimi-los em um formato mais legivel.

Registro: "2024001;Joao Silva;Java Programming;9.5"

Requisitos:

Separe o registro usando o delimitador ;.

Imprima o nome do aluno em letras maiusculas (toUpperCase()).

Imprima a nota formatada, garantindo que o valor seja o ultimo elemento do array.

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

Exercicio 03: Construcao e Modificacao Eficiente de Strings

Este exercicio utiliza a classe StringBuilder para criar e manipular strings de forma mais eficiente do que a concatenacao tradicional com o operador +. Voce usara os metodos append() e deleteCharAt().

Enunciado

Crie um programa que use a classe StringBuilder para construir uma unica string de e-mail a partir de um array de destinatarios, separando-os por ponto e virgula (;).

Requisitos:

Crie um StringBuilder vazio ou inicializado.

Use o metodo append() para adicionar cada nome do array, seguido de um ponto e virgula (;).

Ao final do loop, a string tera um ponto e virgula extra. Use o metodo deleteCharAt() para remover o ultimo caractere indesejado.

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

Exercicio 04: Validacao de Codigo Numerico (Regex - Parte 1)

Este exercicio utiliza os metacaracteres \d (digito) e o quantificador {n} para garantir que uma string de entrada possua um formato numerico exato.

Enunciado

Crie um programa que use Expressoes Regulares para validar se uma string eh composta exatamente por 6 digitos numericos.

Voce devera usar a API java.util.regex.Pattern e Matcher e o metodo matches() para verificar se a string inteira corresponde ao padrao.

//Pattern: representa o padrão regex compilado.
import java.util.regex.Pattern;
//Matcher: aplica esse padrão a uma string específica.
import java.util.regex.Matcher;

//Declaração da classe principal. O nome é claro e descritivo, indicando que o foco é validar códigos numéricos.
public class ValidacaoCodigoNumerico {
    //Objetivo: Validar se uma string contém exatamente 6 dígitos numéricos, usando expressões regulares com os metacaracteres \d (dígito) e o quantificador {6} (quantidade exata).
    //Método principal da aplicação. É onde o programa começa a ser executado.
    public static void main(String[] args) {
        
        // Define o padrão regex: exatamente 6 dígitos numéricos
        // \d representa um dígito, {6} indica que devem ser 6 dígitos
        // Em Java, usamos \\ para escapar a barra invertida
        //Define o padrão regex:
        //\d representa um dígito (0 a 9).
        //{6} exige exatamente 6 ocorrências.
        //Em Java, a barra invertida precisa ser escapada com outra barra (\\), por isso \\d.
        String regex = "\\d{6}";
        //Compila o padrão regex em um objeto Pattern, que será usado para validar múltiplas strings.
        Pattern padrao = Pattern.compile(regex);

        //Exemplos de códigos para testar
        //Define quatro exemplos de códigos para testar:
        //Um válido e três inválidos por diferentes motivos: quantidade errada de dígitos ou presença de caracteres não numéricos.
        String[] codigos = {
            "123456",   // ✅ Válido
            "12345",    // ❌ Inválido (5 dígitos)
            "12345a",   // ❌ Inválido (contém letra)
            "1234567",  // ❌ Inválido (7 dígitos)
            "abcdef",   // ❌ Inválido (só letras)
            "000000"    // ✅ Válido (todos zeros)
        };

        //Imprime o padrão usado e uma linha divisória para organizar visualmente a saída.
        System.out.println("Padrão usado: " + regex);
        System.out.println("----------------------------------------");

        //Testa cada código usando a função auxiliar
        //Chama a função auxiliar para testar cada código individualmente.

        for (String codigo : codigos) {
            testarCodigo(padrao, codigo);
        }
    }

    //Função auxiliar para validar e imprimir o resultado
    //Cria um Matcher que aplica o padrão à string codigo.
    public static void testarCodigo(Pattern padrao, String codigo) {
        Matcher matcher = padrao.matcher(codigo);
        //Usa matches() para verificar se a string inteira corresponde ao padrão.
        //Se apenas parte da string corresponder, o resultado será false.
        boolean isValido = matcher.matches(); // Verifica se a string inteira corresponde ao padrão
        //Imprime o resultado da validação de forma clara e formatada.
        //Usa operador ternário para decidir entre "VALIDO" e "INVALIDO".
        System.out.printf("Código '%s': %s%n", codigo, isValido ? "✅ VÁLIDO" : "❌ INVÁLIDO");
    }
}

Exercicio 05: Busca de Ocorrencias (Regex - Parte 1)

Este segundo exercicio para a Secao 4.2 foca na busca de multiplas ocorrencias dentro de um texto, utilizando os metacaracteres \w (caractere de palavra), o quantificador {n,} e o metodo find() da classe Matcher.

Enunciado

Dado um bloco de texto, use Expressoes Regulares para encontrar e listar todas as palavras que possuam 5 ou mais caracteres.

Voce deve usar o metodo find() dentro de um loop while para iterar sobre todas as correspondencias e o metodo group() para extrair a palavra encontrada.

import java.util.regex.Pattern;
import java.util.regex.Matcher;

//Objetivo: Identificar e listar todas as palavras com 5 ou mais caracteres dentro de um texto, utilizando:
//-\w{5,}: metacaractere para palavras com 5 ou mais caracteres.
//-Matcher.find(): busca múltiplas ocorrências.
//-Matcher.group(): extrai a palavra encontrada.
public class BuscaPalavrasLongas {
    public static void main(String[] args) {
        // Texto de entrada para análise
        String texto = "Este eh um exercicio sobre Java e Expressoes Regulares em programacao.";

        // Expressão regular: \w{5,}
        // \w → caractere de palavra (letras, dígitos e underscore)
        // {5,} → 5 ou mais ocorrências consecutivas
        String regex = "\\w{5,}";

        //Compila o padrão regex
        Pattern padrao = Pattern.compile(regex);

        //Aplica o padrão ao texto
        Matcher matcher = padrao.matcher(texto);

        System.out.println("Texto em análise: " + texto);
        System.out.println("----------------------------------------");
        System.out.println("Palavras com 5 ou mais caracteres:");

        int contador = 0;

        //Loop para encontrar todas as ocorrências
        while (matcher.find()) {
            // matcher.group() retorna a palavra encontrada
            String palavraEncontrada = matcher.group();
            System.out.println(" - " + palavraEncontrada);
            contador++;
        }

        System.out.println("----------------------------------------");
        System.out.println("Total de palavras longas encontradas: " + contador);
    }
}

Exercicio 06: Extracao de Componentes de Data (Regex - Parte 2)

Este exercicio eh o primeiro focado na parte 2 da Secao 4.2 (Quinta-feira), utilizando o conceito crucial de Grupos de Captura (()) para extrair dados estruturados e os metodos find() e group(n).

Enunciado

Voce tem uma string que contem uma data no formato DD/MM/AAAA. Crie um programa que use Expressoes Regulares para extrair separadamente o dia, o mes e o ano.

Requisitos:

Crie um padrao com tres grupos de captura (um para cada componente da data).

Use Matcher.find() para localizar a data.

Use Matcher.group(1), Matcher.group(2) e Matcher.group(3) para acessar e imprimir cada parte.


import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtracaoData {
    public static void main(String[] args) {
        //Texto de entrada contendo uma data
        String texto = "A reuniao esta marcada para 25/09/2025, anote ai.";

        //Expressão regular com 3 grupos de captura:
        // (\d{2}) → dois dígitos para o dia
        // (\d{2}) → dois dígitos para o mês
        // (\d{4}) → quatro dígitos para o ano
        String regex = "(\\d{2})/(\\d{2})/(\\d{4})";

        //Compila o padrão regex
        Pattern padrao = Pattern.compile(regex);

        //Aplica o padrão ao texto
        Matcher matcher = padrao.matcher(texto);

        System.out.println("Texto Original: " + texto);
        System.out.println("Padrão: " + regex);
        System.out.println("----------------------------------------");

        //Verifica se a data foi encontrada
        if (matcher.find()) {
            // group(0) → corresponde à data completa
            System.out.println("Data Completa: " + matcher.group(0));

            // group(1) → primeiro grupo de captura: dia
            String dia = matcher.group(1);

            // group(2) → segundo grupo de captura: mês
            String mes = matcher.group(2);

            // group(3) → terceiro grupo de captura: ano
            String ano = matcher.group(3);

            //Imprime os componentes extraídos
            System.out.println("Dia (Grupo 1): " + dia);
            System.out.println("Mês (Grupo 2): " + mes);
            System.out.println("Ano (Grupo 3): " + ano);
        } else {
            System.out.println("Data não encontrada no formato DD/MM/AAAA.");
        }
    }
}

xercicio Extra: Reverter uma String Recursivamente

Este e um excelente exercicio de recursao linear para consolidar os conceitos de Caso Base e Chamada Recursiva. Ele forca o aluno a pensar em como o resultado das chamadas mais profundas eh construido e retornado.

Enunciado

Crie um metodo recursivo chamado reverterString que receba uma String e a retorne na ordem inversa, sem usar loops (for, while) nem a classe StringBuilder ou StringBuffer.

Regras:

Caso Base: Se a string for vazia ou tiver apenas um caractere, retorne a propria string.

Chamada Recursiva: A string invertida eh formada pelo ultimo caractere da string original concatenado com a versao invertida do restante da string (a string menos o primeiro caractere).

Exemplo: reverterString("JAVA")

reverterString("A") + 'V' + 'A' + 'J'

'A' + 'V' + 'A' + 'J' â†’ "AVAJ"

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

Seção 5 - Exercício 1: Calculadora Simples de Soma
Crie um programa que faça o seguinte:
Solicite ao usuário que digite o primeiro número inteiro.
Solicite ao usuário que digite o segundo número inteiro.
Calcule a soma dos dois números.
Imprima o resultado da soma no console em um formato amigável.
Foco: Uso do Scanner para ler um int e uso do System.out.println para a saída formatada.
Codigo:
import java.util.Scanner;

// Importa a classe Scanner da biblioteca java.util para permitir a leitura de dados do usuário via teclado
import java.util.Scanner;

//O objetivo principal deste programa é realizar a soma de dois números inteiros fornecidos pelo usuário.

// Define a classe principal do programa
public class CalculadoraSomaSimples {

    // Método principal que inicia a execução do programa
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado 'scanner' para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis que armazenarão os números digitados e o resultado da soma
        int primeiroNumero;  // Armazena o primeiro número inteiro digitado pelo usuário
        int segundoNumero;   // Armazena o segundo número inteiro digitado pelo usuário
        int soma;            // Armazena o resultado da soma dos dois números

        // --- ENTRADA DE DADOS ---

        // Solicita ao usuário que digite o primeiro número inteiro
        System.out.print("Por favor, digite o primeiro número inteiro: ");
        // Lê o número digitado e armazena na variável 'primeiroNumero'
        primeiroNumero = scanner.nextInt();

        // Solicita ao usuário que digite o segundo número inteiro
        System.out.print("Agora, digite o segundo número inteiro: ");
        // Lê o número digitado e armazena na variável 'segundoNumero'
        segundoNumero = scanner.nextInt();

        // Fecha o objeto Scanner para liberar os recursos do sistema
        scanner.close();

        // --- PROCESSAMENTO ---

        // Realiza a soma dos dois números digitados
        soma = primeiroNumero + segundoNumero;

        // --- SAÍDA DE DADOS ---

        // Exibe uma linha de separação para destacar o resultado
        System.out.println("\n--- Resultado ---");

        // Exibe o resultado da soma de forma clara e amigável
        System.out.println("A soma dos números " + primeiroNumero + " e " + segundoNumero + " é: " + soma);
    }
}

Seção 5 - Exercício 2: Conversor de Metros para Centímetros
Crie um programa que interaja com o usuário para realizar uma conversão de unidades:
Solicite ao usuário que digite um valor em metros (use um tipo de ponto flutuante, como double).
Calcule o valor equivalente em centímetros (1 metro = 100 centímetros).
Imprima a conversão no console.
Foco: Leitura de um valor double com o Scanner e cálculo matemático básico.
Codigo:
import java.util.Scanner;

// Importa a classe Scanner da biblioteca java.util para permitir a leitura de dados do usuário via teclado
import java.util.Scanner;

// Define a classe principal chamada ConversorUnidades
public class ConversorUnidades {

    // Método principal que inicia a execução do programa
    public static void main(String[] args) {

        // 1. Cria um objeto Scanner chamado 'scanner' para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // 2. Declara duas variáveis do tipo double para armazenar:
        // - o valor digitado em metros
        // - o valor convertido em centímetros
        double valorEmMetros;
        double valorEmCentimetros;

        // 3. Define uma constante chamada FATOR_CONVERSAO com valor 100.0
        // Isso representa que 1 metro equivale a 100 centímetros
        final double FATOR_CONVERSAO = 100.0;

        // --- ENTRADA DE DADOS ---

        // 4. Solicita ao usuário que digite um valor em metros
        // O uso de System.out.print mantém o cursor na mesma linha
        System.out.print("Digite o valor em metros (ex: 1,75): ");

        // 5. Lê o valor digitado pelo usuário e armazena na variável 'valorEmMetros'
        // O método nextDouble() é usado para ler números com ponto flutuante
        valorEmMetros = scanner.nextDouble();

        // 6. Fecha o objeto Scanner para liberar os recursos do sistema
        scanner.close();

        // --- PROCESSAMENTO ---

        // 7. Calcula o valor equivalente em centímetros
        // Multiplica o valor em metros pelo fator de conversão
        valorEmCentimetros = valorEmMetros * FATOR_CONVERSAO;

        // --- SAÍDA DE DADOS ---

        // 8. Exibe uma linha de separação para destacar o resultado
        System.out.println("\n--- Conversão ---");

        // 9. Imprime o resultado da conversão de forma clara e amigável
        // Exibe tanto o valor original em metros quanto o resultado em centímetros
        System.out.println(valorEmMetros + " metros equivalem a " + valorEmCentimetros + " centímetros.");
    }
}

Exercício 3: Mensagem de Perfil
Crie um programa que colete três informações distintas do usuário e as combine em uma única mensagem de saída:
Peça o nome completo (String).
Peça a cidade onde mora (String).
Peça o ano de nascimento (int).
Exiba todas as informações coletadas em uma única linha.
Foco: Combinação das funções nextLine() e nextInt() do Scanner e concatenação de Strings na saída
Codigo:
import java.util.Scanner;

// Importa a classe Scanner para permitir a leitura de dados digitados pelo usuário
import java.util.Scanner;

// Define a classe principal do programa
public class MensagemDePerfil {

    // Método principal que inicia a execução do programa
    public static void main(String[] args) {

        // 1. Cria o objeto Scanner para ler a entrada do usuário via teclado
        Scanner scanner = new Scanner(System.in);

        // 2. Declara as variáveis que armazenarão os dados coletados
        String nomeCompleto;   // Armazena o nome completo do usuário
        String cidade;         // Armazena a cidade onde o usuário mora
        int anoNascimento;     // Armazena o ano de nascimento do usuário

        // --- ENTRADA (INPUT) ---

        // 3. Solicita o nome completo e armazena usando nextLine()
        // nextLine() é ideal para capturar frases com espaços
        System.out.print("Digite seu nome completo: ");
        nomeCompleto = scanner.nextLine();

        // 4. Solicita a cidade e armazena usando nextLine()
        System.out.print("Em qual cidade você mora? ");
        cidade = scanner.nextLine();

        // 5. Solicita o ano de nascimento e armazena usando nextInt()
        // nextInt() lê apenas o número inteiro
        System.out.print("Qual seu ano de nascimento? ");
        anoNascimento = scanner.nextInt();

        // 6. Fecha o Scanner para liberar os recursos do sistema
        scanner.close();

        // --- SAÍDA (OUTPUT) ---

        // 7. Exibe uma linha de separação para destacar o resultado
        System.out.println("---");

        // 8. Exibe todas as informações coletadas em uma única linha
        // Usa concatenação de Strings para montar a mensagem final
        System.out.println("Perfil criado: " + nomeCompleto + ", de " + cidade + ", nascido(a) em " + anoNascimento + ".");
    }
}

Desafios (Aprofundamento em I/O)
Seção 5 - Desafio 1: Inversor de Palavras e Linhas Múltiplas
Crie um programa que lide com a leitura de múltiplas palavras na mesma linha e depois inverta uma delas:
Solicite ao usuário que digite três palavras separadas por espaço (ex: "Java é legal"). Use apenas uma chamada nextLine().
Use o método split() da String para dividir a entrada em um array de Strings (tokens).
Inverta a segunda palavra e imprima a frase reformatada no console.
Foco: Manipulação avançada de Strings (que geralmente acompanha a leitura de entrada no console), transformando a entrada de uma linha em múltiplos dados.
Codigo: 
import java.util.Scanner;

// Importa a classe Scanner para permitir a leitura de dados do usuário via teclado
import java.util.Scanner;

public class InversorDePalavras {

    /**
     * Função auxiliar para inverter uma String.
     * @param palavra A string a ser invertida.
     * @return A string invertida.
     */
    public static String inverterString(String palavra) {
        // Usa a classe StringBuilder, que possui o método reverse()
        StringBuilder sb = new StringBuilder(palavra);
        return sb.reverse().toString(); // Retorna a palavra invertida
    }

    public static void main(String[] args) {
        // Cria o objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        String entrada; // Variável para armazenar a linha digitada

        // --- 1. ENTRADA ---

        // Solicita ao usuário que digite três palavras separadas por espaço
        // Usa apenas uma chamada nextLine() para capturar a linha inteira
        System.out.print("Digite três palavras separadas por espaço: ");
        entrada = scanner.nextLine();

        // Exibe a frase original digitada
        System.out.println("Frase original: " + entrada);

        // --- 2. PROCESSAMENTO (Split e Inversão) ---

        // Divide a string em um array de palavras usando espaço como delimitador
        String[] palavras = entrada.split(" ");

        // Verifica se o usuário digitou pelo menos três palavras
        if (palavras.length >= 3) {
            // A segunda palavra está na posição 1 do array
            String palavraAInverter = palavras[1];

            // Chama a função auxiliar para inverter a segunda palavra
            String palavraInvertida = inverterString(palavraAInverter);

            // Substitui a palavra original pela invertida no array
            palavras[1] = palavraInvertida;

            // Junta as palavras novamente em uma única string com espaços
            String fraseModificada = String.join(" ", palavras);

            // --- 3. SAÍDA ---

            // Exibe a frase modificada com a segunda palavra invertida
            System.out.println("Frase modificada: " + fraseModificada);

        } else {
            // Caso o usuário não tenha digitado três palavras, exibe uma mensagem de erro
            System.out.println("Erro: Por favor, digite pelo menos três palavras.");
        }

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}

Seção 5 - Exercício 1: Leitura Simples de Arquivo de Texto (Character Streams)
Crie um programa que leia um arquivo de texto existente e imprima seu conteúdo no console.
Crie manualmente um arquivo chamado entrada.txt na raiz do seu projeto e adicione algumas linhas de texto nele.
No seu código Java, use a classe FileReader (Stream de Caractere) para abrir o arquivo.
Implemente um loop para ler e imprimir cada caractere no console.
Use o bloco try-catch para tratar a exceção IOException.
Foco: Uso básico de FileReader e tratamento de exceções de I/O.
Codigo:
Exercício 1 de Fundamentos de I/O foca na leitura de arquivos usando Character Streams (FileReader) e no tratamento essencial de erros com try-catch.
Lembre-se de criar o arquivo entrada.txt na mesma pasta do seu projeto ou especificar o caminho completo para o arquivo.

import java.io.FileOutputStream;
import java.io.IOException;

public class EscritaDadosBrutos {

    public static void main(String[] args) {

        // 1. Cria um array de bytes com valores numéricos
        // Cada número representa um byte que será gravado no arquivo
        byte[] dados = {10, 20, 30, 40, 50, 60, 70};

        // Nome do arquivo de saída
        String nomeArquivo = "dados_brutos.dat";

        // Mensagem inicial indicando o início da escrita
        System.out.println("Iniciando a escrita de " + dados.length + " bytes no arquivo: " + nomeArquivo);

        // 2. Usa try-with-resources para garantir o fechamento automático do stream
        // FileOutputStream é usado para gravar dados binários (byte stream)
        try (FileOutputStream outputStream = new FileOutputStream(nomeArquivo)) {

            // 3. Grava o array de bytes no arquivo usando o método write()
            outputStream.write(dados);

            // Mensagem de sucesso
            System.out.println("Escrita concluída com sucesso.");

        } catch (IOException e) {
            // 4. Trata exceções de I/O (como erro de permissão ou caminho inválido)
            System.err.println("\n--- ERRO de I/O ---");
            System.err.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }

        // Observação: O arquivo gerado contém dados binários.
        // Se aberto em um editor de texto, os bytes podem aparecer como símbolos não legíveis.
    }
}

Seção 5 - Desafio 2: Cálculo de IMC com Controle de Ponto Flutuante
Crie um programa completo para calcular o Índice de Massa Corporal (IMC) de uma pessoa, tratando os dados com precisão:
Solicite o peso da pessoa em quilogramas (double).
Solicite a altura da pessoa em metros (double).
Calcule o IMC usando a fórmula:
 IMC=(Altura×Altura)Peso​
Imprima o resultado do IMC usando System.out.printf() para garantir que o valor seja exibido com apenas duas casas decimais.
Foco: Combinação de leitura double, cálculo e o uso de printf para formatação precisa da saída no console.
Codigo: 
import java.util.Scanner;

// Importa a classe Scanner para permitir a leitura de dados do usuário via teclado
import java.util.Scanner;

// Define a classe principal chamada CalculadoraIMC
public class CalculadoraIMC {

    // Método principal que inicia a execução do programa
    public static void main(String[] args) {

        // Cria o objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declara as variáveis do tipo double para armazenar os dados
        double peso;   // Peso em quilogramas
        double altura; // Altura em metros
        double imc;    // Índice de Massa Corporal calculado

        // --- 1. ENTRADA (INPUT) ---

        // Solicita ao usuário que digite o peso
        // Usa nextDouble() para ler valores com ponto flutuante
        System.out.print("Digite seu peso em kg (ex: 75,5): ");
        peso = scanner.nextDouble();

        // Solicita ao usuário que digite a altura
        System.out.print("Digite sua altura em metros (ex: 1,75): ");
        altura = scanner.nextDouble();

        // Fecha o Scanner para liberar os recursos do sistema
        scanner.close();

        // --- 2. PROCESSAMENTO ---

        // Calcula o IMC usando a fórmula: IMC = peso / (altura * altura)
        imc = peso / (altura * altura);

        // --- 3. SAÍDA (OUTPUT FORMATADO) ---

        // Exibe uma linha de separação para destacar o resultado
        System.out.println("\n--- Resultado ---");

        // Usa System.out.printf para formatar o valor com duas casas decimais
        // %.2f → formata o número como ponto flutuante com 2 casas decimais
        // %n → quebra de linha (equivalente ao \n, mas mais portátil)
        System.out.printf("Seu IMC calculado é: %.2f%n", imc);
    }
}

Seção 5 - Exercício 2: Escrita de Dados Brutos em Arquivo (Byte Streams)
Crie um programa que grave dados binários (bytes) em um novo arquivo.
Crie um array de bytes com alguns números (ex: byte[] dados = {10, 20, 30, 40, 50};).
Use a classe FileOutputStream (Stream de Byte) para criar e abrir um arquivo chamado dados_brutos.dat.
Use o método write() do stream para gravar o array de bytes no arquivo.
Certifique-se de fechar o stream após a escrita (idealmente usando try-with-resources).
Foco: Uso de FileOutputStream para I/O binário e garantia de fechamento de recursos.
Exercício 2 é crucial para entender a diferença entre streams de caractere (para texto) e streams de byte (para dados brutos/binários). Usaremos o FileOutputStream e a sintaxe try-with-resources para garantir que o arquivo seja fechado.
Aqui está o código Java para escrever dados brutos em um arquivo:
Codigo:
import java.io.FileOutputStream;
import java.io.IOException;

// Importa as classes necessárias para leitura de arquivo e tratamento de exceções
import java.io.FileReader;
import java.io.IOException;

// Define a classe principal do programa
public class LeituraArquivoSimples {

    // Método principal que inicia a execução do programa
    public static void main(String[] args) {

        // Nome do arquivo a ser lido (deve estar na raiz do projeto)
        String nomeArquivo = "entrada.txt";

        // Declara o objeto FileReader fora do try para poder acessá-lo no finally
        FileReader leitor = null;

        // Mensagem inicial indicando o início da leitura
        System.out.println("Iniciando a leitura do arquivo: " + nomeArquivo + "\n");

        try {
            // 1. Instancia o FileReader para abrir o arquivo em modo leitura
            leitor = new FileReader(nomeArquivo);

            int caractereLido; // Variável para armazenar o código ASCII do caractere lido

            // 2. Loop para ler caractere por caractere até o fim do arquivo
            // O método read() retorna -1 quando não há mais caracteres para ler
            while ((caractereLido = leitor.read()) != -1) {
                // Converte o código ASCII para caractere e imprime no console
                System.out.print((char) caractereLido);
            }

        } catch (IOException e) {
            // 3. Trata qualquer exceção de I/O (como arquivo não encontrado ou erro de leitura)
            System.err.println("\n--- ERRO de I/O ---");
            System.err.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());

        } finally {
            // 4. Garante que o recurso será fechado mesmo que ocorra uma exceção
            try {
                if (leitor != null) {
                    leitor.close(); // Fecha o FileReader
                    System.out.println("\n\nLeitor de arquivo fechado com sucesso.");
                }
            } catch (IOException e) {
                // Trata exceção caso ocorra erro ao fechar o arquivo
                System.err.println("Erro ao tentar fechar o arquivo: " + e.getMessage());
            }
        }
    }
}

Seção 5 - Desafio 1: Processamento de Arquivo de Texto com Buffering e Linhas
Crie um programa que utilize streams com buffer para leitura eficiente e reescreva um arquivo com numeração de linhas.
Use o arquivo entrada.txt do Exercício 1.
Use BufferedReader para a leitura eficiente e BufferedWriter para a escrita.
Leia o arquivo original linha por linha usando o método readLine().
Grave o conteúdo em um novo arquivo chamado saida_numerada.txt, prefixando cada linha com o seu número (ex: "1: Conteúdo da primeira linha").
Utilize a sintaxe try-with-resources para garantir o fechamento automático de ambos os streams.
Foco: Eficiência com streams buffered, leitura de linhas (readLine) e uso de try-with-resources.
Desafio 1 é um excelente passo para a eficiência em I/O, utilizando streams com buffer e a sintaxe moderna try-with-resources para lidar com múltiplos arquivos de forma segura e limpa.
Aqui está o código Java para o Desafio 1: Processamento de Arquivo de Texto com Buffering e Linhas.
# Conteúdo do entrada.txt (Exemplo, reutilizando o arquivo):
Primeira linha de texto.
Java I/O é fundamental.
Fim do arquivo.
Código Java (com BufferedReader, BufferedWriter e try-with-resources)

// Importa as classes necessárias para leitura e escrita de arquivos com buffer
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Define a classe principal do programa
public class NumeradorDeLinhas {

    // Método principal que inicia a execução do programa
    public static void main(String[] args) {

        // Define os nomes dos arquivos de entrada e saída
        String arquivoEntrada = "entrada.txt";           // Arquivo original com o conteúdo
        String arquivoSaida = "saida_numerada.txt";      // Arquivo que será gerado com numeração

        // Mensagens informativas no console
        System.out.println("Processando o arquivo: " + arquivoEntrada);
        System.out.println("Gerando arquivo de saída: " + arquivoSaida + "\n");

        // Inicializa o contador de linhas
        int contadorLinhas = 1;

        // Usa try-with-resources para garantir o fechamento automático dos streams
        try (
            // Cria um BufferedReader para leitura eficiente linha por linha
            BufferedReader leitor = new BufferedReader(new FileReader(arquivoEntrada));

            // Cria um BufferedWriter para escrita eficiente no novo arquivo
            BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoSaida))
        ) {
            String linha; // Variável para armazenar cada linha lida

            // Lê o arquivo linha por linha até que readLine() retorne null (fim do arquivo)
            while ((linha = leitor.readLine()) != null) {

                // Constrói a nova linha com prefixo numérico
                String novaLinha = contadorLinhas + ": " + linha;

                // Escreve a nova linha no arquivo de saída
                escritor.write(novaLinha);

                // Adiciona uma quebra de linha após cada escrita
                escritor.newLine();

                // Exibe no console a linha processada
                System.out.println("Linha processada: " + novaLinha);

                // Incrementa o contador para a próxima linha
                contadorLinhas++;
            }

        } catch (IOException e) {
            // Trata qualquer erro de entrada/saída (ex: arquivo não encontrado)
            System.err.println("\n--- ERRO de I/O ---");
            System.err.println("Ocorreu um erro no processamento: " + e.getMessage());
        }

        // Mensagem final com o total de linhas processadas
        System.out.println("\nProcessamento finalizado. Total de " + (contadorLinhas - 1) + " linhas gravadas.");
    }
}

Seção 5 - Desafio 2: Serialização e Desserialização Completa de Objeto
Implemente a lógica completa de salvar e carregar o objeto criado no Exercício 3.
Usando a classe Produto (serializável), crie uma instância de um produto (ex: nome="Celular", preco=1500.0, codigo=101).
Serialização:
Use FileOutputStream e ObjectOutputStream para salvar o objeto em um arquivo chamado produto.ser.
Desserialização:
Use FileInputStream e ObjectInputStream para ler o arquivo produto.ser.
Converta o objeto lido de volta para o tipo Produto (faça o casting).
Imprima todos os campos do objeto original e do objeto desserializado, comprovando que o campo codigo (marcado como transient) não foi mantido.
Foco: Fluxo completo de Serialização/Desserialização, casting e confirmação do efeito de transient.
Desafio 2 é o teste final para entender o fluxo de Serialização (salvar o objeto) e Desserialização (restaurar o objeto), além de comprovar o comportamento da palavra-chave transient.
Você precisará da classe Produto que criamos no Exercício 3 (com codigo marcado como transient) para rodar este código.
Código Java: Serialização e Desserialização
Codigo:
import java.io.*;

import java.io.*;

public class SerializacaoEDesserializacao {

    // Nome do arquivo onde o objeto será salvo
    private static final String ARQUIVO_SER = "produto.ser";

    public static void main(String[] args) {

        // 1. Criação do Objeto Original
        // O campo 'codigo' é marcado como transient e não será salvo na serialização
        Produto original = new Produto("Celular S10", 1500.0, 101);

        System.out.println("--- 1. OBJETO ORIGINAL ---");
        System.out.println("Objeto Original: " + original);
        System.out.println("Código Original (transient): " + original.getCodigo());

        // ----------------------------------------
        // A. SERIALIZAÇÃO (Salvando o Objeto)
        // ----------------------------------------
        System.out.println("\n--- 2. SERIALIZANDO Objeto para o arquivo: " + ARQUIVO_SER);

        try (
            // Cria um fluxo de saída para o arquivo
            FileOutputStream fileOut = new FileOutputStream(ARQUIVO_SER);
            // Cria um fluxo de saída de objetos para serializar o objeto Produto
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut)
        ) {
            // Escreve o objeto no arquivo
            objOut.writeObject(original);
            System.out.println("Serialização concluída. Estado salvo.");

        } catch (IOException i) {
            // Trata erro de escrita no arquivo
            i.printStackTrace();
            return;
        }

        // ----------------------------------------
        // B. DESSERIALIZAÇÃO (Carregando o Objeto)
        // ----------------------------------------
        System.out.println("\n--- 3. DESSERIALIZANDO Objeto do arquivo: " + ARQUIVO_SER);
        Produto restaurado = null;

        try (
            // Cria um fluxo de entrada para ler o arquivo
            FileInputStream fileIn = new FileInputStream(ARQUIVO_SER);
            // Cria um fluxo de entrada de objetos para desserializar o objeto Produto
            ObjectInputStream objIn = new ObjectInputStream(fileIn)
        ) {
            // Lê o objeto do arquivo e faz o casting para Produto
            restaurado = (Produto) objIn.readObject();
            System.out.println("Desserialização concluída. Objeto restaurado.");

        } catch (IOException i) {
            // Trata erro de leitura do arquivo
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            // Trata erro caso a classe Produto não seja encontrada
            System.out.println("Classe Produto não encontrada.");
            c.printStackTrace();
            return;
        }

        // ----------------------------------------
        // 4. COMPROVAÇÃO DO EFEITO TRANSIENT
        // ----------------------------------------
        System.out.println("\n--- 4. COMPROVAÇÃO ---");
        System.out.println("Objeto Restaurado: " + restaurado);

        // Exibe os campos do objeto restaurado
        System.out.println("\nEfeito Transient:");
        System.out.println("Nome (Salvo): " + restaurado.getNome());
        System.out.println("Preço (Salvo): " + restaurado.getPreco());
        System.out.println("Código (Transient, PERDIDO): " + restaurado.getCodigo());
    }
}
