public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double saque = 26.0;
        
        if(saque < saldo){
            saldo  = saldo - saque;
            System.out.println("Novo saldo: " + saldo);

        }else{
            System.out.println("Saldo insuficiente");
        }
        
        System.out.println("Saldo atual: " + saldo);
    }
}