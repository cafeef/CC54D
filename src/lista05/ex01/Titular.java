package lista05.ex01;

public class Titular {
	private String nome;
	private String cpf;
	
	public Titular(String nome, String cpf) {
		this.nome= nome;
		this.cpf = cpf;
	}
	
	public void imprimirTitular() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
	}
} 
