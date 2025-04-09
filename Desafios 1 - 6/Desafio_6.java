/******************************************************************************
6 - Faça um programa em Java para resolver a equação de 2º grau.        
        Pedir para o usuário entrar com as variáveis A, B e C .
        Mostrar o valor de x1, x2 e delta.
       
Usar a biblioteca:
 import java.lang.Math;
 Usar o "Math.sqrt" para encontrar a raiz quadrada. Ex.: raiz = Math.sqrt(9); // = 3
 Usar o "Math.pow" para fazer a potenciação Ex.: potencia= Math.pow(5,2); // = 25
 *Usar double se resultar em números decimais
*******************************************************************************/
import java.util.Scanner;

public class Desafio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores de A, B e C para a equação de 2º grau (Ax² + Bx + C = 0):");
        System.out.print("A: ");
        double A = scanner.nextDouble();
        System.out.print("B: ");
        double B = scanner.nextDouble();
        System.out.print("C: ");
        double C = scanner.nextDouble();

        double delta = Math.pow(B, 2) - 4 * A * C;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else {
            double x1 = (-B + Math.sqrt(delta)) / (2 * A);
            double x2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.println("Delta: " + delta);
            System.out.println("Raiz 1 (x1): " + x1);
            System.out.println("Raiz 2 (x2): " + x2);
        }

        scanner.close();
    }
}
