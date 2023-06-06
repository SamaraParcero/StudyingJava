package lista3repeticao;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int a;
         System.out.println("Digite um número");
         a = scan.nextInt();
    do {
         System.out.println("Digite um número entre 0 e 100");
         a=scan.nextInt(); 	
    } while ((a<0)||(a>100));
        System.out.println("Número correto");
        scan.close();
        }
}
