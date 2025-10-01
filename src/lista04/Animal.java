package lista04;

public class Animal {
	private String nome;
	private int idade;
	private String sexo;
	private Dono dono;
	private Tratamento tratamento = new Tratamento();
	
	
	public Animal(String nome, int idade, String sexo, Dono dono) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.dono = dono;
	}
	
	public void iniciarTratamento(String dataInicio, String descricao) {
		tratamento.iniciarTratamento(descricao, dataInicio);
	}
	
	public void finalizarTratamento(String dataFim) {
		tratamento.finalizarTratamento(dataFim);
	}
	
	public void imprimirDados() {
		System.out.println("\n===== Dados do animal =====");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("\n===== Dados do tratamento =====");
		tratamento.imprimirDados();
		System.out.println("\n===== Dados do dono =====");
		dono.imprimirDados();
	}
	
	
	
}
