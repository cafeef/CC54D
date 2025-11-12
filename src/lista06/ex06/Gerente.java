package lista06.ex06;

public class Gerente extends Funcionario {
	private double totalLucro;
	private double porcentagemParticipacao;
	private double salarioFinal;
	
	
	public Gerente(String nome, String registro, double salarioBase, double totalLucro,
			double porcentagemParticipacao) {
		super(nome, registro, salarioBase);
		this.totalLucro = totalLucro;
		this.porcentagemParticipacao = porcentagemParticipacao;
		this.salarioFinal = 0;
	}
	
	public void calcularSalarioFinal() {
		this.salarioFinal = this.salarioBase + (this.totalLucro * (this.porcentagemParticipacao/100));
	}
	
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Total de lucro da empresa: " + this.totalLucro);
		System.out.println("Porcentagem de participação do lucro: " + this.porcentagemParticipacao);
		System.out.println("Salário final: " + this.salarioFinal);
	}
}
