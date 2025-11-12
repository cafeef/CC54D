package lista06.ex03;

public class Pessoa {
	protected String nome;
	protected String nascimento;
	protected int rg;
	protected int cpf;
	
	public Pessoa(String nome, String nascimento, int rg, int cpf) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.rg = rg;
		this.cpf = cpf;
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Nascimento: " + this.nascimento);
		System.out.println("RG: " + this.rg);
		System.out.println("CPF: " + this.cpf);
	}
}
