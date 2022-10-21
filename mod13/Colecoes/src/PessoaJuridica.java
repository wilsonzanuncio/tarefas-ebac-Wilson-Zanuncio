public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, int idade, String cnpj) {
        super(nome, idade);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public void informarDados() {
        System.out.println("A empresa " + this.getNome() + " tem " + this.getIdade()
                + " anos de funcionamento e seu CNPJ é " + cnpj + ".");
    }
}
