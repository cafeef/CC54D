package aula15;

public class Professor extends Pessoa {
	private double salarioBase;
	private double salarioTitulacao;
	
	
	
	public Professor(String nome, int idade, double salarioBase, double salarioTitulacao) {
		super(nome, idade);
		this.salarioBase = salarioBase;
		this.salarioTitulacao = salarioTitulacao;
	}



	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Salário base: " + this.salarioBase);
		System.out.println("Salário titulacção: " + this.salarioTitulacao);
	}
}
