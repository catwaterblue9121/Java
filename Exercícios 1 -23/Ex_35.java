/*
35) Faça um programa que leia o nome e o valor de 10 produtos, calcule o valor total da compra e após escolha a forma de pagamento:
 
 1 - À Vista em Dinheiro ou Pix, recebe 8% de desconto.

 2 - À Vista no cartão de crédito, recebe 3% de desconto.

 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros.

 4 - Parcelado no cartão em três vezes ou até 10 parcelas, preço normal do produto mais juros de 10%.

 * Montar um menu com os itens acima para o usuário escolher a forma de pagamento e mostrar a lista dos produtos comprados e o valor a ser pago.
*/
import java.util.Scanner;

public class Ex_35 {

    public static void exibirMenu() {
        System.out.println("\nEscolha a forma de pagamento:");
        System.out.println("1 - À Vista em Dinheiro ou Pix (desconto de 8%)");
        System.out.println("2 - À Vista no Cartão de Crédito (desconto de 3%)");
        System.out.println("3 - Parcelado em 2 vezes (sem juros)");
        System.out.println("4 - Parcelado em 3 ou mais vezes (juros de 10%)");
    }

    public static double calcularPagamento(double valorTotal, int opcaoPagamento) {
        double valorFinal = valorTotal;
        switch (opcaoPagamento) {
            case 1:
             
                valorFinal = valorTotal * 0.92;
                break;
            case 2:
                
                valorFinal = valorTotal * 0.97;
                break;
            case 3:
               
                valorFinal = valorTotal;
                break;
            case 4:
               
                valorFinal = valorTotal * 1.10;
                break;
            default:
                System.out.println("Opção de pagamento inválida.");
                break;
        }
        return valorFinal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] produtos = new String[10];
        double[] valores = new double[10];
        double totalCompra = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "º produto: ");
            produtos[i] = scanner.nextLine();
            System.out.print("Digite o valor do " + (i + 1) + "º produto: R$ ");
            valores[i] = scanner.nextDouble();
            scanner.nextLine();
            totalCompra += valores[i];
        }

        System.out.println("\nLista de produtos comprados:");
        for (int i = 0; i < 10; i++) {
            System.out.println(produtos[i] + ": R$ " + String.format("%.2f", valores[i]));
        }
        System.out.println("\nValor total da compra: R$ " + String.format("%.2f", totalCompra));

        exibirMenu();
        System.out.print("Escolha a opção de pagamento: ");
        int opcaoPagamento = scanner.nextInt();

        double valorFinal = calcularPagamento(totalCompra, opcaoPagamento);

        if (opcaoPagamento >= 1 && opcaoPagamento <= 4) {
            System.out.println("\nResumo da compra:");
            for (int i = 0; i < 10; i++) {
                System.out.println(produtos[i] + ": R$ " + String.format("%.2f", valores[i]));
            }
            System.out.println("\nValor total: R$ " + String.format("%.2f", totalCompra));

            String descricaoPagamento = "";
            switch (opcaoPagamento) {
                case 1:
                    descricaoPagamento = "À Vista em Dinheiro ou Pix (desconto de 8%)";
                    break;
                case 2:
                    descricaoPagamento = "À Vista no Cartão de Crédito (desconto de 3%)";
                    break;
                case 3:
                    descricaoPagamento = "Parcelado em 2 vezes (sem juros)";
                    break;
                case 4:
                    descricaoPagamento = "Parcelado em 3 ou mais vezes (juros de 10%)";
                    break;
            }

            System.out.println("Forma de pagamento: " + descricaoPagamento);
            System.out.println("Valor a ser pago: R$ " + String.format("%.2f", valorFinal));
        } else {
            System.out.println("Opção de pagamento inválida.");
        }

        scanner.close();
    }
}
