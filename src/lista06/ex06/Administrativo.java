package lista06.ex06;

public class Administrativo extends Funcionario {
	private double adicional;
	private double salarioFinal;

	public Administrativo(String nome, String registro, double salarioBase, double adicional) {
		super(nome, registro, salarioBase);
		this.adicional = adicional;
	}
	
	public void calcularSalarioFinal() {
		this.salarioFinal = this.salarioBase + this.adicional;
	}
	
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Adicional: R$" + this.adicional);
		System.out.println("Salário final: R$" + this.salarioFinal);
	}
}
