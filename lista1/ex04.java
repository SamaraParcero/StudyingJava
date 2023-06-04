package lista1;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        double Valor, Gorjeta, Valortotal;
		Scanner Receba = new Scanner(System.in);
		System.out.println("Digite o valor gasto no restaurante");
		Valor = Receba.nextDouble();
		Gorjeta = Valor*0.1;
		Valortotal = Gorjeta + Valor;
		System.out.println("O valor total a se pagar: " + Valortotal );
        Receba.close();
	}

}
