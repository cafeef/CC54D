package lista04;

public class Filme {
	private String titulo;
	private int duracao;
	
	public Filme(String titulo, int duracao) {
		super();
		this.titulo = titulo;
		this.duracao = duracao;
	}
	
	public void imprimirDados() {
		System.out.println("\n==== Dados filme ====");
		System.out.println("Título: " + this.titulo);
		System.out.println("Duração: " + this.duracao);
	}
}
