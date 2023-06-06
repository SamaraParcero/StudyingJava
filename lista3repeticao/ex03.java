package lista3repeticao;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int NP, NA, NA2;
		System.out.println("Digite um número inteiro");
		NP = scan.nextInt();
		System.out.println("Digite outros dois números");
		NA = scan.nextInt();
		NA2 = scan.nextInt();
        while (NP!=NA+NA2) {
        	System.out.println("Números errados, digite outros 2");
        	NA = NA2;
        	NA2= scan.nextInt();
        	 }
        System.out.println("Números certos. FIM!");
        scan.close();
	}

}
