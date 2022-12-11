package Exe07;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String sobrenome) {
        super(nome, sobrenome);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
