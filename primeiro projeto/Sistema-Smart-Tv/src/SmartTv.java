public class SmartTv {
    boolean ligada = true;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        
    }

    public void aumetarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void ligar(){
        ligada = false;
    }
    public void desligar(){
        ligada = true;
    }
}
