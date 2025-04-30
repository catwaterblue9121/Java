/*
Exercicio 010
Faça um Programa que peça dois números e imprima o maior deles.
*/
import java.util.Scanner;

public class Revisao_10 {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Digite o primeiro numero: ");
int n1 = scanner.nextInt();
System.out.print("Digite o segundo numero: ");
int n2 = scanner.nextInt();

if (n1 < n2) {
System.out.println("O maior número é: " + n2);
} else {
System.out.println("O maior número é: " + n1);
}

}
}