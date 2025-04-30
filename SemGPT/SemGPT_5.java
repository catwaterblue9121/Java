/*5.   
 Faça um programa que calcule e exiba a soma dos números pares de 1 a 100 utilizando um laço de repetição. Utilize while.
 */
public class SemGPT_5 {

    public static void main(String[] args) {
        int soma = 0;
        int i = 0;
        int resultado = 0;
        while (i < 101) {
            resultado = i % 2;
            if (resultado == 0) {
                soma += i;
            }
            i++;
        }
        System.out.println("Essa é a soma dos números pares de 1 a 100: " + soma);
    }
}
