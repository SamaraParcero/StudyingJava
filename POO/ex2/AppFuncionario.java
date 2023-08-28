package POO.ex2;

import java.util.Scanner;

public class AppFuncionario {
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Funcionario[] funcionarios = new Funcionario[5];
		
		for (int i=0; i<funcionarios.length; i++) {
			funcionarios[i]=new Funcionario();
			System.out.println("Digite o seu nome");
			funcionarios[i].nome = scan.next();
			System.out.println("Digite sua função");
			funcionarios[i].funcao = scan.next();
			System.out.println("Digite o seu salário");
			funcionarios[i].salario= scan.nextFloat();
			
		}
		
		System.out.println("Reajuste sendo feito...");
		System.out.println("1 2 3...");
		System.out.println("Aqui seu reajuste:");
		for ( int i=0; i<funcionarios.length; i++) {
			funcionarios[i].ajustaSalario();
			System.out.println(funcionarios[i]);
		}

	}
}
