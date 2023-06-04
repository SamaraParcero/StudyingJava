package lista1;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
		float Termo1, Termo2, Razao, Termosolicitado, Termototal;
		Scanner recebeste=new Scanner(System.in);
		System.out.println("Escreva o primeiro termo");
		Termo1 = recebeste.nextFloat();
		System.out.println("Escreva o segundo termo");
		Termo2 = recebeste.nextFloat();
		System.out.println("Escreva o termo desejado");
		Termosolicitado = recebeste.nextFloat();
		Razao = Termo2-Termo1;
		
		Termototal = Termo1 + (Termosolicitado-1)*Razao;
		System.out.println("Seu termo desejado tem o valor de " + Termototal);	
		recebeste.close();
	}

}
