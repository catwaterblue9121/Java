/******************************************************************************
4. Crie um algoritmo que leia uma matriz 3x3 e crie uma nova matriz que seja a matriz
transposta da primeira (troque as linhas por colunas)
*******************************************************************************/
import java.util.Scanner;

public class MatrizInv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] transposta = new int[3][3];
        
        System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        System.out.println("\nMatriz Original:");
        exibmat(matriz);

        System.out.println("\nMatriz Transposta:");
        exibmat(transposta);
    }
    public static void exibmat(int[][] m) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

