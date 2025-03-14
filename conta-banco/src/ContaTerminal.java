import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Por favor, digite o número da Agencia: ");
            String agencia = scanner.next();
            System.out.print("Agora digite o número da conta: ");
            int numeroConta = scanner.nextInt();
            System.out.print("Digite o nome do titular da conta: ");
            String nomeCliente = scanner.next();
            System.out.print("Digite o saldo da conta: ");
            double saldoConta = scanner.nextDouble();
     
            System.out.println("Olá, " + nomeCliente + "!");
            System.out.println("Sua agência é " + agencia + " Conta nº " + numeroConta);
            System.out.println("Seu saldo é de R$ " + saldoConta +" e está disponivel para saque ou investimentos.");
            System.out.println("Obrigado por abrir sua conta conosco!");            
        }
    }
    
}
