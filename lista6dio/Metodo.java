

public class Metodo {
    public static void main (String [] args){
        String primeiroNome= "Samara";
        String segundoNome = "Parcero";
        String nomear = nomear(primeiroNome, segundoNome);
        System.out.println(nomear);
        }

    public static String nomear (String primeiroNome, String segundoNome){
        return "Seu nome é:" + primeiroNome.concat(" ").concat(segundoNome);
    }
}
