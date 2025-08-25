import mes.Mes;

public class Principal {
    public static void main(String[] args) {

        System.out.println("\nMeses do ano:");
        for (Mes mes : Mes.values()) {
            System.out.println(mes);
        }
    }
}
