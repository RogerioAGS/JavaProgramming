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
