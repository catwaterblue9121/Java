public class Jornada extends Funcionario {
    private double salarioHora;
    private int horasTrabalhadas;

    public Jornada(long id, String nome, String telefone, int matricula, String endereco,
                   double salarioHora, int horasTrabalhadas) {
        super(id, nome, telefone, matricula, endereco);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public void calculaSalario() {
        double salario = salarioHora * horasTrabalhadas;
        System.out.println("Salário Jornada: R$ " + salario);
    }
}