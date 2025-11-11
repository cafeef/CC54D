package aula18;

public class Comissionado extends Funcionario {
	private double totalVendas;
	private double taxaComissao;
	
	public Comissionado(String nome, String cpf, double salarioBase, double totalVendas, double taxaComissao) {
		super(nome, cpf, salarioBase);
		this.totalVendas = totalVendas;
		this.taxaComissao = taxaComissao;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Total vendas: " + this.totalVendas);
		System.out.println("Taxa de comissão: " + this.taxaComissao);
		System.out.println("Salário total: " + this.calcularSalario());
		System.out.println("=================");
	}
	
	protected double calcularSalario() {
		return this.salarioBase + (this.totalVendas * this.taxaComissao);
	}
	
}
