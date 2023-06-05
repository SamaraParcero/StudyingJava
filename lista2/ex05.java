package lista2;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int H1, H2, M1, M2, MaiorH, MaiorM, MenorH, MenorM, Soma, Produto;
        System.out.println("Digite idade de um homem");
        H1 = scan.nextInt();
        System.out.println("Digite idade de outro homem");
        H2 = scan.nextInt();
       System.out.println("Digite a idade de uma mulher");
       M1 = scan.nextInt();
       System.out.println("Digite a idade de outra mulher");
       M2 = scan.nextInt();
      
       if (H1>H2) {
           MaiorH = H1;
           MenorH = H2;
       } else {
           MaiorH = H2;
           MenorH =H1;
       }
       if (M1>M2) {
           MaiorM = M1;
           MenorM = M2;
       } else {
           MaiorM = M2;
           MenorM = M1;
       }
       Soma = MaiorH + MenorM;
       Produto = MenorH*MaiorM;
       System.out.println("A soma é: " + Soma + " e o produto é: " + Produto);
      scan.close();
      }
}
