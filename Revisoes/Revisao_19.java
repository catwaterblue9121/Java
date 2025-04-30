import java.util.Scanner;

public class Revisao_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperatura;
        double somaTemperaturas = 0;
        double menorTemperatura = Double.MAX_VALUE;
        double maiorTemperatura = Double.MIN_VALUE;
        int contador = 0;
        
        while (true) {
            System.out.print("Digite uma temperatura e 0 para parar: ");
            temperatura = scanner.nextDouble();

            if (temperatura == 0) {
                break;
            }

            somaTemperaturas += temperatura;
            contador++;

            if (temperatura < menorTemperatura) {
                menorTemperatura = temperatura;
            }

            if (temperatura > maiorTemperatura) {
                maiorTemperatura = temperatura;
            }
        }

        if (contador > 0) {
            double mediaTemperaturas = somaTemperaturas / contador;
            System.out.println("\nAnálise de Temperaturas:");
            System.out.printf("Menor Temperatura: %.2f°C\n", menorTemperatura);
            System.out.printf("Maior Temperatura: %.2f°C\n", maiorTemperatura);
            System.out.printf("Média das Temperaturas: %.2f°C\n", mediaTemperaturas);
        } else {
            System.out.println("Nenhuma temperatura foi registrada.");
        }
    }
}
