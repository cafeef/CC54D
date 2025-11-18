package aula19;

public class Peixe implements Nadador{
	public String nome;

	public Peixe() {
		this.nome = "Peixe";
	}
	
	public void nadar() {
		System.out.println(this.nome + " está nadando.");
	}
	
}
