import java.util.*;

public class Ex6 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            numeros.add(rand.nextInt(100) + 1);
        }

        Collections.sort(numeros);
        System.out.println("Números ordenados: " + numeros);
    }
}
