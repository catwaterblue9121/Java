/* 1) Desenvolver um programa que leia uma matriz 4 X 4
   a) Verificar o número de linhas e colunas
   b) Mostrar a matriz  formatada */
import java.util.Scanner;

public class Matriz4x4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o elemento da posição (" + (i + 1) + "," + (j + 1) + "): ");
                matriz[i][j] = sc.nextInt();
            }
        }

        int linhas = matriz.length;
        int colunas = matriz[0].length;

        System.out.println("\nA matriz tem " + linhas + " linhas e " + colunas + " colunas.\n");

        System.out.println("Matriz 4x4 formatada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
