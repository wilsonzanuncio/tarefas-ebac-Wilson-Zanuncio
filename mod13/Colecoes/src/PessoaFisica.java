public class PessoaFisica extends Pessoa{
    private String sobrenome;
    private String cpf;

    public PessoaFisica(String nome, String sobrenome, int idade, String cpf) {
        super(nome, idade);
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public void informarDados() {
        System.out.println(this.getNome() + " " + sobrenome
                + " tem " + this.getIdade() + " anos de idade e seu CPF é "
                + cpf + ".");
    }
}
