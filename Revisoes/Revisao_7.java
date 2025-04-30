/** ****************************************************************************
 *Exercicio 007
 * Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
 ****************************************************************************** */
import java.util.Scanner;

public class Revisao_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a altura: ");
        double n1 = scanner.nextDouble();

        double conversao = (72.7 * n1) - 58;

        System.out.println("O peso ideal é: " + conversao + " Kg");
    }
}