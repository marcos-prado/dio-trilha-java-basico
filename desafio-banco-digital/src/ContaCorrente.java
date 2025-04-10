public class ContaCorrente extends Contas {
    private double taxaManutencao; // Taxa de manutenção mensal da conta corrente
    private String clienteNome;
    private String clienteCpf;

    public ContaCorrente(String numeroConta, double saldo, double limite, double taxaManutencao, String clienteNome, String clienteCpf) {
        super(numeroConta, saldo, limite, clienteNome, clienteCpf);
        this.taxaManutencao = taxaManutencao;
        this.clienteNome = clienteNome;
        this.clienteCpf = clienteCpf;
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public String getClienteCpf() {
        return clienteCpf;
    }
    
}
