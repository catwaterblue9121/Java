import java.util.*;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> palavras = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Palavra: ");
            palavras.add(sc.nextLine());
        }

        palavras.removeIf(p -> p.length() < 4);

        System.out.println("Palavras com 4 ou mais letras:");
        for (String p : palavras) {
            System.out.println(p);
        }
    }
}
