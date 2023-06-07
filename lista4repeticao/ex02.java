package lista4repeticao;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
	
        Scanner scan = new Scanner(System.in);
            int num, cont=0, cnump=0, nump=2, divisor=1;
            System.out.println("Digite um número inteiro");
            num = scan.nextInt();
        
            while (cnump<num){ 
                cont=0;
                divisor=2;
                while(divisor <= nump/2) {
                    if (nump%divisor==0){
                          cont++;
                    }
                divisor++;
                }
                if(cont==0) {
                    System.out.println(nump);
                    cnump++;
                }
                nump++;
                
              }
              scan.close();      
        }	
}
