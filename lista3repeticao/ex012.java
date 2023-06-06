package lista3repeticao;

import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double alt=1.20 , ala= 1.05 , ant=0.02 , ana=0.03, ano=0;
        do {
            alt= alt + ant;
            ala= ala + ana;
            ano ++;
        } while (alt>=ala);
            System.out.println(ano);
            scan.close();
        }
}
