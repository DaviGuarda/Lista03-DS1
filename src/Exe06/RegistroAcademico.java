package Exe06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistroAcademico {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String nomeDoAluno;
    private int numeroDaMatricula;
    private String dataDeNascimento;
    private boolean eBolsista;
    private String anoDeMatricula;
    private double mensalidade;

    public RegistroAcademico(String nomeDoAluno, int numeroDaMatricula, double mensalidade) {
        this.nomeDoAluno = nomeDoAluno;
        this.numeroDaMatricula = numeroDaMatricula;
        this.mensalidade = mensalidade;
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public int getNumeroDaMatricula() {
        return numeroDaMatricula;
    }

    public void setNumeroDaMatricula(int numeroDaMatricula) {
        this.numeroDaMatricula = numeroDaMatricula;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public boolean iseBolsista() {
        return eBolsista;
    }

    public void seteBolsista(boolean eBolsista) {
        this.eBolsista = eBolsista;
    }

    public String getAnoDeMatricula() {
        return anoDeMatricula;
    }

    public void setAnoDeMatricula(String anoDeMatricula) {
        this.anoDeMatricula = anoDeMatricula;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public void inicializaRegistro(String nome,int matricula,String dataNasc,boolean bolsa,Date anoMatric) throws ParseException {
        System.out.println("Cadastro inicializado:");
        System.out.println();
        System.out.println(this.nomeDoAluno = nome);
        System.out.println(this.numeroDaMatricula = matricula);
        this.dataDeNascimento = dataNasc;
        System.out.println(this.dataDeNascimento);
        System.out.println("É bolsista: true = (sim), false = (não): "+bolsa);
        this.anoDeMatricula = sdf.format(anoMatric);
        System.out.println(this.anoDeMatricula);
    }

    public void calcularMensalidade(){
        if(eBolsista){
            mensalidade -= (mensalidade*50)/100;
        }
    }
    public void mostrarRegistro(){
        System.out.println("Seu registro completo:");
        System.out.println();
        System.out.println("Nome: "+nomeDoAluno);
        System.out.println("Número da matricula: "+numeroDaMatricula);
        System.out.println("Data de nascimento: "+dataDeNascimento);
        System.out.println("Bolsa: "+eBolsista);
        System.out.println("Ano da matricula: "+anoDeMatricula);
        System.out.println("Sua mensalidade: "+mensalidade);
    }

}
