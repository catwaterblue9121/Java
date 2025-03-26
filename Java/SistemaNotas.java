import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler a entrada do usuário
        Scanner ler = new Scanner(System.in);

        // Pedindo o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = ler.nextLine();

        // Pedindo as 3 notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = ler.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = ler.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = ler.nextDouble();

        // Calculando a soma e a média
        double soma = nota1 + nota2 + nota3;
        double media = soma / 3;

        // Exibindo os resultados
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Soma das notas: " + soma);
        System.out.println("Média das notas: " + media);

        // Verificando se o aluno foi aprovado ou precisa estudar mais
        if (media >= 5) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno, você precisa estudar mais!");
        }

        // Fechando o scanner
        ler.close();
    }
}
