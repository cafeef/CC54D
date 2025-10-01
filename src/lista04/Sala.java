package lista04;

public class Sala {
	private int numeroIdentificacao;
	private int capacidadeMaxima;
	
	public Sala(int numeroIdentificacao, int capacidadeMaxima) {
		super();
		this.numeroIdentificacao = numeroIdentificacao;
		this.capacidadeMaxima = capacidadeMaxima;
	}
	
	public void imprimirDados() {
		System.out.println("\n==== Dados Sala ====");
		System.out.println("Número identificação: " + this.numeroIdentificacao);
		System.out.println("Capacidade máxima: " + this.capacidadeMaxima);
	}
	
	public int getCapacidadeMaxima() {
		return this.capacidadeMaxima;
	}
	
	
}
