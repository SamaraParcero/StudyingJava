package lista3repeticao;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, cont;
		num = scan.nextInt();
		cont = 1;
		while (cont<=num) {
			System.out.println(cont);
		       cont = cont+1;
		       
		}
       scan.close();
	}

}
