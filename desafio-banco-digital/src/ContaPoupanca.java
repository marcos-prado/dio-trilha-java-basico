public class ContaPoupanca extends Contas {
    private double taxaJuros;
    private String clienteNome;
    private String clienteCpf;

    public ContaPoupanca(String numeroConta, double saldo, double taxaJuros, String clienteNome, String clienteCpf) {
        super(numeroConta, saldo, 0.0, clienteNome, clienteCpf);
        this.taxaJuros = taxaJuros;
        this.clienteNome = clienteNome;
        this.clienteCpf = clienteCpf;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public String getClienteCpf() {
        return clienteCpf;
    }
    
}
