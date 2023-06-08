package lista5;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String palavra;
		System.out.println("Digite uma palavra qualquer: ");
		palavra = scan.next();
		digitacao(palavra);
	}
	public static void digitacao(String palavra) {
		for (int c=0; c<palavra.length(); c++) {
			System.out.println(palavra.charAt(c));
		}
		
	}

}
