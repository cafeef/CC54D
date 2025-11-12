package lista06.ex02;

public class Estagiario extends Funcionario{
	private int ciee;

	public Estagiario(String nome, String endereco, String dataInicio, String funcao, double salario, int ciee) {
		super(nome, endereco, dataInicio, funcao, salario);
		this.ciee = ciee;
	}
	
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Número do CIEE: " + this.ciee);
	}
}
