/******************************************************************************
 * 1- Sistema de votação com contagem por candidato
Simule uma eleição com 3 candidatos. Os votos são inseridos até que o usuário digite 0.
O programa deve validar se o voto é válido (1, 2, 3) e exibir ao final a quantidade de votos por candidato e o vencedor.
Empates devem ser considerados.
*******************************************************************************/
import java.util.Scanner;

public class Desafio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voto1 = 0, voto2 = 0, voto3 = 0;
        int voto;

        while (true) {
            System.out.println("Digite o número do candidato (1, 2, 3) ou 0 para terminar:");
            voto = scanner.nextInt();

            if (voto == 0) {
                break;
            } else if (voto == 1) {
                voto1++;
            } else if (voto == 2) {
                voto2++;
            } else if (voto == 3) {
                voto3++;
            } else {
                System.out.println("Voto inválido! Tente novamente.");
            }
        }

        System.out.println("Resultado da eleição:");
        System.out.println("Candidato 1: " + voto1 + " votos");
        System.out.println("Candidato 2: " + voto2 + " votos");
        System.out.println("Candidato 3: " + voto3 + " votos");

        int maxVotos = Math.max(Math.max(voto1, voto2), voto3);
        if (voto1 == voto2 && voto2 == voto3) {
            System.out.println("Houve um empate entre todos os candidatos.");
        } else if (voto1 == maxVotos) {
            System.out.println("O vencedor é o Candidato 1.");
        } else if (voto2 == maxVotos) {
            System.out.println("O vencedor é o Candidato 2.");
        } else {
            System.out.println("O vencedor é o Candidato 3.");
        }
    }
}
