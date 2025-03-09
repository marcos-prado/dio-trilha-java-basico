public class SmartTV {
    boolean power = false;
    int channel = 1;
    int volume = 25;

    public void ligar(){
        power = true;
    }
    public void desligar(){
        power = false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }
    public void trocarCanal(int canal){
        channel = canal;
        
    }
    public void voltarCanal(int canal){
        channel--;
    }

}
