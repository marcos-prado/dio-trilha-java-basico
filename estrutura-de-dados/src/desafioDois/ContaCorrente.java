package desafioDois;

public class ContaCorrente extends Conta{
    private double limite; 
        
    public ContaCorrente(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
                
        if (saldo - valor >= limite) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
       
        exibirSaldo(); // Exibe o saldo atualizado
    }
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito realizado:");

        exibirSaldo(); // Exibe o saldo atualizado
    }
    public double getLimite() {
        return limite;
    }   
}

