import  java.util.Locale;
import  java.util.Scanner;

public class Excecao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        String nome, sobrenome;
        int idade;
        float altura;

        System.out.println("Digite seu nome");
        nome = scan.nextLine();
        
         System.out.println("Digite seu sobrenome");
        sobrenome = scan.nextLine();

         System.out.println("Digite sua idade");
        idade = scan.nextInt();

         System.out.println("Digite sua altura");
        altura= scan.nextFloat();
    }
}
