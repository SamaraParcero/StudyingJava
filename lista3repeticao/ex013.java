package lista3repeticao;

import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Numero, contador=1;
		System.out.println("Digite um número");
		Numero= scan.nextInt();
		do {
			contador++;
		 contador= Numero*contador;
		} while (contador<Numero);
        System.out.println(contador);
        scan.close();
	}
}
