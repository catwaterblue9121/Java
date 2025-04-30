import java.util.Scanner;

public class Revisao_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho da área a ser pintada em metros quadrados: ");
        double area = scanner.nextDouble();

        double coberturaPorLitro = 3.0;
        double litrosNecessarios = area / coberturaPorLitro;
        int capacidadeLata = 18;
        double precoLata = 80.0;
        int latasNecessarias = (int) Math.ceil(litrosNecessarios / capacidadeLata);

        double precoTotal = latasNecessarias * precoLata;

        System.out.println("Quantidade de latas de tinta a serem compradas: " + latasNecessarias);
        System.out.println("Preço total: R$ " + String.format("%.2f", precoTotal));
    }
}
