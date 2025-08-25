public class Pessoa {
    private String nome;
    private int idade;
    private String profissao;
    private Automovel automovel;

    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public void comprarCarro(Automovel automovel) {
        this.automovel = automovel;
        System.out.println(nome + " comprou um carro: " + automovel.getNome());
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Profissão: " + profissao);
        if (automovel != null) {
            automovel.exibirInfo();
        } else {
            System.out.println(nome + " ainda não tem carro.");
        }
    }
}
