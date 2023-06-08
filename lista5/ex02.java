package lista5;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r, n;
		System.out.println("Gostaria de ver a tabuada?");
		r = scan.nextInt();
		while (r==1) {
			System.out.println("Qual tabuada?");
			n= scan.nextInt();
			tabuada(n);
           System.out.println("Gostaria de ver uma tabuada?");
           n= scan.nextInt();
		}
        scan.close();
	}
	public static void tabuada(int n) {
		int i;
		for (i=0; i<=10; i++) {
			System.out.println(n + "x" +i+ "  = "+n*1);
		}
	}
}
