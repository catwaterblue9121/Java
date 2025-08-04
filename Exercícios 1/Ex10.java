import java.util.*;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> tarefas = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Listar tarefas");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa: ");
                    tarefas.add(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Digite o nome da tarefa para remover: ");
                    String nome = sc.nextLine();
                    if (tarefas.remove(nome)) {
                        System.out.println("Tarefa removida.");
                    } else {
                        System.out.println("Tarefa não encontrada.");
                    }
                    break;
                case 3:
                    System.out.println("Tarefas atuais:");
                    for (String t : tarefas) {
                        System.out.println("- " + t);
                    }
                    break;
                case 0:
                    System.out.println("Encerrando.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
