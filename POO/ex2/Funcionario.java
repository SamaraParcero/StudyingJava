package POO.ex2;

public class Funcionario {
    public String nome;
	public String funcao;
	public float salario;

	public void ajustaSalario() {
		this.salario *= 1.05;
	}
	public String toString() {
		return this.nome+ " - " + this.funcao+ " - "+ this.salario;
	}
}
