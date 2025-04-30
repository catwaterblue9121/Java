/******************************************************************************

10.  Faça um algoritmo que leia 10 números inteiros e, ao final, escreva quantos estão entre 0 e 100.

*******************************************************************************/
import java.util.Scanner;
public class SemGPT_10
{
    public static void main(String[] args) {
    Scanner abacate = new Scanner(System.in);
    int num;
    int cont = 0;
    for(int i = 1; i < 11; i++){
        System.out.println("Qual o número a ser adicionado: ");
        num = abacate.nextInt();
        if(num >= 0 && num <= 100){
            cont++;
        }
    }
    System.out.println("A quantidade de números maióres que 10 são: " + cont);
  }
}