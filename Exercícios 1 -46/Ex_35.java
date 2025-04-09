/******************************************************************************

35) Faça um programa que leia o nome e o valor de 10 produtos, calcule o valor total da compra e após escolha a forma de pagamento:
 
 1 - À Vista em Dinheiro ou Pix, recebe 8% de desconto.

 2 - À Vista no cartão de crédito, recebe 3% de desconto.

 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros.

 4 - Parcelado no cartão em três vezes ou até 10 parcelas, preço normal do produto mais juros de 10%.

*******************************************************************************/
import java.util.Scanner;

public class Ex_35
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double preço, preçototal;
		String Nomepro;
		int i;

		i = 0;
		preçototal = 0;
		preço = 0;
		do {
			i++;
			System.out.print("Diga o nome do " + i + "° produto:  ");
			Nomepro = ler.nextLine();
			System.out.print("Diga o preço do " + i + "° produto:  ");
			preço = ler.nextDouble();

			ler.nextLine();

			preçototal += preço;
			preço = 0;
		} while(i < 10);

        System.out.println("O preço total de todos os produtos é: " + preçototal);

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - À Vista em Dinheiro ou Pix (8% de desconto)");
        System.out.println("2 - À Vista no Cartão de Crédito (3% de desconto)");
        System.out.println("3 - Parcelado no Cartão em 2 vezes (sem juros)");
        System.out.println("4 - Parcelado no Cartão em 3 ou mais vezes (10% de juros)");

        int opcao = ler.nextInt();
        double valorFinal = 0;

        switch (opcao) {
            
            case 1:
                valorFinal = preçototal - (preçototal * 0.08);
                System.out.println("Você escolheu à vista em Dinheiro ou Pix. Desconto de 8%. Total: R$ " + valorFinal);
                break;
            
            case 2:
                valorFinal = preçototal - (preçototal * 0.03);
                System.out.println("Você escolheu à vista no Cartão de Crédito. Desconto de 3%. Total: R$ " + valorFinal);
                break;
            
            case 3:
                valorFinal = preçototal;
                System.out.println("Você escolheu parcelar em 2 vezes. Total: R$ " + valorFinal);
                break;
           
            case 4:
                valorFinal = preçototal + (preçototal * 0.10);
                System.out.println("Você escolheu parcelar em 3 ou mais vezes. Juros de 10%. Total: R$ " + valorFinal);
                break;
            
            default:
                System.out.println("Opção inválida.");
        }

        ler.close();
    }
}
