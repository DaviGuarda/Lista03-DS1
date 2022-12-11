package Exe04;

import java.util.Locale;

public class LampadaTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Lampada lampada1 = new Lampada(
                "led",
                110,
                "blue",
                "philips",
                200.00,
                20,
                true);
        Lampada lampada2 = new Lampada(
                "led",
                220,
                "pink",
                "philips",
                300.00,
                30,
                true);

        System.out.println(lampada1);
        System.out.println();
        System.out.println(lampada2);
        System.out.println();

        if(lampada1.getPotencia() > lampada2.getPotencia()){
            System.out.println("A potencia da primeira lampada é maior que a da segunda.");
        }else{
            System.out.println("A potencia da segunda lampada é maior que a da primeira.");
        }
        System.out.println();

        if(lampada1.getPreco() > lampada2.getPreco()){
            System.out.println("O preço da primeira lampada é maior que a da segunda.");
        }else{
            System.out.println("O preço da segunda lampada é maior que a da primeira.");
        }

    }

}
