/******************************************************************************
3 - Cadastro de notas com classificação
O programa deve permitir o cadastro de várias notas (entre 0 e 10). A cada nota inserida, o sistema deve classificar como:
*******************************************************************************/
import java.util.Scanner;

public class Desafio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countExcelente = 0, countBom = 0, countRegular = 0, countInsuficiente = 0;
        double somaNotas = 0;
        int contador = 0;

        while (true) {
            System.out.println("Digite a nota (entre 0 e 10) ou -1 para encerrar:");
            double nota = scanner.nextDouble();

            if (nota == -1) {
                break;
            }

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                continue;
            }

            somaNotas += nota;
            contador++;

            if (nota >= 9) {
                countExcelente++;
            } else if (nota >= 7) {
                countBom++;
            } else if (nota >= 5) {
                countRegular++;
            } else {
                countInsuficiente++;
            }
        }

        if (contador > 0) {
            double media = somaNotas / contador;
            System.out.println("Média geral: " + media);
            System.out.println("Excelente: " + countExcelente);
            System.out.println("Bom: " + countBom);
            System.out.println("Regular: " + countRegular);
            System.out.println("Insuficiente: " + countInsuficiente);
        } else {
            System.out.println("Nenhuma nota foi registrada.");
        }

        scanner.close();
    }
}
