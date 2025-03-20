package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Maria", "José", "Ana", "Carlos", "Mariana"};
        
        for(String candidato : candidatos){
         entrandoEmContato(candidato);
        }
    
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Maria", "José", "Ana", "Carlos", "Mariana"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento: ");
        
        /*for(int i = 0; i < candidatos.length; i++){
            System.out.println("Indice: " + (i+1) + " - Candidato: " + candidatos[i]);
        }*/
        for(String candidato : candidatos){
            System.out.println("O Candidato selecionado foi: " + candidato);
            
        }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                    System.out.println("Contato realizado com sucesso com o candidato: " + candidato);

                }
              }while(continuarTentando && tentativasRealizadas < 3);
              if(atendeu){
                    System.out.println("Conseguimos contato com: " + candidato + " na " + tentativasRealizadas + " tentativa");
              }else{
                    System.out.println("Não conseguimos  contato com: " + candidato + " não atendeu a ligação após " + tentativasRealizadas + " tentativas");
              }

    }
    static boolean atender(){
        return new Random().nextInt(3) ==1;
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"João", "Maria", "José", "Ana", "Carlos", "Mariana", "Pedro", "Paula", "Lucas", "Luana"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5  && candidatoAtual < candidatos.length){
            String candidato = candidatos [candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato: " +candidato+ " solicitou o salário de R$ " + salarioPretendido);    
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato: "+candidato+ " foi selecionado");
                candidatosSelecionados++;
                
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void analisarSalario(double salarioPretendido){
            double salarioBase = 2000.0;
            if(salarioBase > salarioPretendido){
                System.out.println(" Ligar para o candidato");
            }else if(salarioBase == salarioPretendido){
                System.out.println(" Ligar para o candidato com contra proposta");
            }else{
                System.out.println(" Aguardar o resultado dos demais candidatos");
            } 
    }
}
