public class Revisao_23 {
    public static void main(String[] args) {
        
        int[] numeros = {12, 45, 3, 67, 29, 88, 15};

        int maiorNumero = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }

        System.out.println("O maior número no vetor é: " + maiorNumero);
    }
}
