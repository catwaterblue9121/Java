import java.util.Scanner;

public class Revisao_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual do colaborador: R$ ");
        double salarioAtual = scanner.nextDouble();

        double percentualAumento;
        if (salarioAtual <= 280) {
            percentualAumento = 20;
        } else if (salarioAtual <= 700) {
            percentualAumento = 15;
        } else if (salarioAtual <= 1500) {
            percentualAumento = 10;
        } else {
            percentualAumento = 5;
        }

        double valorAumento = salarioAtual * (percentualAumento / 100);
        double novoSalario = salarioAtual + valorAumento;

        System.out.println("\nReajuste Salarial");
        System.out.println("Salário antes do reajuste: R$ " + salarioAtual);
        System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
        System.out.println("Valor do aumento: R$ " + valorAumento);
        System.out.println("Novo salário após o aumento: R$ " + novoSalario);
    }
}
