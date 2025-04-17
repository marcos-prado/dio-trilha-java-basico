package desafioDois;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    // Implementação do método sacar para Conta Poupança
    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado:");

        } else {
            System.out.println("Saque invalido:");
        }

        exibirSaldo(); // Exibe o saldo atualizado
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito realizado:");

        exibirSaldo(); // Exibe o saldo atualizado
    }

}