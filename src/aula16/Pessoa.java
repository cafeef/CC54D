package aula16;

public class Pessoa {
	protected String nome;
	protected double rendaAnual;
	
	public Pessoa(String nome, double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	
	public void calcularImposto() {
		System.out.println("Calculando imposto...");
	}
	
}
