package aula19;

public class Passaro implements Voador, Andador {

	public String nome;
	
	public Passaro() {
		this.nome = "Pássaro";
	}
	
	@Override
	public void andar() {
		System.out.println(this.nome + " está andando.");

	}

	@Override
	public void voar() {
		System.out.println(this.nome + " está voando.");

	}

}
