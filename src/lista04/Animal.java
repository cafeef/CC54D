package lista04;

public class Animal {
	private String nome;
	private int idade;
	private String sexo;
	private Dono dono;
	private Tratamento tratamento;
	
	
	public Animal(String nome, int idade, String sexo, Dono dono) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.dono = dono;
	}
	
	public void iniciarTratamento(String descricao, String dataInicio) {
		tratamento = new Tratamento(descricao, dataInicio);
	}
	
	public void finalizarTratamento(String dataFim) {
		this.tratamento.dataFim = dataFim;
	}
	
	
	
	
	
}
