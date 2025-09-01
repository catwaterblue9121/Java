package InterfaceAnimal;

public class Main {
    public static void main(String[] args) {
        Animal lobo = new Lobo();

        lobo.dormir();
        lobo.caminhar();
        lobo.correr();
        lobo.emitirSom();
    }
}
