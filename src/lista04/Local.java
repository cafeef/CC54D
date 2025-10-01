package lista04;

public class Local {
	private String nome;
	private Endereco endereco;
	private int capacidadeMaxima;
	
	public int getCapacidadeMaxima() {
		return this.capacidadeMaxima;
	}
	
	
	
	public Local(String nome, Endereco endereco, int capacidadeMaxima) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.capacidadeMaxima = capacidadeMaxima;
	}



	public void imprimirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Capacidade máxima: " + this.capacidadeMaxima);
		System.out.println("\n==== Dados endereço ====");
		endereco.imprimirEndereco();
	}
}
