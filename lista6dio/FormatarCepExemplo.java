public class FormatarCepExemplo {
    public static void main(String[] args) {
        try{
            String cepFormatado = formatarCep("12345678")
        } catch (CepInvalidoExecption exception){
            exception.printStackTrace();
        }
    }
    static String formatarCep(String cep) throws CepInvalidoExecption {
        if (cep.length() != 8)
            throw new CepInvalidoExecption();
        return "23.765-064";
    }
}
