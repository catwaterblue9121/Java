import java.util.*;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();

        System.out.println("Digite as notas dos alunos (use -1 para encerrar):");
        while (true) {
            double nota = sc.nextDouble();
            if (nota == -1) break;
            notas.add(nota);
        }

        double soma = 0;
        for (double n : notas) {
            soma += n;
        }

        double media = soma / notas.size();
        System.out.println("\nMédia: " + media);

        long acimaMedia = notas.stream().filter(n -> n > media).count();
        System.out.println("Notas acima da média: " + acimaMedia);
    }
}
