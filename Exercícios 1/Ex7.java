import java.util.*;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite números (-1 para encerrar):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;
            numeros.add(num);
        }

        if (!numeros.isEmpty()) {
            int maior = Collections.max(numeros);
            int menor = Collections.min(numeros);
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        } else {
            System.out.println("Nenhum número foi inserido.");
        }
    }
}
