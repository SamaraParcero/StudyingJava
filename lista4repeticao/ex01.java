package lista4repeticao;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, divisor=0, cont=0;
		System.out.println("Digite um número inteiro");
		num = scan.nextInt();
	
		 
		while (divisor<num) {
			divisor++;
			if (num%divisor==0) {
				cont++;
			}
		  
		}
		if (cont==2) {
			System.out.println("é primo");
		} else {
			System.out.println("Não é primo");
		}
	  scan.close();
	}
}
