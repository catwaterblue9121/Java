/*4.   
Crie um programa que solicite ao usuário um número e exiba a tabuada desse número utilizando um laço de repetição. Utilize for.*/
import java.util.Scanner;

public class SemGPT_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1;

        System.out.println("'Escreva sua tabuada: ");
        n1 = scanner.nextInt();

       for (int i = 0; i < 11; i++) {
           System.out.println(n1 + " X " + i + " = " + (n1*i));
       }
    }
}
