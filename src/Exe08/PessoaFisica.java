package Exe08;

public class PessoaFisica extends Cliente{
    private String cpf;

    public PessoaFisica(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void imprimirDados(){
        System.out.println(getNome());
        System.out.println(getEndereco());
        System.out.println(getTelefone());
        System.out.println(getCpf());
    }

}
