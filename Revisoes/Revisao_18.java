import java.util.Scanner;

public class Revisao_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        
        int numero2 = scanner.nextInt();
        int inicio = Math.min(numero1, numero2);
        int fim = Math.max(numero1, numero2);

        System.out.println("Números no intervalo de " + inicio + " a " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            System.out.println(i);
        }
    }
}
