package aula10;

public class Pessoa {
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String email;
	private String estadoCivil;
	private Endereco endereco;
	
	
	
	public Pessoa(String nome, String dataNascimento, String sexo, String email, String estadoCivil,
			Endereco endereco) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		this.estadoCivil = estadoCivil;
		this.endereco = endereco;
	}



	public void imprimirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("E-mail: " + this.email);
		System.out.println("Estado civil: " + this.estadoCivil);
		System.out.println("Endereço:\n" + this.endereco.getLogradouro() + ", " + this.endereco.getNumero() + " - " + this.endereco.getBairro() + ", " + this.endereco.getCidade() + " - " + this.endereco.getUf());

		
	} 
}
