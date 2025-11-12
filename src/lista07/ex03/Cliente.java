package lista07.ex03;

import aula10.Endereco;

public class Cliente {
	protected String nome;
	protected String dataNascimento;
	protected String telefone;
	protected Endereco endereco;
	
	public Cliente(String nome, String dataNascimento, String telefone, Endereco endereco) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de nascimento: " + this.dataNascimento);
		System.out.println("Telefone: " + this.telefone);
		endereco.imprimirDados();
	}
	
}
