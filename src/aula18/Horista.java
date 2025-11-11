package aula18;

public class Horista extends Funcionario {
	private double precoHora;
	private int horasTrabalhadas;
	
	public Horista(String nome, String cpf, double salarioBase, double precoHora, int horasTrabalhadas) {
		super(nome, cpf, salarioBase);
		this.precoHora = precoHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Preço por hora: " + this.precoHora);
		System.out.println("Horas trabalhadas: " + this.horasTrabalhadas);
		System.out.println("Salário total: " + this.calcularSalario());		
		System.out.println("=================");
	}
	
	@Override
	protected double calcularSalario() {
		return this.salarioBase + (this.precoHora * this.horasTrabalhadas);
	}
	
}
