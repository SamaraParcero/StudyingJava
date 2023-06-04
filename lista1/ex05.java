package lista1;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
		float Salario, Vezesminimo;
		System.out.println("Digite o valor do seu salario");
		Scanner Recebe = new Scanner(System.in);
		Salario = Recebe.nextFloat();
		Vezesminimo = Salario/1320;
		System.out.println("Seu salario equivale a " + Vezesminimo + " salarios minimos");
		Recebe.close();
	}

}
