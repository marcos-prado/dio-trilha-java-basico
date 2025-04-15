import java.util.Locale;
import java.util.Scanner;

public class Clientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String titular = sc.nextLine();
        int numeroConta = sc.nextInt();
        double saldoInicial = sc.nextDouble();

        Conta conta = new Conta(titular, numeroConta, saldoInicial);

        // Operações de saque e depósito
        if (sc.hasNextDouble()) {
            double valorSaque = sc.nextDouble();
            if (!conta.sacar(valorSaque)) {
                System.out.println("Saque invalido: Saldo insuficiente");
                System.out.println("Saldo Atual: " + String.format("%.2f", conta.consultarSaldo()));

            }
        }
        if (sc.hasNextDouble())

        {
            double valorDeposito = sc.nextDouble();
            conta.depositar(valorDeposito);
        }

        // Imprime o saldo final atualizado
        System.out.println("Saldo Atualizado: " + String.format("%.2f", conta.consultarSaldo()));

        sc.close(); // Fecha o scanner
    }

}
