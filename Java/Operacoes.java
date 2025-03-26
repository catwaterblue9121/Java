/*
 Segundo problema em Java
 Desenvolva um programa que calcule a soma de dois números
*/

import java.util.Scanner; // Importa para ler as entradas do teclado

public class Operacoes {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b;
        
        // Lê o primeiro valor
        System.out.print("Informe o primeiro valor: ");
        a = ler.nextInt();
        
        // Lê o segundo valor
        System.out.print("Informe o segundo valor: ");
        b = ler.nextInt();
        
        // Exibe os resultados
        System.out.println("Resultados:");
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtracao: " + (a - b));
        System.out.println("Multiplicacao: " + (a * b));
        System.out.println("Divisao inteira: " + (a / b)); // Divisão inteira
        System.out.println("Divisao exata: " + ((double) a % b)); // Divisão com ponto flutuante
    }
}
