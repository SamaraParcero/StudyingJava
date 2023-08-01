package lista6dio;

public class operador {
    public static void main (String [] args){
     int numero = 5;
     numero--; //numero = numero -1;
     numero++; // numero = numero +1;
     numero = numero + numero;
     int numero1 = 7;
        System.out.println(numero);
       

        boolean variavel = true;
        System.out.println(!variavel); // "!" torna a variavel falsa

     if (numero > numero1){
        System.out.println(numero);
     } else if (numero < numero1){
        System.out.println(numero1);
     } else {
        System.out.println("iguais");
     }
      
    }

}
