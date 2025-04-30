/** ****************************************************************************
 *Exercicio 004
 * Faça um Programa que converta metros para centímetros.
 ****************************************************************************** */
import java.util.Scanner;

public class Revisao_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o metro: ");
        double n1 = scanner.nextDouble();

        double conversao = n1 * 100;

        System.out.println("A conversao do metro para cm é é: " + conversao + "cm");
    }
}