import java.util.Scanner;

public class ObjetoCadeira {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Cadeira c1 = new Cadeira();
            Cadeira c2 = new Cadeira();
            Cadeira c3 = new Cadeira();

            cadastrarCadeira(sc, c1, 1);
            cadastrarCadeira(sc, c2, 2);
            cadastrarCadeira(sc, c3, 3);

            sc.close();
        }
    }

    public static void cadastrarCadeira(Scanner sc, Cadeira cadeira, int numero) {
        System.out.println("\n--- CADASTRO DE CADEIRA " + numero + " ---");

        System.out.print("Digite o tipo: ");
        cadeira.setTipo(sc.nextLine());

        System.out.print("Digite a cor: ");
        cadeira.setCor(sc.nextLine());

        System.out.print("Apoiadores? : ");
        cadeira.setApoiadores(sc.nextLine());

        System.out.print("Almofada? : ");
        cadeira.setAlmofada(sc.nextLine());

        System.out.println("\n--- DADOS ---");
        System.out.println("Tipo: " + cadeira.getTipo());
        System.out.println("Cor: " + cadeira.getCor());
        System.out.println("Apoiadores: " + cadeira.getApoiadores());
        System.out.println("Almofada: " + cadeira.getAlmofada());
        System.out.println("\nCadastro " + numero + " realizado com sucesso!");
    }
}
