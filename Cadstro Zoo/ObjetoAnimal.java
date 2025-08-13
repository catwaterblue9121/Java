//programa que tem que rodar...

import java.util.Scanner;

public class ObjetoAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome, especie;
        int idade;
        double peso;

        System.out.println("\n");
        System.out.println("   ---CADASTRO ZOO---");

        System.out.print("\nDigite o nome do animal: ");
        nome = scanner.nextLine();

        System.out.print("Digite a espécie do animal: ");
        especie = scanner.nextLine();

        System.out.print("Digite a idade do animal: ");
        idade = scanner.nextInt();

        System.out.print("Digite o peso do animal (em kg): ");
        peso = scanner.nextDouble();

        Animal animal = new Animal();

        animal.setNome(nome);
        animal.setEspecie(especie);
        animal.setIdade(idade);
        animal.setPeso(peso);

        System.out.println("\nAnimal cadastrado com sucesso!");
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Espécie: " + animal.getEspecie());
        System.out.println("Idade: " + animal.getIdade() + " anos");
        System.out.println("Peso: " + animal.getPeso() + " kg");
        System.out.println("\n");

        scanner.close();
    }
}