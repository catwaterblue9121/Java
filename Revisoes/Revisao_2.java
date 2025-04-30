/******************************************************************************
Exercicio 002
Faça um Programa que peça dois números e imprima a soma.
*******************************************************************************/
import java.util.Scanner;
public class Revisao_2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, soma;
       
        System.out.print("Escreva o primeiro número: ");
        n1 = scanner.nextInt();
       
        System.out.print("Escreva o segundo número: ");
        n2 = scanner.nextInt();
       
        soma = n1 + n2;
       
        System.out.println("A soma dos númeors será: " + soma);
       
       
       
    }
}