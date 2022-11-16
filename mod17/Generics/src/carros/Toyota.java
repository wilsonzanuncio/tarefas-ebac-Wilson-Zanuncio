package carros;

public class Toyota extends Car{

    public Toyota(String nome, int anoFabricacao) {
        super("Toyota", nome, anoFabricacao);
    }

    @Override
    public void informaSlogan() {
        System.out.println("Always a Better Way!");
    }
}
