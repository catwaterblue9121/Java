import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList());
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        for (int num : numeros) {
            System.out.println(num * 2);
        }
    }
}
