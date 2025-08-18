import java.util.Scanner;

public class ObjetoComputador {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Computador c1 = new Computador();
            Computador c2 = new Computador();
            Computador c3 = new Computador();

            cadastrarComputador(sc, c1, 1);
            cadastrarComputador(sc, c2, 2);
            cadastrarComputador(sc, c3, 3);

            sc.close();
        }
    }

    public static void cadastrarComputador(Scanner sc, Computador computador, int numero) {
        System.out.println("\n--- CADASTRO DE COMPUTADOR " + numero + " ---");

        System.out.print("Digite o modelo do CPU: ");
        computador.setCpu(sc.nextLine());

        System.out.print("Digite o modelo da Placa Mãe: ");
        computador.setPlacaMae(sc.nextLine());

        System.out.print("Digite o modelo da Placa de Vídeo: ");
        computador.setPlacaDeVideo(sc.nextLine());

        System.out.print("Digite a quantidade de RAM (em GB): ");
        computador.setRam(sc.nextLine());

        System.out.print("Digite a capacidade de Armazenamento (em GB): ");
        computador.setArmazenamento(sc.nextLine());

        System.out.print("Digite a potência da Fonte (em W): ");
        computador.setFonte(sc.nextLine());

        System.out.print("Digite o modelo do Gabinete: ");
        computador.setGabinete(sc.nextLine());

        System.out.println("\n--- DADOS DO COMPUTADOR " + numero + " ---");
        System.out.println("CPU: " + computador.getCpu());
        System.out.println("Placa Mãe: " + computador.getPlacaMae());
        System.out.println("Placa de Vídeo: " + computador.getPlacaDeVideo());
        System.out.println("RAM: " + computador.getRam() + " GB");
        System.out.println("Armazenamento: " + computador.getArmazenamento() + " GB");
        System.out.println("Fonte: " + computador.getFonte() + " W");
        System.out.println("Gabinete: " + computador.getGabinete());
        System.out.println("\nCadastro " + numero + " realizado com sucesso!");
    }
}
