/******************************************************************************

9.   Escreva um programa que leia 20 números do usuário e exiba quantos números são maiores que 10.

*******************************************************************************/
import java.util.Scanner;
public class SemGPT_9
{
    public static void main(String[] args) {
    Scanner abacate = new Scanner(System.in);
    double num;
    int cont = 0;
    for(int i = 1; i < 11; i++){
        System.out.println("Qual o número a ser adicionado: ");
        num = abacate.nextDouble();
        if(num > 10){
            cont++;
        }
    }
    System.out.println("A quantidade de números maióres que 10 são: " + cont);
  }
}