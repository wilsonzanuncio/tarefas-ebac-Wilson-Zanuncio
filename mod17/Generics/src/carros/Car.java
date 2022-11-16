package carros;

public abstract class Car {
    private String marca;
    private String nome;
    private int anoFabricacao;

    public Car(String marca, String nome, int anoFabricacao) {
        this.marca = marca;
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public abstract void informaSlogan();

    public void informaDados() {
        System.out.println("Veículo: " + nome + " - Marca: " + marca + " - Ano de fabricação: " + anoFabricacao);
    }
}
