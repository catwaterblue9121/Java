public class Main {
    public static void main(String[] args) {
        
        Automovel carro = new Automovel();
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setAno(2020);
        carro.setCor("Prata");
        carro.setNumeroPortas(4);
        carro.setMotor("2.0L");

        Moto moto = new Moto();
        moto.setMarca("Honda");
        moto.setModelo("CB500");
        moto.setAno(2019);
        moto.setCor("Vermelha");
        moto.setCilindrada(500);

        System.out.println("Carro:");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Número de portas: " + carro.getNumeroPortas());
        System.out.println("Motor: " + carro.getMotor());

        System.out.println();

        System.out.println("Moto:");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Cor: " + moto.getCor());
        System.out.println("Cilindrada: " + moto.getCilindrada() + " cc");
    }
}
