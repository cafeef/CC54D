package aula19;

public class Pato implements Andador, Nadador, Voador {
	public String nome;
	
	public Pato() {
		this.nome = "Pato";
	}
	
	
	@Override
	public void voar() {
		System.out.println(this.nome + " está voando.");

	}

	@Override
	public void nadar() {
		System.out.println(this.nome + " está nadando.");

	}

	@Override
	public void andar() {
		System.out.println(this.nome + " está andando.");
	}

}
