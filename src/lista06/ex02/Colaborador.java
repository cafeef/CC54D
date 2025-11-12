package lista06.ex02;

public class Colaborador {
	protected String nome;
	protected String endereco;
	protected String dataInicio;
	
	public Colaborador(String nome, String endereco, String dataInicio) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.dataInicio = dataInicio;
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Data de início: " + this.dataInicio);
	}
}
