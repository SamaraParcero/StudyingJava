package lista3repeticao;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int numero, divisores;
        System.out.println("Digite um número");
        numero= scan.nextInt();
        for (divisores=1; divisores<=numero; divisores++ ) {
            if (numero%divisores==0)
             System.out.println(divisores);
            
        }
        scan.close();
     }
}
