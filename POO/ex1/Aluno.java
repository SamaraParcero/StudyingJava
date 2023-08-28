package POO.ex1;

public class Aluno {
    public String nome;
	public int matricula;
	public float notaProva1;
	public float notaProva2;
	public float notaTrabalho;
	
	
	public String toString() {
        return "Nome: " + nome + ", Matrícula: " + matricula + ", Média: " + calcularMedia();
    }
	
	public double calcularMedia() {
		double media;
		media= (this.notaProva1*2.5 + this.notaProva2*2.5 + this.notaTrabalho*2)/7;
		return media;
	}
	
	public double irParaProvaFinal() {
		double media = calcularMedia();
	    if (media< 7) {
	    	return 7 - media;
	    } else if (media<4){
	    	System.out.println("Você não pode fazer prova final");
	    }
		return media=0;
	
	}
}
