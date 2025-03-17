
public class FormatadorCepExemplo {

    public static void main(String[] args) {
        try {
            String meuCep = formatarCep("12345678");
            System.out.println(meuCep);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP invalido, verifique e tente novamente.");
        }

    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }

        return "06363-180";

    }
}
