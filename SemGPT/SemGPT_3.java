/*3.   
Crie um programa que solicite ao usuário um número e exiba a tabuada desse número utilizando um laço de repetição. Utilize while.*/
import java.util.Scanner;

public class SemGPT_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1;

        System.out.println("'Escreva sua tabuada: ");
        n1 = scanner.nextInt();

        int tabuada = 0;

        while (tabuada < 11) {
            System.out.println(n1 + " X " + tabuada + " = " + (n1 * tabuada));
            tabuada++;
        }
        scanner.close();
    }
}
