/******************************************************************************
2. Crie um algoritmo que leia uma matriz 3x3 e calcule a soma dos valores das colunas da
matriz.
*******************************************************************************/
import java.util.Scanner;

public class Matriz3x3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] soma = new int[3];

        System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                soma[j] += matriz[i][j];
            }
        }
        System.out.println("\nSomas das colunas:");
        for (int j = 0; j < 3; j++) {
            System.out.println("Coluna " + (j + 1) + " = " + soma[j]);
        }
    }
}

