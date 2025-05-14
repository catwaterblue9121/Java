import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Matriz5x5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        Set<Integer> elementos = new HashSet<>();
        Set<Integer> repetidos = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o elemento da posição (" + (i+1) + "," + (j+1) + "): ");
                int num = sc.nextInt();
                matriz[i][j] = num;
                if (elementos.contains(num)) {
                    repetidos.add(num);
                } else {
                    elementos.add(num);
                }
            }
        }

        System.out.println("\nMatriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        if (repetidos.isEmpty()) {
            System.out.println("\nNão há números repetidos na matriz.");
        } else {
            System.out.println("\nNúmeros repetidos na matriz: " + repetidos);
        }
    }
}
