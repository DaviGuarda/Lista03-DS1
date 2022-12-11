package Exe07;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, String sobrenome) {
        super(nome, sobrenome);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
