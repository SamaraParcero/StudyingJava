package lista1;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
	   int ValorRecebido, N50, N10, N5, N1;
	   Scanner recebendo=new Scanner(System.in);
	   System.out.println("Digite o valor que inteiro que deseja");
	   ValorRecebido = recebendo.nextInt();
	   N50 = ValorRecebido/50;
	   ValorRecebido = ValorRecebido%50;
       N10 = ValorRecebido/10;
	   ValorRecebido = ValorRecebido%10;
	   N5 = ValorRecebido/5;
	   ValorRecebido = ValorRecebido%5;
	   N1 = ValorRecebido/1;
	   ValorRecebido= ValorRecebido%N1;
	   System.out.println(N50 + " notas de 50, "+ N10 + " notas de 10 " + N5 + " notas de 5 " + N1 + " notas de 1.");
       recebendo.close();
	}

}
