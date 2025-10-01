package lista04;

public class Dono {
	private String cpf;
	private String nome;
	private String telefone;
	private String email;
	private Endereco endereco;
	
	
	public Dono(String cpf, String nome, String telefone, String email, Endereco endereco) {
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}
	
	public void imprimirDados() {
		System.out.println("CPF: " + this.cpf);
		System.out.println("Nome: " + this.nome);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("E-mail: " + this.email);
		System.out.println("\n===== Imprimindo dados do endereço =====");
		endereco.imprimirEndereco();
	}
}
