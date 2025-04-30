/** ****************************************************************************
 *Exercicio 005
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
 *******************************************************************************/
import java.util.Scanner;

public class Revisao_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ganho por hora: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite as horas trabalhadas: ");
        double n2 = scanner.nextDouble();

        double total = n1 * n2;

        System.out.println("A salário total no mês é: " + total + "R$");
    }
}