package lista5;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		System.out.println("Digite dois números inteiros");
       a = scan.nextInt();
       b= scan.nextInt();
      System.out.println( mmc(a, b));
      scan.close();
	}
	public static int mmc(int a, int b) {
	int c=b;
	while ((c%a!=0) || (c%b!=0)) {
		c++;
	}
		return c;
	}
    
}
