
/******************************************************************************
Sistema Bancário Simples:
Desenvolver um sistema bancário básico que permita criar contas para múltiplos usuários, realizar depósitos,
saques e consultar saldos, utilizando apenas arrays e estruturas de controle fundamentais do Java.
*******************************************************************************/
import java.util.Scanner;

public class ContaBancaria {

    static String[] nomes = new String[5];
    static int[] numeroscontas = new int[5];
    static double[] saldos = new double[5];
    static int totalcontas = 0;
    static int proximonumeroconta = 1001;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu Banco Simples ---");
            System.out.println("1. Criar nova conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    criarconta(scanner);
                    break;
                case 2:
                    depositar(scanner);
                    break;
                case 3:
                    sacar(scanner);
                    break;
                case 4:
                    consultarsaldo(scanner);
                    break;
                case 5:
                    System.out.println("Encerrando o sistema.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

        } while (opcao != 5);
    }

    public static void criarconta(Scanner scanner) {
        if (totalcontas >= nomes.length) {
            System.out.println("Limite de contas atingido.");
            return;
        }

        System.out.print("Digite o nome do cliente: ");
        scanner.nextLine();
        String nome = scanner.nextLine();

        nomes[totalcontas] = nome;
        numeroscontas[totalcontas] = proximonumeroconta;
        saldos[totalcontas] = 0.0;

        System.out.println("Conta criada com sucesso! Número da conta: " + proximonumeroconta);

        totalcontas++;
        proximonumeroconta++;
    }

    public static void depositar(Scanner scanner) {
        System.out.print("Digite o número da conta: ");
        int numeroconta = scanner.nextInt();

        int indice = encontrarindiceconta(numeroconta);
        if (indice == -1) {
            System.out.println("Conta não encontrada.");
            return;
        }

        System.out.print("Digite o valor a depositar: ");
        double valor = scanner.nextDouble();

        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        saldos[indice] += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public static void sacar(Scanner scanner) {
        System.out.print("Digite o número da conta: ");
        int numeroconta = scanner.nextInt();

        int indice = encontrarindiceconta(numeroconta);
        if (indice == -1) {
            System.out.println("Conta não encontrada.");
            return;
        }

        System.out.print("Digite o valor a sacar: ");
        double valor = scanner.nextDouble();

        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        if (saldos[indice] >= valor) {
            saldos[indice] -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public static void consultarsaldo(Scanner scanner) {
        System.out.print("Digite o número da conta: ");
        int numeroconta = scanner.nextInt();

        int indice = encontrarindiceconta(numeroconta);
        if (indice == -1) {
            System.out.println("Conta não encontrada.");
        } else {
            System.out.println("Cliente: " + nomes[indice]);
            System.out.printf("Saldo atual: R$ %.2f\n", saldos[indice]);
        }
    }

    public static int encontrarindiceconta(int numeroconta) {
        for (int i = 0; i < totalcontas; i++) {
            if (numeroscontas[i] == numeroconta) {
                return i;
            }
        }
        return -1;
    }
}
