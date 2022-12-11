package Exe05;

import org.jetbrains.annotations.NotNull;

public class Apolice {
    private String nome;
    private int idadeSegurado;
    private double valorPremio;

    public Apolice(String nome, int idadeSegurado, double valorPremio) {
        this.nome = nome;
        this.idadeSegurado = idadeSegurado;
        this.valorPremio = valorPremio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdadeSegurado() {
        return idadeSegurado;
    }

    public void setIdadeSegurado(int idadeSegurado) {
        this.idadeSegurado = idadeSegurado;
    }

    public double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }

    public void imprimir (){
        System.out.println("O nome do segurado = "+getNome()
                +" , a idade = "+getIdadeSegurado()
                +" , o valor do prêmio da apólice é de R$ "+String.format("%.2f",getValorPremio()));
    }
    public void calcularPremioApolice(){
        if(idadeSegurado >= 18 && idadeSegurado <= 25){
            valorPremio +=(valorPremio*20)/100;
        }else if (idadeSegurado > 25 && idadeSegurado <= 26){
            valorPremio+=(valorPremio*15)/100;
        }else if(idadeSegurado > 36){
            valorPremio+=(valorPremio*10)/100;
        }
    }

    public void oferecerDesconto (@NotNull String cidade){
        if (cidade.equals("Curitiba")){
            valorPremio -=(valorPremio*20)/100;
        }else if (cidade.equals("Rio de Janeiro")){
            valorPremio -=(valorPremio*15)/100;
        }else if (cidade.equals("São Paulo")){
            valorPremio -=(valorPremio*10)/100;
        }else if (cidade.equals("Belo Horizonte")){
            valorPremio -=(valorPremio*5)/100;
        }else{
            System.out.println("Essa cidade não contem desconto na apólice.");
        }
    }
}
