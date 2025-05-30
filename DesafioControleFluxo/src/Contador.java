
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo número: ");
            int parametroDois = terminal.nextInt();

            try {
                contar(parametroUm, parametroDois);

            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo paramento deve ser maior que o primeiro");
        }
        if (parametroUm < parametroDois) {
            for (int i = parametroUm; i <= parametroDois; i++) {
                System.out.println("Imprimindo o número: " + (i + 1));
            }

        }

    }
}
