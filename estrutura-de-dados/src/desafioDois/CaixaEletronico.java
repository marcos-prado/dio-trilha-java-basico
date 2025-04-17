package desafioDois;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tipoConta = scanner.next();
        scanner.nextLine();
        scanner.nextLine();
        scanner.next();
        double saldoInicial = scanner.nextDouble();

        Conta conta;

        if (tipoConta.equalsIgnoreCase("corrente")) {
            double limite = scanner.nextDouble();
            // Para Conta Corrente, leia também o limite de cheque especial e crie a
            // instância.
            conta = new ContaCorrente(saldoInicial, limite);
        } else {
            conta = new ContaPoupanca(saldoInicial);

        }

        // Processar saques enquanto houver entrada no scanner
        while (scanner.hasNextDouble()) {
            double valorSaque = scanner.nextDouble();
            conta.sacar(valorSaque);
        }

        scanner.close();
    }
}
