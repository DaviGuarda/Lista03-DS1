package Exe01;
/*Escreva um programa que retorne o número do quadrante (1,2,3 ou 4)
através de um método chamado VERIFICA_QUADRANTE, que deve receber
um valor para x e um valor para y.
 */
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long x,y;

            System.out.print("Digite o valor para x: ");
            x = sc.nextLong();
            System.out.print("Digite o valor para y: ");
            y = sc.nextLong();

            verficaQuadrante(x,y);


        sc.close();
    }
    public static void verficaQuadrante(Long x, Long y){
        if(x != 0 && y != 0){
            if(x > 0 && y > 0){
                System.out.println("Primeiro Quadrante!");
            }else if(x < 0 && y > 0){
                System.out.println("Segundo Quadrante!");
            }else if(x < 0 && y < 0){
                System.out.println("Terceiro Quadrante!");
            }else{
                System.out.println("Quarto Quadrante!");
            }
        }
    }
}
