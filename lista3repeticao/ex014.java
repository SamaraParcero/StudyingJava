package lista3repeticao;

import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Np, divisores;
		System.out.println("Digite um número");
		Np= scan.nextInt();
		for (divisores=1; Np%divisores==0; divisores++);
        if (divisores==2) {
	    System.out.println(Np + " é primo");
        } else {
	    System.out.println( Np + " não é primo");
        scan.close();
        } 
      }
     
	}


