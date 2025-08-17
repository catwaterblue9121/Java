import java.util.Scanner;

public class ObjetoPaciente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Paciente p1 = new Paciente();

        System.out.println("\n--- CADASTRO DE PACIENTE ---");

        System.out.print("Digite o nome: ");
        p1.setNome(sc.nextLine());

        System.out.print("Digite o endereço: ");
        p1.setEndereco(sc.nextLine());

        System.out.print("Digite o email: ");
        p1.setEmail(sc.nextLine());

        System.out.print("Digite o nível de escolaridade: ");
        p1.setNivelDeEscolaridade(sc.nextLine());

        System.out.print("Digite o CPF (números): ");
        p1.setCpf(sc.nextInt());

        System.out.print("Digite o telefone (números): ");
        p1.setTelefone(sc.nextInt());

        System.out.print("Digite a data de nascimento (ano, mes e dia): ");
        p1.setDataDeNascimento(sc.nextInt());

        System.out.print("Digite o sexo (M/F): ");
        p1.setSexo(sc.next().charAt(0));

        System.out.println("\n--- DADOS DO PACIENTE CADASTRADO ---");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Endereço: " + p1.getEndereco());
        System.out.println("Email: " + p1.getEmail());
        System.out.println("Escolaridade: " + p1.getNivelDeEscolaridade());
        System.out.println("CPF: " + p1.getCpf());
        System.out.println("Telefone: " + p1.getTelefone());
        System.out.println("Data de Nascimento: " + p1.getDataDeNascimento());
        System.out.println("Sexo: " + p1.getSexo());
        System.out.println("\nCadastro realizado com sucesso!");

        sc.close();
    }
}
