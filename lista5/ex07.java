package lista5;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int [] notas = new int[5];
        for(int i=0; i<notas.length; i++) {
         System.out.println("Digite sua nota");
           notas[i] = scan.nextInt();
        }
        for (int nota : notas) {
           System.out.println(nota);
        }
    }
}
