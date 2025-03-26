/*
Escreva um programa que identifique um número de 0 a 10, caso contrário dará erro
*/

import java.util.Scanner;

public class ExemploCondicional {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x;
       
        System.out.print("Digite um número: ");
        x = ler.nextInt();
       
        if (x <= 10 && x >= 0) {
            System.out.println("Número está entre 0 a 10");
        } else {
            System.out.println("Erro");
        }
    }
}