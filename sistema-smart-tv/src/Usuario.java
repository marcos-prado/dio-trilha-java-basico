public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV tv = new SmartTV();
        
        System.out.println("TV power: " + tv.power);
        System.out.println("TV channel: " + tv.channel);
        System.out.println("TV volume: " + tv.volume);
        
        tv.ligar();
        System.out.println("A tv esta ligada: " + tv.power);

        tv.desligar();
        System.out.println("A tv foi desligada: " + tv.power);

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();    

        System.out.println("Canal atual: " + tv.channel);
        tv.trocarCanal(6);
        System.out.println("Canal trocado para: " + tv.channel);
        tv.trocarCanal(10);
        System.out.println("Canal trocado para: " + tv.channel);
        System.out.println("Canal atual: " + tv.channel);

        tv.voltarCanal(5);
        


    }
}
