public class Automovel {
    private int velocidade;
    private String cor;
    private String nome;

    public Automovel(int velocidade, String cor, String nome) {
        this.velocidade = velocidade;
        this.cor = cor;
        this.nome = nome;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirInfo() {
        System.out.println("Carro: " + nome + ", Cor: " + cor + ", Velocidade: " + velocidade + " km/h");
    }
}
