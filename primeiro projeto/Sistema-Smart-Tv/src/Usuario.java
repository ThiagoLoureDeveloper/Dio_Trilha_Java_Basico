public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv Ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.aumetarVolume(); 
        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("Canal Atual? " + smartTv.canal);     
        smartTv.mudarCanal(13);
        smartTv.aumentarCanal();
        System.out.println("Canal Atual? " + smartTv.canal);

    }
}
