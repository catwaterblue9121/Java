/******************************************************************************
1. Crie um programa que leia uma matriz 5x5. Em seguida, conte quantos números pares
existem na matriz.
*******************************************************************************/
import java.util.Scanner;

public class Matriz5x5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int pares = 0;

        System.out.println("Digite os valores da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                if (matriz[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }
        System.out.println("\nA quantidade de números pares na matriz é: " + pares);
    }
}
