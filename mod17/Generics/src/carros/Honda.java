package carros;

public class Honda extends Car{

    public Honda(String nome, int anoFabricacao) {
        super("Honda", nome, anoFabricacao);
    }

    @Override
    public void informaSlogan() {
        System.out.println("The Power of Dreams!");
    }
}
