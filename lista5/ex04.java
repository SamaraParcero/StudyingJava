package lista5;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String palavra;
		System.out.println("Digite uma palavra qualquer: ");
		palavra = scan.next();
		digitacao(palavra);
		scan.close();
	}
	public static void digitacao(String palavra) {
		for (int c=0; c<palavra.length(); c++) {
		for (int l=0; l<=c; l++) {
			System.out.print(palavra.charAt(l));
		}
		}
		System.out.println();
		
	}
}
