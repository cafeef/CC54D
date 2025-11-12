package lista06.ex02;

public class Funcionario extends Colaborador {
	protected String funcao;
	protected double salario;
	
	public Funcionario(String nome, String endereco, String dataInicio, String funcao, double salario) {
		super(nome, endereco, dataInicio);
		this.funcao = funcao;
		this.salario = salario;
	}
	
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Função: " + this.funcao);
		System.out.println("Salário: R$" + this.salario);
	}
	
}
