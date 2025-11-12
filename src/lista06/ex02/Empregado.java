package lista06.ex02;

public class Empregado extends Funcionario {
	private int carteiraTrabalho;

	public Empregado(String nome, String endereco, String dataInicio, String funcao, double salario,
			int carteiraTrabalho) {
		super(nome, endereco, dataInicio, funcao, salario);
		this.carteiraTrabalho = carteiraTrabalho;
	}
	
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Número Carteira de Trabalho: " + this.carteiraTrabalho);
	}
}
