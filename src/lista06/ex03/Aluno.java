package lista06.ex03;

public class Aluno extends Pessoa{
	private int matricula;

	public Aluno(String nome, String nascimento, int rg, int cpf, int matricula) {
		super(nome, nascimento, rg, cpf);
		this.matricula = matricula;
	}
	
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Matrícula: " + this.matricula);
	}
}
