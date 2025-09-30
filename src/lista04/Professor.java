package lista04;

public class Professor {
	private int registro;
	private String nome;
	private String dataNascimento;
	private double salario;
	
	public Professor(int registro, String nome, String dataNascimento, double salario) {
		this.registro = registro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}
	
	public void imprimirDados() {
		System.out.println("Registro: " + this.registro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("Salário: " + this.salario);
		
	}
}
