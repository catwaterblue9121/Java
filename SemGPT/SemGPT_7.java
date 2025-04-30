/******************************************************************************

7.    
Escreva um programa que calcule e exiba o valor da potência de um número informado pelo usuário elevado a um expoente também
informado pelo usuário, utilizando laços de repetição. Dica: Inicie a variável resultado com o valor 1.
Ex:
Base: 2
Expoente:7
Resultado:128

Base: 5
Expoente:3
Resultado:125

*******************************************************************************/
import java.util.Scanner;
public class SemGPT_7
{
    public static void main(String[] args) {
    Scanner abacate = new Scanner(System.in);
   
    double expoente, base;
   
    System.out.println("Qual o número desejado para ser calculado: ");
    base = abacate.nextDouble();
    System.out.println("Qual o expoente desejado:  ");
    expoente = abacate.nextDouble();
   
    double i = 0;
    double resultado = 1;
    double soma = base;
    while(i < expoente){
       
        resultado = soma * base;
        soma = resultado;
        resultado = 1;
    i++;
    }
    System.out.println("O resultado será:  " + soma);
   
   
    }
}