/*
Implementar uma classe Lampada que deve possuir como características tipo
(led, fluorescente,...), voltagem, cor, marca, preço, potência, status(boolean).
Nesta classe devem ser implementados os métodos construtores, getters, setters,
toString, ascender e apagar. Em uma outra classe chamada LampadaTeste devem ser
criados dois objetos do tipo Lampada, atribuir valores e exibir os dados deste objeto.
O programa deverá informar também qual das duas lâmpadas possui maior potência e
também qual das lâmpadas é a mais cara.
 */

package Exe04;

public class Lampada {
    private String tipo;
    private int voltagem;
    private String cor;
    private String marca;
    private double preco;
    private int potencia;
    private boolean status;

    public Lampada(){
    }

    public Lampada(String tipo, int voltagem, String cor, String marca, double preco, int potencia, boolean status) {
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
        this.potencia = potencia;
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void ascender(){
        System.out.println("Ascendendo lampada!");
    }

    public void apagando(){
        System.out.println("Apagando lampada!");
    }

    @Override
    public String toString() {
        return "Lampada, " +
                "tipo='" + tipo + '\'' +
                ", voltagem=" + voltagem +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", preco=" + String.format("%.2f",preco) +
                ", potencia=" + potencia +
                ", status=" + status;
    }
}
