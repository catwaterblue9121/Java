import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> pares = new ArrayList<>();

        for (int i = 2; pares.size() < 20; i += 2) {
            pares.add(i);
        }

        pares.removeIf(n -> n % 4 == 0);

        for (int n : pares) {
            System.out.println(n);
        }
    }
}
