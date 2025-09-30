package lista04;

public class Funcionario {
	private int numeroRegistro;
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String setor;
	private String telefone;
	private Endereco endereco;
	
	public Funcionario(int numeroRegistro, String nome, String dataNascimento, String sexo, String setor,
			String telefone, Endereco endereco) {
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.setor = setor;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public void imprimirRelatorio() {
		System.out.println("Número de registro: " + this.numeroRegistro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de nascimento: " + this.dataNascimento);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Setor: " + this.setor);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Endereço: ");
		this.endereco.imprimirEndereco();
	}
	
	
	
}
