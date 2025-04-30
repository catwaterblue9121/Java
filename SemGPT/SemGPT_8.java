/******************************************************************************

8.    Leia a idade de cinco pessoas e exiba a soma e a média das idades.

*******************************************************************************/
import java.util.Scanner;
public class SemGPT_8
{
    public static void main(String[] args) {
    Scanner abacate = new Scanner(System.in);
    double idade, media;
    double soma = 0;
    for(int i = 1; i < 6; i++){
        System.out.println("Qual a idade da " + i + "º " + "pessoa:  ");
        idade = abacate.nextDouble();
        soma += idade;
    }
   
    media = soma / 5;
   
    System.out.println("A soma das idades é: " + soma);
    System.out.println("A média das idade é: " + media);
  }
}