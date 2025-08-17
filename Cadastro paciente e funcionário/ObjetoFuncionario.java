import java.util.Scanner;

public class ObjetoFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario f1 = new Funcionario();

        System.out.println("\n--- CADASTRO DE FUNCIONÁRIO ---");

        System.out.print("Digite o nome: ");
        f1.setNome(sc.nextLine());

        System.out.print("Digite o endereço: ");
        f1.setEndereco(sc.nextLine());

        System.out.print("Digite o email: ");
        f1.setEmail(sc.nextLine());

        System.out.print("Digite o nível de escolaridade: ");
        f1.setNivelDeEscolaridade(sc.nextLine());

        System.out.print("Digite o cargo: ");
        f1.setCargo(sc.nextLine());

        System.out.print("Digite o CPF (números): ");
        f1.setCpf(sc.nextInt());

        System.out.print("Digite o telefone (números): ");
        f1.setTelefone(sc.nextInt());

        System.out.print("Digite a data de admissão (ano, mes e dia): ");
        f1.setDataDeAdmissao(sc.nextInt());

        System.out.print("Digite a data de demissão (ou 0 se não foi demitido): ");
        f1.setDataDeDemissao(sc.nextInt());

        System.out.print("Digite o sexo (M/F): ");
        f1.setSexo(sc.next().charAt(0));

        System.out.println("\n--- DADOS DO FUNCIONÁRIO CADASTRADO ---");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Endereço: " + f1.getEndereco());
        System.out.println("Email: " + f1.getEmail());
        System.out.println("Escolaridade: " + f1.getNivelDeEscolaridade());
        System.out.println("Cargo: " + f1.getCargo());
        System.out.println("CPF: " + f1.cpf());
        System.out.println("Telefone: " + f1.getTelefone());
        System.out.println("Data de Admissão: " + f1.getDataDeAdmissao());
        System.out.println("Data de Demissão: " + f1.getDataDeDemissao());
        System.out.println("Sexo: " + f1.getSexo());
        System.out.println("\nCadastro realizado com sucesso!");

        sc.close();
    }
}
