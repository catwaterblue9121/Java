/******************************************************************************
4 - Caixa eletrônico com cédulas disponíveis
Simule um caixa eletrônico. O usuário informa o valor do saque, e o programa informa quantas cédulas de R$100,
R$50, R$20, R$10 e R$5 serão entregues,com base nas cédulas disponíveis.
Caso não seja possível realizar o saque com as cédulas, exiba uma mensagem de erro.
*******************************************************************************/
import java.util.Scanner;

public class Desafio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] cedulas = {100, 50, 20, 10, 5};
        
        System.out.println("Digite o valor do saque:");
        int valor = scanner.nextInt();
        
        if (valor % 5 != 0) {
            System.out.println("O valor deve ser múltiplo de 5.");
            return;
        }

        System.out.println("Cédulas para o saque:");
        for (int cedula : cedulas) {
            int quantidade = valor / cedula;
            if (quantidade > 0) {
                System.out.println(quantidade + " cédula(s) de R$" + cedula);
                valor %= cedula;
            }
        }

        if (valor > 0) {
            System.out.println("Não é possível realizar o saque com as cédulas disponíveis.");
        }

        scanner.close();
    }
}
