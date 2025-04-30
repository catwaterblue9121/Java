/*1 - 
Escreva um programa que exiba os números pares de 1 a 50 e os números ímpares de 51 a 100 utilizando um laço de repetição. Utilize while.*/
public class SemGPT_1 {

    public static void main(String[] args) {
        int num = 0;
        int numerador = 0;

        System.out.println("Os números pares de 1 a 50 são: ");
        while (num <= 50) {
            numerador = num % 2;

            if (numerador == 0) {
                System.out.println("O número " + num + " é par");
                num++;
            } else {
                num++;
            }
        }

        System.out.println("\nOs números ímpares de 51 a 100 são: ");
        while (num <= 100) {
            numerador = num % 2;

            if (numerador == 1) {
                System.out.println("O número " + num + " é ímnpar");
                num++;
            } else {
                num++;
            }
        }
    }
}
