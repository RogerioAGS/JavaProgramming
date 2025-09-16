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