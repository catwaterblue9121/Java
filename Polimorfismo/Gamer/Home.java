public class Home implements InterfaceCompultador {
   
   

    @Override

    public void ligar(){
        System.out.println("Ligando...");
    }

    @Override

    public void carregandoSistema(){
        System.out.println("Carregando...");
    }

    @Override

    public void reiniciar(){
        System.out.println("Reiniciando...");
    }

    @Override
   
    public void desligar(){
        System.out.println("Desligando...");
    }
}