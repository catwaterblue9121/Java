import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler a entrada do usuário
        Scanner ler = new Scanner(System.in);

        // Pedindo a base e altura do triângulo
        System.out.print("Digite a base do triângulo: ");
        double base = ler.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double altura = ler.nextDouble();

        // Calculando a área do triângulo
        double area = (base * altura) / 2;

        // Exibindo o resultado
        System.out.println("A área do triângulo é: " + area);

        // Fechando o scanner
        ler.close();
    }
}
