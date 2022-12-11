package Exe06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class RegistroTeste {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String nome = "Davi da Guarda";
        int matricula = 1533;
        double mensalidade = 400.00;

        RegistroAcademico registro1 = new RegistroAcademico(nome,matricula,mensalidade);
        String dataN = "10/06/2003";
        Date dataA = new Date();
        registro1.inicializaRegistro(nome, matricula, dataN,false,dataA);
        registro1.calcularMensalidade();

        System.out.println();

        registro1.mostrarRegistro();

        sc.close();
    }
}
