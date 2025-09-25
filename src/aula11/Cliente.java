package aula11;

public class Cliente {
	private int codigo;
	private String nome;
	private String dataNascimento;
	private EstadoCivil estadoCivil;
	
	//método construtor
	public Cliente(int codigo, String nome, String dataNascimento, EstadoCivil estadoCivil) {
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivil;
	}
	
	public void atualizarEstadoCivil(EstadoCivil estadoCivilAtual) {
		this.estadoCivil = estadoCivilAtual;
	}
	
	public void imprimirCliente() {
		System.out.println("Código: " + this.codigo);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("Estado Civil: " + this.estadoCivil);
	}
	
}
