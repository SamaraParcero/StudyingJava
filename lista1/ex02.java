package lista1;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
		int c, f;
		System.out.println("Digite a temperatura em graus celsius");
		Scanner leia = new Scanner (System.in);
		c = leia.nextInt();
		f = ((9*c)+160)/5;
		System.out.println("A temperatura em Faremheit é: " + f );
        leia.close();
    }

}
