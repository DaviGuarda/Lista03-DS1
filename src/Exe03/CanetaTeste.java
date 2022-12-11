package Exe03;

import java.util.Locale;

public class CanetaTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Caneta c1 = new Caneta("bic","rosa",30.0);
        System.out.println(c1);
    }
}
