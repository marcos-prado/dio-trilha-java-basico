public class Contas {
    private String numeroConta;
    private double saldo;
    private double limite;
    private String clienteNome;
    private String clienteCpf;

    public Contas(String numeroConta, double saldo, double limite, String clienteNome, String clienteCpf) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.limite = limite;
        this.clienteNome = clienteNome;
        this.clienteCpf = clienteCpf;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public String getClienteCpf() {
        return clienteCpf;
    }
    public double getTaxaJuros() {
        return 0.0; // Método a ser sobrescrito nas subclasses
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= (saldo + limite)) {
            saldo -= valor;
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    public void transferir(double valor, Contas contaDestino) {
        if (valor > 0 && valor <= (saldo + limite)) {
            sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Valor de transferência inválido ou saldo insuficiente.");
        }
    }

    
}
