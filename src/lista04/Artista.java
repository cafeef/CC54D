package lista04;

public class Artista {
	private String nome;
	private String nacionalidade;
	private String biografia;
	
	public Artista(String nome, String nacionalidade, String biografia) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.biografia = biografia;
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Nacionalidade: " + this.nacionalidade);
		System.out.println("Biografia: " + this.biografia);
	}
	
}
