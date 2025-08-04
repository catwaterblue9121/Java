import java.util.*;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> produtos = new ArrayList<>();
        List<Double> precos = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Produto: ");
            produtos.add(sc.nextLine());
            System.out.print("Preço: ");
            precos.add(sc.nextDouble());
            sc.nextLine(); // limpar buffer
        }

        System.out.println("Produtos com preço acima de R$ 50,00:");
        for (int i = 0; i < produtos.size(); i++) {
            if (precos.get(i) > 50.0) {
                System.out.println(produtos.get(i) + " - R$" + precos.get(i));
            }
        }
    }
}
