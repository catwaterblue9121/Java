/*
Exercicio 021
Crie um vetor de 10 inteiros e inicialize-o com valores sequenciais (1, 2, 3, ..., 10). Em seguida, imprima todos os valores do vetor na tela.
*/

public class Revisao_21 {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        // Inicializando o vetor com valores de 1 a 10
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
        }

        // Imprimindo os valores do vetor
        System.out.println("Valores do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}