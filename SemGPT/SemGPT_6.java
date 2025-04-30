/*6.   
Faça um programa que calcule e exiba a soma dos números pares de 1 a 100 utilizando um laço de repetição. Utilize for.
 */
public class SemGPT_6 {

    public static void main(String[] args) {
        int soma = 0;
        int resultado = 0;
        for (int i = 0; i < 101; i++) {
            resultado = i % 2;
            if (resultado == 0) {
                soma += i;
            }
        }
        System.out.println("Essa é a soma dos números pares de 1 a 100: " + soma);
    }
}
