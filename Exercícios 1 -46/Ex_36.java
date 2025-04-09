/******************************************************************************

36) Desenvolver um programa com menu para simular uma conta corrente:    
     a) Depósito bancário
     b) Saque
     c) Saldo
     d) Sair

*******************************************************************************/
import java.util.Scanner;

public class Ex_36 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double saldo = 0.0;
        int opcao;


        do {

            System.out.println("\nMenu:");
            System.out.println("1 - Depósito bancário");
            System.out.println("2 - Saque");
            System.out.println("3 - Saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = ler.nextInt();  // Lê a opção escolhida pelo usuário

            switch (opcao) {
                case 1:

                    System.out.print("Digite o valor para depósito: R$ ");
                    double deposito = ler.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso. Saldo atual: R$ " + saldo);
                    } else {
                        System.out.println("Valor de depósito inválido.");
                    }
                    break;
                
                case 2:
                    
                    System.out.print("Digite o valor para saque: R$ ");
                    double saque = ler.nextDouble();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso. Saldo atual: R$ " + saldo);
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente para o saque.");
                    } else {
                        System.out.println("Valor de saque inválido.");
                    }
                    break;
                
                case 3:

                    System.out.println("Saldo atual: R$ " + saldo);
                    break;
                
                case 4:

                    System.out.println("Saindo... Até logo!");
                    break;
                
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        ler.close();
    }
}