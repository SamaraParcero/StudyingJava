public class FormatarCepExemplo {

public class CepInvalidoExeception extends Exception{
    public CepInvalidoExeception(){
        super("CEP inválido");
    }
}
public static void main(String[] args) {
        try{
             String cepFormatado = formatarCep("12345678");
             System.out.println(cepFormatado);
        } catch (CepInvalidoExeception exception){
           System.out.println("O cep não corresponde com as regras ");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoExeception {
        if (cep.length() != 8)
            throw new CepInvalidoExeception();
        return "23.765-064";
    }
}
