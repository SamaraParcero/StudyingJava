public class ForArray {
    public static void main(String[] args) {
        String alunos [] = { "FELIPE", "JOANA", "JULIA", "MARCOS"};

        for (int x=0; x < alunos.length; x++ ){
            System.out.println( "O aluno " + x + " é " + alunos [x]);
        } // OU

        for(String aluno : alunos ) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
