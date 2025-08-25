public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("\nCarlos", 30, "Engenheiro");
        Automovel carro1 = new Automovel(220, "Vermelho", "Ferrari");
        pessoa1.comprarCarro(carro1);
        pessoa1.exibirInfo();
    }
}
