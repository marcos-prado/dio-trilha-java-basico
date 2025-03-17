
public class SistemaMedida {

    public static void main(String[] args) {
        String sigla = "G";

        switch (sigla) {
            case "P" -> System.out.print("Pequeno");
            case "M" -> System.out.print("Médio");
            case "G" -> System.out.print("Grande");
            default -> System.out.print("Tamanho desconhecido");
        }
        
    }
}
