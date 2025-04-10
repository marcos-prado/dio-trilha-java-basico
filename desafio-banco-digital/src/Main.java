

public class Main {
    public static void main(String[] args) {
       Contas ContaCorrente = new ContaCorrente("12345", 0, 100, 0.5, "Vanildo", "428526452-43");
        ContaCorrente.depositar(1000);
        System.out.println("Saldo após depósito: " + ContaCorrente.getSaldo()); 
        ContaCorrente.sacar(200);
        System.out.println("Saldo após saque: " + ContaCorrente.getSaldo());
        ContaCorrente.transferir(100, new ContaPoupanca("54321", 0, 0.02, "Vanildo", "428526452-43"));
        System.out.println("Saldo após transferência: " + ContaCorrente.getSaldo());
        System.out.println("Número da conta: " + ContaCorrente.getNumeroConta());
        System.out.println("Caro cliente:" + ContaCorrente.getClienteNome() + "O seu saldo é de " + ContaCorrente.getSaldo() );

        Contas ContaPoupanca = new ContaPoupanca("987654-0", 2500.0, 0.05, "Julia", "852.963.147-00");
        System.out.println("Nome do cliente: " + ContaPoupanca.getClienteNome()+" O saldo da sua conta é :R$"+ContaPoupanca.getSaldo());
        ContaPoupanca.depositar(500.0);
        System.out.println("Saldo após depósito: " + ContaPoupanca.getSaldo());
        ContaPoupanca.depositar(300.00);
        System.out.println("Saldo após depósito: " + ContaPoupanca.getSaldo());
        double rendimentoContaPoupanca = ContaPoupanca.getSaldo() * ContaPoupanca.getTaxaJuros();
        
        System.out.println("Taxa de juros: " + rendimentoContaPoupanca);
        System.out.println("Caro cliente:" + ContaPoupanca.getClienteNome() + "O seu saldo é de R$ " +(ContaPoupanca.getSaldo() +rendimentoContaPoupanca));

    }

}