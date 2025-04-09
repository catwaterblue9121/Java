/******************************************************************************
5 - Simulador de empréstimo com juros compostos
Peça ao usuário um valor de empréstimo e em quantas parcelas deseja pagar.
Calcule o valor final com juros compostos de 2% ao mês. Mostre o valor final e o valor de cada parcela.
Permita simular vários empréstimos.
*******************************************************************************/
import java.util.Scanner;

public class Desafio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o valor do empréstimo (ou 0 para sair):");
            double valorEmprestimo = scanner.nextDouble();

            if (valorEmprestimo == 0) {
                break;
            }

            System.out.println("Digite o número de parcelas:");
            int parcelas = scanner.nextInt();

            double taxaJuros = 0.02;
            double valorFinal = valorEmprestimo * Math.pow(1 + taxaJuros, parcelas);
            double valorParcela = valorFinal / parcelas;

            System.out.println("Valor final a ser pago: R$" + valorFinal);
            System.out.println("Valor de cada parcela: R$" + valorParcela);
        }

        scanner.close();
    }
}
