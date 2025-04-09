/******************************************************************************
2 - Jogo de adivinhação com dificuldade
Crie um jogo de adivinhação onde o jogador escolhe a dificuldade (fácil: 1 a 10, médio: 1 a 50, difícil: 1 a 100).
O programa gera um número aleatório(pesquisar) e o jogador tem 5 tentativas para acertar.
A cada erro, o programa dá dicas: "maior" ou "menor".
*******************************************************************************/
import java.util.Random;
import java.util.Scanner;

public class Desafio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Escolha a dificuldade (1 - Fácil, 2 - Médio, 3 - Difícil):");
        int dificuldade = scanner.nextInt();
        int numeroMaximo = 0;
        
        switch (dificuldade) {
            case 1:
                numeroMaximo = 10;
                break;
            case 2:
                numeroMaximo = 50;
                break;
            case 3:
                numeroMaximo = 100;
                break;
            default:
                System.out.println("Dificuldade inválida.");
                return;
        }

        int numeroAleatorio = random.nextInt(numeroMaximo) + 1;
        int tentativas = 5;
        int palpite;
        boolean acertou = false;

        System.out.println("Tente adivinhar o número entre 1 e " + numeroMaximo + ". Você tem " + tentativas + " tentativas.");

        while (tentativas > 0 && !acertou) {
            System.out.println("Digite seu palpite:");
            palpite = scanner.nextInt();
            tentativas--;

            if (palpite == numeroAleatorio) {
                acertou = true;
                System.out.println("Parabéns! Você acertou o número.");
            } else {
                if (palpite < numeroAleatorio) {
                    System.out.println("O número é maior.");
                } else {
                    System.out.println("O número é menor.");
                }

                if (tentativas > 0) {
                    System.out.println("Você tem " + tentativas + " tentativas restantes.");
                } else {
                    System.out.println("Você não acertou. O número era " + numeroAleatorio + ".");
                }
            }
        }

        scanner.close();
    }
}
