package lista1;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
        int id, m, d, soma;
		System.out.println("Digite sua idade em anos");
		Scanner scan = new Scanner(System.in);
		id = scan.nextInt();
		System.out.println("Digite sua idade em meses");
		m = scan.nextInt();
		System.out.println("Digite sua idade em dias");
		d = scan.nextInt();
		soma = id*360 + m*30 + d;
		System.out.println("Você viveu por incríveis " + soma + "dias");
        scan.close();
    }

}