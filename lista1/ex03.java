package lista1;

import java.util.Scanner;

public class ex03 {
 public static void main(String[] args) {
    int Horas, Minutos, Segundos, Somaseg;
		Scanner lendo = new Scanner(System.in);
		System.out.println("Digite as horas");
		Horas = lendo.nextInt();
		System.out.println("Digite os minutos");
		Minutos = lendo.nextInt();
		System.out.println("Digite os segundos");
        Segundos = lendo.nextInt();
        Somaseg = Horas*3600 + Minutos*60 + Segundos;
        System.out.println("Ja se passaram " + Somaseg + " segundos no dia.");
        lendo.close();
  }
}
