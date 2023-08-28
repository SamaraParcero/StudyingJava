package POO.ex1;

import java.util.Scanner;

public class AppAluno {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Aluno[] alunos = new Aluno[3];
		
		for (int i=0; i<alunos.length; i++) {
			alunos[i]=new Aluno();
			System.out.println("Digite o seu nome");
			alunos[i].nome = scan.next();
			System.out.println("Digite sua matrícula");
			alunos[i].matricula = scan.nextInt();
			System.out.println("Digite sua primeira nota");
			alunos[i].notaProva1= scan.nextFloat();
			System.out.println("Digite sua segunda nota");
			alunos[i].notaProva2= scan.nextFloat();
			System.out.println("Digite sua nota do trabalho");
			alunos[i].notaTrabalho= scan.nextFloat();
		}
				
		System.out.println("Média do aluno: " );
		for(int i=0; i<alunos.length;i++) {
			alunos[i].calcularMedia();
			System.out.println(alunos[i]);
			alunos[i].irParaProvaFinal();
            System.out.println("Valor para prova final para o aluno(a) " + alunos[i].nome + ": " + alunos[i].irParaProvaFinal());
		}


			
		}
}
