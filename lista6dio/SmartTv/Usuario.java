package lista6dio.SmartTv;

public class Usuario {
    
    public static void main (String [] args) throws Exception {
        SistemaSmartTV smartTV = new SistemaSmartTV();
         
        System.out.println("TV ligada: " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTV.ligada);
         
        smartTV.desligar();
         System.out.println("Novo Status -> TV ligada? " + smartTV.ligada);

         smartTV.aumentarVolume();
         smartTV.aumentarVolume();
         smartTV.aumentarCanal();
         System.out.println("Canal atual: " + smartTV.canal);
         
         smartTV.mudarCanal(20);
           System.out.println("Canal atual: " + smartTV.canal);
    }
}
