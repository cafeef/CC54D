package lista06.ex06;

public class Desenvolvedor extends Funcionario{
	private int numeroProjeto;
	private double bonificacaoProjeto;
	private double salarioFinal;
	
	public Desenvolvedor(String nome, String registro, double salarioBase, int numeroProjeto,
			double bonificacaoProjeto) {
		super(nome, registro, salarioBase);
		this.numeroProjeto = numeroProjeto;
		this.bonificacaoProjeto = bonificacaoProjeto;
		this.salarioFinal = 0;
	}
	
	public void calcularSalarioFinal() {
		this.salarioFinal = this.salarioBase + (this.bonificacaoProjeto * this.numeroProjeto);
	}
	
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Número de projetos concluídos: " + this.numeroProjeto);
		System.out.println("Bonificação para cada projeto: " + this.bonificacaoProjeto);
		System.out.println("Salário final: " + this.salarioFinal);
	}
}
