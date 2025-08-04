import java.util.*;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        String[] palavras = frase.split("\\s+");

        List<String> listaPalavras = Arrays.asList(palavras);
        System.out.println("Total de palavras: " + listaPalavras.size());

        System.out.println("Palavras que começam com 'A':");
        for (String palavra : listaPalavras) {
            if (palavra.toUpperCase().startsWith("A")) {
                System.out.println(palavra);
            }
        }
    }
}
