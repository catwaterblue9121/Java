/******************************************************************************
5. Desenvolva um programa que leia duas matrizes 5x2 e crie uma terceira matriz também 5x2
com o valor da soma dos elementos de mesmo índice.
*******************************************************************************/
import java.util.Scanner;

public class Matrizsoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz1 = new int[5][2];
        int[][] matriz2 = new int[5][2];
        int[][] soma = new int[5][2];

        System.out.println("Digite os valores da primeira matriz 5x2:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matriz1[" + i + "][" + j + "]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nDigite os valores da segunda matriz 5x2:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matriz2[" + i + "][" + j + "]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("\nMatriz 1:");
        exibmat(matriz1);

        System.out.println("\nMatriz 2:");
        exibmat(matriz2);

        System.out.println("\nSoma:");
        exibmat(soma);
    }
    public static void exibmat(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
