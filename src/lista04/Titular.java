package lista04;

public class Titular {
	private String cpf;
	private String rg;
	private String nome;
	private String dataNascimento;
	private String sexo;
	private int rendaMensal;
	private Endereco endereco;
	
	public Titular(String cpf, String rg, String nome, String dataNascimento, String sexo, int rendaMensal,
			Endereco endereco) {
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.rendaMensal = rendaMensal;
		this.endereco = endereco;
	}
	
	public void imprimirDados() {
		System.out.println("CPF: " + this.cpf);
		System.out.println("RG: " + this.rg);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Renda Mensal: " + this.rendaMensal);
		System.out.println("\n===== Informações do Endereço =====");
		this.endereco.imprimirEndereco();
	}
	
}
