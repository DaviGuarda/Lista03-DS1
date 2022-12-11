package Exe08;

public class PessoaJuridica extends Cliente{
    private String cnpj;
    private String eFantasia;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String eFantasia) {
        super(nome,endereco,telefone);
        this.cnpj = cnpj;
        this.eFantasia = eFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String geteFantasia() {
        return eFantasia;
    }

    public void seteFantasia(String eFantasia) {
        this.eFantasia = eFantasia;
    }
    public void imprimirDados(){
        System.out.println(getNome());
        System.out.println(getEndereco());
        System.out.println(getTelefone());
        System.out.println(getCnpj());
        System.out.println(geteFantasia());
    }
}
