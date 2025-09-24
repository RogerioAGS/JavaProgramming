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

Exercício 9: Validação de Dados
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

Exercício 10: Classe Produto
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

Exercício 11: Controle de Acesso de Escrita
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

Exercício 12: Atributos Calculados
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

Atividade 13: Leitura e Compreensao de Codigo

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

Atividade 14: ArrayList vs. Array

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

Atividade 14: Herança com ArrayList

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

Atividade 15: Modelagem de um Sistema de Veiculos

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

Desafio 3: Classificação de Alunos
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

Desafio 4: Encapsulamento de Array
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
        alunos.put(101, "João Silva");
        alunos.put(102, "Maria Oliveira");
        alunos.put(103, "Carlos Santos");
        System.out.println("Mapa de alunos: " + alunos); // Ex: {101=João Silva, 102=Maria Oliveira, 103=Carlos Santos}

        // 2. Encontrar o nome de um aluno pela sua matrícula (chave)
        System.out.println("\n--- Buscando um aluno ---");
        String nomeAluno = alunos.get(102);
        System.out.println("O nome do aluno com matrícula 102 é: " + nomeAluno); // Saída: Maria Oliveira

        // 3. Verificar se uma matrícula já existe
        System.out.println("\n--- Verificando matrícula ---");
        boolean temMatricula = alunos.containsKey(101);
        System.out.println("A matrícula 101 existe? " + temMatricula); // Saída: true

        // 4. Remover um aluno pela sua matrícula
        System.out.println("\n--- Removendo um aluno ---");
        alunos.remove(103);
        System.out.println("Mapa após remover o aluno 103: " + alunos); // Ex: {101=João Silva, 102=Maria Oliveira}
    }
}

