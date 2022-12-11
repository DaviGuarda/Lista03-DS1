package Exe02;

public class Exercicio02 {
    public static void main(String[] args) {
        int dia = 31;
        int mes = 12;
        int ano = 2004;
        Data data = new Data(dia,mes,ano);

        boolean validar = data.validarData(dia,mes,ano);

        if(validar){
            System.out.println();
            data.stringConverter();
            System.out.println(data);
        }else{
            System.out.println("Valor(es) passado para a data são incorreto(s).");
        }

    }
}
