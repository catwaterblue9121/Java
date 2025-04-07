import java.util.Scanner;

public class Ex_36 {

    private static double saldo = 0.0; 

    public static void exibirMenu() {
        System.out.println("\nMenu da Conta Corrente:");
        System.out.println("a) Depósito Bancário");
        System.out.println("b) Saque");
        System.out.println("c) Consultar Saldo");
        System.out.println("d) Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void deposito(Scanner scanner) {
        System.out.print("Digite o valor para depósito: R$ ");
        double valor = scanner.nextDouble();
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso! Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public static void saque(Scanner scanner) {
        System.out.print("Digite o valor para saque: R$ ");
        double valor = scanner.nextDouble();
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! Novo saldo: R$ " + saldo);
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para o saque.");
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    public static void consultarSaldo() {
        System.out.println("Seu saldo atual é: R$ " + saldo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcao;

        do {
            
            exibirMenu();
            opcao = scanner.next().charAt(0);  

            switch (opcao) {
                case 'a':
                    deposito(scanner); 
                    break;
                case 'b':
                    saque(scanner);  
                    break;
                case 'c':
                    consultarSaldo();
                    break;
                case 'd':
                    System.out.println("Saindo... Obrigado por usar nosso sistema.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 'd');  

        scanner.close();  
    }
}
