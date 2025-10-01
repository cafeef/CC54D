package lista04;

public class Evento {
	private String nome;
	private Artista artista;
	private String data;
	private Local local;
	private int classificacaoEtaria;
	private int quantidadeIngressos;
	
	public Evento(String nome, Artista artista, String data, Local local, int classificacaoEtaria) {
		super();
		this.nome = nome;
		this.artista = artista;
		this.data = data;
		this.local = local;
		this.classificacaoEtaria = classificacaoEtaria;
		this.quantidadeIngressos = local.getCapacidadeMaxima();
	}

	public void venderIngresso(int quantidade) {
		if (quantidade < this.quantidadeIngressos) {
			this.quantidadeIngressos -= quantidade;
			System.out.println("Ingressos vendidos com sucesso!");
		}
		else {
			System.out.println("Quantidade de ingressos para venda insuficiente");
		}
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("\n==== Dados do artista ====");
		artista.imprimirDados();
		System.out.println("Data: " + this.data);
		System.out.println("\n==== Dados do local ====");
		local.imprimirDados();
		System.out.println("Classificação etária: " + this.classificacaoEtaria);
		System.out.println("Quantidade de ingressos disponíveis: " + this.quantidadeIngressos);
	}
}
