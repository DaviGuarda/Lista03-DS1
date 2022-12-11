/*
Implementar uma classe Data que deve possuir como características os atributos dia, mês
 e ano (todas do tipo inteiro). Nesta classe, além dos métodos construtores, getters,
 setters e toString, deverá ser implementado o método validarData (int, int, int): boolean
 que deverá verificar se as informações passadas por parâmetros é verdadeira ou não.
 Este método deverá inclusive verificar se é ano bissexto. O método toString deverá retornar
 uma string no seguinte formato “dia/mês/ano”, como por exemplo “17 de novembro de 2022”.
 */
package Exe02;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    private String converteMes;

    public Data(){
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getConverteMes() {
        return converteMes;
    }

    public void setConverteMes(String converteMes) {
        this.converteMes = converteMes;
    }

    public boolean validarData(int validarDia, int validarMes, int validarAno) {
        boolean validoDia = false;
        boolean validoMes;
        boolean validoAno;
        boolean result = false;
        if (ano % 4 == 0) {
            System.out.println(ano + " é um ano bissexto");
            if (validarMes > 0 && validarMes <= 12) {
                this.mes = validarMes;
                validoMes = true;
            } else {
                validoMes = false;
                this.mes = 0;
            }

            if (validarMes == 2) {
                if (validarDia > 0 && validarDia <= 29) {
                    this.dia = validarDia;
                    validoDia = true;
                }else{
                    validoDia = false;
                    this.dia = 0;
                }
            } else if (validarMes == 4 || validarMes == 6 || validarMes == 9 || validarMes == 11) {
                if (validarDia > 0 && validarDia <= 30) {
                    this.dia = validarDia;
                    validoDia = true;
                }else{
                    validoDia = false;
                    this.dia = 0;
                }
            } else if (validarMes == 1 || validarMes == 3 || validarMes == 5 || validarMes == 7 || validarMes == 10 || validarMes == 12) {
                if (validarDia > 0 && validarDia <= 31) {
                    this.dia = validarDia;
                    validoDia = true;
                }
                else{
                    validoDia = false;
                    this.dia = 0;
                }
            }
        }else{
            if (validarMes > 0 && validarMes <= 12) {
                this.mes = validarMes;
                validoMes = true;
            } else {
                validoMes = false;
                this.mes = 0;
            }

            if (validarMes == 2) {
                if (validarDia > 0 && validarDia <= 28) {
                    this.dia = validarDia;
                    validoDia = true;
                }else{
                    validoDia = false;
                    this.dia = 0;
                }
            } else if (validarMes == 4 || validarMes == 6 || validarMes == 9 || validarMes == 11) {
                if (validarDia > 0 && validarDia <= 30) {
                    this.dia = validarDia;
                    validoDia = true;
                }else{
                    validoDia = false;
                    this.dia = 0;
                }
            } else if (validarMes == 1 || validarMes == 3 || validarMes == 5 || validarMes == 7 || validarMes == 10 || validarMes == 12) {
                if (validarDia > 0 && validarDia <= 31) {
                    this.dia = validarDia;
                    validoDia = true;
                }else{
                    validoDia = false;
                    this.dia = 0;
                }
            }
        }

        if(validarAno > 0){
            this.ano = validarAno;
            validoAno = true;
        }else{
            this.ano = 0;
            validoAno = false;
        }

        if(validoDia && validoMes && validoAno){
            result = true;
        }


        return result;
    }

    public void stringConverter(){
        if(mes == 1){
            this.converteMes = "janeiro";
        } else if(mes == 2){
            this.converteMes = "fevereiro";
        } else if(mes == 3){
            this.converteMes = "março";
        } else if (mes == 4) {
            this.converteMes = "abril";
        } else if (mes == 5) {
            this.converteMes = "maio";
        } else if (mes == 6) {
            this.converteMes = "junho";
        } else if (mes == 7) {
            this.converteMes = "julho";
        } else if (mes == 8) {
            this.converteMes = "agosto";
        } else if (mes == 9) {
            this.converteMes = "setembro";
        } else if (mes == 10) {
            this.converteMes = "outubro";
        } else if (mes == 11) {
            this.converteMes = "novembro";
        }else if(mes == 12){
            this.converteMes = "dezembro";
        }else{
            this.converteMes = "inexistente";
        }
    }

    @Override
    public String toString() {
        return dia
                +" de "
                +converteMes
                +" de "
                +ano;
    }
}
