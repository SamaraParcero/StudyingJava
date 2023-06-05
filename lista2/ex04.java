package lista2;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		float NA, NB, D;
		System.out.println("Digite um número");
		NA = scan.nextFloat();
		System.out.println("Digite outro número");
        NB = scan.nextFloat();
        D=NA%NB;
        if (D==0) {
        	System.out.println(NA + " é divisível por " + NB);
        } else { 
        	System.out.println(NA + " não é divisível por " + NB);
        }
        scan.close();
	}

}
