package lista2;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N1, N2, N3, N4, M;
		System.out.println("Digite sua primeira nota");
		N1 = scan.nextInt();
		System.out.println("Digite sua segunda nota");
		N2 = scan.nextInt();
		System.out.println("Digite sua terceira nota");
		N3 = scan.nextInt();
		System.out.println("Digite sua quarta nota");
		N4 = scan.nextInt();
		
		M = (N1+N2+N3+N4)/4;
		if (M>=7) {
			  System.out.println("Voce foi aprovado");
		} else 
		System.out.println("Você foi reprovado");
	    scan.close();

	}

}
