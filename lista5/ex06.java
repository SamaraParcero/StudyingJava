package lista5;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome, nome2;
		System.out.println("Digite uma palavra qualquer: ");
		nome = scan.next();
		System.out.println("digite a substring");
		nome2= scan.next();
palavra(nome, nome2 );
System.out.println(palavra(nome, nome2));
	scan.close();
}
	public static String palavra(String nome, String sbt) {
		String nome2;
		int a, b;
		a=nome.indexOf(sbt);
		b=a+sbt.length();
		nome2 = nome.substring(0, a)+ nome.substring(b, nome.length());
	 return nome2;
	}
}
