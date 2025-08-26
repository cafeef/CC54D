package aula05;

public class Pessoa {
	//Atributos da classe Pessoa
	String nome;
	int idade;
	double peso;
	
	//métodos da classe pessoa
	public void andar() {
		System.out.println(nome + " está andando");
	}
	
	public void correr() {
		System.out.println(nome + " está correndo");
	}
	
	public void falar() {
		System.out.println(nome + " está falando");
	}
	
	public String toString() {
		return "Nome: " + nome + "\nIdade: " + idade + "\nPeso: " + peso;
	}
}
