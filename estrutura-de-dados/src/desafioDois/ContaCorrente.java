package desafioDois;

public class ContaCorrente extends Conta{
    private double limite; 
        
    public ContaCorrente(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        //TODO: Implemente a lógica para verificar se o saque é permitido considerando o saldo e o limite:
        //Dica: Se saldo - valor >= -limite, o saque é permitido.
        
        if (saldo - valor >= -limite) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
       
        exibirSaldo(); // Exibe o saldo atualizado
    }
}

