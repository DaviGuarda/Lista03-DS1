package Exe05;

import java.util.Locale;
import java.util.Scanner;

public class ApoliceTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        String name = "Davi da Guarda";
        int idade = 19;
        double premio = 450.50;

        Apolice apolice = new Apolice(name,idade,premio);
        System.out.println("Imprindo seus dados preenchidos:");
        apolice.imprimir();
        System.out.println();
        apolice.calcularPremioApolice();
        System.out.println("Imprindo seus dados com a apolice calculada:");
        apolice.imprimir();
        System.out.println();

        System.out.println("Cidades com desconto: ");
        System.out.println("Curitiba = 20%.");
        System.out.println("Rio de Janeiro = 15%.");
        System.out.println("São Paulo = 10%.");
        System.out.println("Belo Horizonte = 5%.");

        System.out.println();

        System.out.print("Digite sua cidade: ");
        String cidade = scanner.nextLine();
        apolice.oferecerDesconto(cidade);

        System.out.println("Imprimindo seus dados atualizados:");
        apolice.imprimir();

        scanner.close();
    }
}
