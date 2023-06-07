package lista3repeticao;

import java.util.Scanner;

public class ex010 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int N1, N2, menor, maior;
        System.out.println("Digite um número");
        N1= scan.nextInt();
        System.out.println("Digite outro número");
        N2= scan.nextInt();
        if (N1<N2) {
            
            for (menor=N1 ;menor<=N2; menor++) {
             System.out.println("Contagem: " + menor );
         }
        } else {
            for (maior=N1 ;maior>=N2; maior-- ) {
             System.out.println("Contagem: " + maior );
        }
      }
      scan.close();
     }
}
