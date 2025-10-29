package aula15;

public class Aluno extends Pessoa{
	private String curso;

	public Aluno(String nome, int idade, String curso) {
		super(nome, idade);
		this.curso = curso;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Curso: " + this.curso);
	}
	
	public void realizarMatricula() {
		System.out.println("O aluno " + this.nome + " está realizando a matrícula");
		
	}
}
