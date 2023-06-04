package lista1;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
		float N1, N2, N3, P1, P2, P3 ,Media;
		Scanner Notas=new Scanner(System.in);
		System.out.println("Digite sua primeira nota");
		N1 = Notas.nextFloat();
		System.out.println("Digite o peso dessa nota");
		P1 = Notas.nextFloat();
		System.out.println("Digite sua segunda nota");
		N2 = Notas.nextFloat();
		System.out.println("Digite o peso dessa nota");
		P2 = Notas.nextFloat();
		System.out.println("Digite sua terceira nota");
		N3 = Notas.nextFloat();
		System.out.println("Digite o peso dessa nota");
		P3 = Notas.nextFloat();
		Media = ((N1*P1)+(N2*P2)+(N3*P3))/(P1+P2+P3);
		System.out.println("Sua media ponderada: " + Media);
        Notas.close();
	}

}
