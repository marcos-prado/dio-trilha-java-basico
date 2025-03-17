import java.util.Locale;
import java.util.Scanner;

public class AboutMe{
    public static void main(String[] args) {
        try{
        Scanner scanner;
            scanner = new Scanner (System.in).useLocale(Locale.US);
        System.out.println("Qual é o seu nome: ");
        String name = scanner.nextLine();
        System.out.println("Sua idade: ");
        int age = scanner.nextInt();
        System.out.println("A sua altura: ");
        double height = scanner.nextDouble();
        System.out.println("O seu peso: ");
        double weight = scanner.nextDouble();
        
        System.out.println("Olá meu nome é: " + name);
        System.out.println("Eu tenho " + age + " anos");
        System.out.println("Minha altura é: " + height + " e meu peso é: " + weight+ "kg");
        scanner.close();
        }catch(java.util.InputMismatchException e){
            System.out.println("Os campos de idade, altura e peso devem ser preenchidos com números");
        }
    }       
}