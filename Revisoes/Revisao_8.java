/*Exercicio 008
João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
*/
import java.util.Scanner;

public class Revisao_8{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso de peixes kg: ");
        double peso = scanner.nextDouble();

        double excesso = 0;
        double multa = 0;
        double LimitePeso = 50;
        double ValorMultaPorQuilo = 4.00;

        if (peso > LimitePeso) {
            excesso = peso - LimitePeso;
            multa = excesso * ValorMultaPorQuilo;
        }

        System.out.println("Peso de peixes: " + peso + " Kg");
        System.out.println("Excesso: " + excesso + " Kg");
        System.out.print("Multa a pagar: " +  "R$" + multa);
    }
}