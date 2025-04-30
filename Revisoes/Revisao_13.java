import java.util.Scanner;

public class Revisao_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        double maior = num1;

        if (num2 > maior) {
            maior = num2;
        }

        if (num3 > maior) {
            maior = num3;
        }

        System.out.println("O maior número é: " + maior);
    }
}
