package lista3repeticao;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int numero, divisores;
        System.out.println("Digite um número");
        numero= scan.nextInt();
        for (divisores=1; numero%divisores==0; divisores++ ) {
             System.out.println("Divisores:");
             System.out.println(divisores);
             System.out.println("amigos");
        }
        scan.close();
     }

}
