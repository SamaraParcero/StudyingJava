package lista3repeticao;

import java.util.Scanner;

public class ex04 {
   
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Num, impar, par, soma, somaimpar, media;
		System.out.println("Digite 1 número");
		Num = scan.nextInt();
		impar = 0;
		par = 0;
		do {
	    if (Num%2==0) {
	    	par = par +1;
	       soma = soma + Num;
	    } else 
	    	impar = impar + 1;
	        somaimpar = somaimpar + Num;
		} while (par!=10);
	    	Num = scan.nextInt();
	    	
	    
		System.out.println(soma);
        scan.close();
        }
}


