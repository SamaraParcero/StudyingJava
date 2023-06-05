package lista2;

import java.util.Scanner; 

public class ex02 {
    
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		float N1, N2, N3, P1, P2, P3, MP;
		System.out.println("Digite sua primeira nota");
		N1 = scan.nextFloat();
		System.out.println("Digite o peso dessa nota");
		P1 = scan.nextFloat();
		System.out.println("Digite sua segunda nota");
		N2 = scan.nextFloat();
		System.out.println("Digite o peso dessa nota");
		P2 = scan.nextFloat();
		System.out.println("Digite sua terceira nota");
		N3 = scan.nextFloat();
		System.out.println("Digite o peso dessa nota");
		P3 = scan.nextFloat();
		scan.close();
		MP = (N1*P1+ N2*P2 + N3*P3)/(P1+P2+P3);
		if (MP>=7) {
			  System.out.println("Voce foi aprovado");
		} else {
		if (MP<4){ 
		System.out.println("Você foi reprovado");
	    } else {
		    System.out.println("Voce vai para a prova final");
		}
	 }
  }
 
}
