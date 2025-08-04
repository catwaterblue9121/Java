import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um nome: ");
            nomes.add(sc.nextLine());
        }

        Collections.reverse(nomes);
        for (String nome : nomes) {
            System.out.println("\n"+nome);
        }
    }
}
