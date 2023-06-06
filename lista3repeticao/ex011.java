package lista3repeticao;

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N1, N2, divisor=1;
        System.out.println("Digite um número:");
    N1= scan.nextInt();
    System.out.println("Digite outro número:");
    N2= scan.nextInt();
    do {
    divisor++;
    } while ((N1%divisor==0) && (N2%divisor==0));
    System.out.println(divisor);
    scan.close();
    }
    
}
