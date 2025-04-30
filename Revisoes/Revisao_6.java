/** ****************************************************************************
 *Exercicio 006
Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius. C = (5 * (F-32) / 9).
 *******************************************************************************/
import java.util.Scanner;

public class Revisao_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Farenheit: ");
        double n1 = scanner.nextDouble();

        double conversao = (n1-32) *  5 / 9;

        System.out.println("A conversao para graus celsius é: " + conversao + " graus Celsius");
    }
}