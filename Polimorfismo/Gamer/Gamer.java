public class Gamer implements InterfaceCompultador {
   
    @Override

    public void ligar(){
        System.out.println("Liga o pc...");
    }

    @Override

    public void carregandoSistema(){
        System.out.println("Espera...");
    }

    @Override

    public void reiniciar(){
        System.out.println("Reinicia...");
    }

    @Override
   
    public void desligar(){
        System.out.println("Desliga...");
    }
}