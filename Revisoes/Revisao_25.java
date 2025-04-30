public class Reviso_25 {
    public static void main(String[] args) {
       
        int[] numeros = {10, 20, 30, 40, 50, 60};

        System.out.print("Vetor original: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        int[] vetorInvertido = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            vetorInvertido[i] = numeros[numeros.length - 1 - i];
        }

        System.out.print("\nVetor invertido: ");
        for (int i = 0; i < vetorInvertido.length; i++) {
            System.out.print(vetorInvertido[i] + " ");
        }
    }
}
