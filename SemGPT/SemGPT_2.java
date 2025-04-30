/*2.   
Escreva um programa que exiba os números pares de 1 a 50 e os números ímpares de 51 a 100 utilizando um laço de repetição. Utilize for.*/
public class SemGPT_2 {

    public static void main(String[] args) {
        int num = 0;
        int numerador = 0;

        System.out.println("Os números pares entre 1 e 50 são: ");
        for (int i = 0; i < 51; i++) {
            numerador = num % 2;

            if (numerador == 0) {
                System.out.println(num + " ");
                num++;
            } else {
                num++;
            }

        }

        System.out.println("\nOs números ímpares entre 51 e 100 são: ");
        num = 51;
        for (int i = num; i <= 100; i++) {
            numerador = num % 2;

            if (numerador == 1) {
                System.out.println(num + " ");
                num++;
            } else {
                num++;
            }

        }
    }
}
