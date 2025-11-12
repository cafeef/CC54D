package lista06.ex06;

public class Funcionario {
	protected String nome;
	protected String registro;
	protected double salarioBase;
	
	public Funcionario(String nome, String registro, double salarioBase) {
		super();
		this.nome = nome;
		this.registro = registro;
		this.salarioBase = salarioBase;
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Registro: " + this.registro);
		System.out.println("Salário base: R$" + this.salarioBase);
	}
}
