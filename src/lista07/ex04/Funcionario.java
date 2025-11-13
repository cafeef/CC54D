package lista07.ex04;

public abstract class Funcionario {
	protected String registro;
	protected String nome;
	protected String dataAdmissao;
	protected double salarioBase;
	
	public Funcionario(String registro, String nome, String dataAdmissao, double salarioBase) {
		super();
		this.registro = registro;
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salarioBase = salarioBase;
	}
	
	protected abstract double calcularSalario();
	
	public void imprimirDados() {
		System.out.println("==============");
		System.out.println("Registro: " + this.registro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de admissão: " + this.dataAdmissao);
		System.out.println("Salário base: " + this.salarioBase);
	}
	
}
