import semana.DiaDaSemana;

public class PrincipalSemana {
    public static void main(String[] args) {

        System.out.println("\nDias da semana:");
        for (DiaDaSemana dia : DiaDaSemana.values()) {
            System.out.println(dia);
        }
    }
}
