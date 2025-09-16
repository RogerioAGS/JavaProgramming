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
