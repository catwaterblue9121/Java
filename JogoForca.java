
import java.util.ArrayList;
import java.util.Scanner;

public class JogoForca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        String word;
        int tentativas;
        System.out.print("Escreva a palavra: ");
        word = scanner.nextLine().toLowerCase();
        System.out.print("Escreva o nome do adivinhador: ");
        nome = scanner.nextLine();

        ArrayList<Character> wordState = new ArrayList<Character>();
        int erros = 0;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("*************************");
        System.out.println("Bem vindo(a) a forca!");
        System.out.println("*************************");

        while (erros < 5) {
            System.out.print(getHangmanArt(erros));
            System.out.print("Palavra: ");
            for (char c : wordState) {
                System.out.print(c + " ");
            }

            System.out.println();

            System.out.print("Chute uma letra: ");
            char escolha = scanner.next().toLowerCase().charAt(0);
            System.out.print(escolha);

            if (word.indexOf(escolha) >= 0) {
                System.out.println(" Letra correta! :)\n");

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == escolha) {
                        wordState.set(i, escolha);
                    }
                }
                if (!wordState.contains('_')) {
                    System.out.print(getHangmanArt(erros));
                    System.out.println(nome + " ganhou!");
                    break;
                }
            } else {
                System.out.println(" Letra incorreta! :(\n");
                erros++;
            }
        }
        if (erros >= 6) {
            System.out.print(getHangmanArt(erros));
            System.out.println("GAME OVER!");
            System.out.println("A palavra era: " + word);
        }
        scanner.close();

    }

    static String getHangmanArt(int erros) {
        return switch (erros) {
            case 0 ->
                """
                               _____
                               |   |
                               |   O
                               |  -|-
                               |  / \\
                               |   
                             __|__ 
                    """;

            case 1 ->
                """
                        _____
                        |   |
                        |   O
                        |  -|
                        |  / \\
                        |   
                      __|__ 
             """;

            case 2 ->
                """
                _____
                |   |
                |   O
                |   |
                |  / \\
                |   
              __|__ 
     """;

            case 3 ->
                """
        _____
        |   |
        |   O
        |   |
        |  / 
        |   
      __|__ 
""";

            case 4 ->
                """
    _____
    |   |
    |   O
    |   |
    |  
    |   
  __|__ 
""";

            case 5 ->
                """
    _____
    |   |
    |   O
    |   
    |  
    |   
  __|__ 
""";

            case 6 ->
                """
    _____
    |   |
    |   
    |   
    |  
    |   
  __|__ 
""";

            default ->
                "";
        };
    }
}
