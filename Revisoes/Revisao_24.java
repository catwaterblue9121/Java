import java.util.Scanner;

public class Revisao_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = {10, 20, 30, 20, 40, 50, 20, 60};

        
        System.out.print("Digite um número para contar suas ocorrências no vetor: ");
        
        int numeroBuscado = scanner.nextInt();
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                contador++;
            }
        }

        System.out.println("O número " + numeroBuscado + " aparece " + contador + " vez(es) no vetor");

    }
}
