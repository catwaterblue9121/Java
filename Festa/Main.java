public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Maria Oliveira", "99999-1234", "111.222.333-44", "MG-12.345.678");
        Endereco endereco = new Endereco(1L, "Rua do Alecrim", 100, "Casa", "Jardim", "Campinas", "13000-000", "SP");
        Tema tema = new Tema(1L, "Unicórnio", 650.00, "Rosa");

        ItemTema item1 = new ItemTema(1L, "Painel", "Painel grande de unicórnio com brilho");
        ItemTema item2 = new ItemTema(2L, "Balões", "Balões rosa e lilás em arco");
        ItemTema item3 = new ItemTema(3L, "Toalha de Mesa", "Toalha personalizada com estampa de unicórnio");

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Endereço: " + endereco.getCidade());
        System.out.println("Tema: " + tema.getNome() + " - R$ " + tema.getValorAluguel());
        System.out.println("Itens inclusos:");
        System.out.println("- " + item1.getNome() + ": " + item1.getDescricao());
        System.out.println("- " + item2.getNome() + ": " + item2.getDescricao());
        System.out.println("- " + item3.getNome() + ": " + item3.getDescricao());
    }
}
