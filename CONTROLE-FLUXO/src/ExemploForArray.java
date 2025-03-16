public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"João", "Maria", "José", "Pedro", "Ana"};

        /*for(int x=0; x < alunos.length; x++) {
            System.out.println("\n O aluno no indice x :" + x + " é " + alunos[x]);
        }*/
        for(String aluno : alunos){
            System.out.println("\n Nome do aluno: " + aluno);
        }
    }
}
