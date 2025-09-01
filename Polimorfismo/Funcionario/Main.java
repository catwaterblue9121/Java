public class Main {
    public static void main(String[] args) {
        Funcionario jornada = new Jornada(1, "João", "119999999", 101, "Rua A", 25.0, 160);
        Funcionario horista = new Horista(2, "Maria", "118888888", 102, "Rua B", 30.0, 120);
        Funcionario pj = new PessoaJuridica(3, "Empresa X", "113333333", 103, "Rua C", 10000.0, 1500.0);

        jornada.calculaSalario();
        horista.calculaSalario();
        pj.calculaSalario();
    }
}