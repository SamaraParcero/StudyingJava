package lista5;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String palavra;
		System.out.println("Digite uma palavra qualquer: ");
		palavra = scan.next();
		digitacao(palavra);
		scan.close();
	}
	public static void digitacao(String palavra) {
			int a=0;
			for (int c=0; c<palavra.length(); c++) {
			 if (palavra.charAt(c)=='a') {
				a++;
		
	 }
}
			System.out.println("A quantidade de as é: " +a);
}

}
