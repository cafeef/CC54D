package aula19;

public class Homem implements Nadador, Andador {
	public String nome;
	
	public Homem() {
		this.nome = "Homem"; 
	}
	
	@Override
	public void andar() {
		System.out.println(this.nome + " está andando.");

	}

	@Override
	public void nadar() {
		System.out.println(this.nome + " está nadando.");

	}

}
