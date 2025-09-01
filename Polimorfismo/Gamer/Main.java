public class Main {
    public static void main(String[] args) {
       
        Gamer gamer = new Gamer();

        Home home = new Home();

        gamer.ligar();
        home.carregandoSistema();
        gamer.carregandoSistema();
        gamer.desligar();
        home.desligar();
        gamer.ligar();
        home.carregandoSistema();
        gamer.carregandoSistema();
        gamer.desligar();
        home.desligar();
    }
}