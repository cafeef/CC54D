package lista05.ex01;

public class ContaBancaria {
	private int numeroConta;
	private double saldo;
	private Titular titularConta;
	
	public ContaBancaria(int numeroConta, Titular titularConta) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.saldo = 0;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public Titular getTitularConta() {
		return titularConta;
	}
	
	public void sacar(double valor) {
		if (this.saldo > valor) {
			this.saldo -= valor;
			System.out.println("\nSaque realizado com sucesso! Novo saldo: " + this.saldo);
		}
		else {
			System.out.println("\nNão foi possível sacar, saldo insuficiente.");
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("\nDepósito realizado com sucesso. Novo saldo: " + this.saldo);
	}
	
	public void imprimirConta() {
		System.out.println("Número conta: " + this.numeroConta);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("\nImprimindo informações do titular da conta: ");
		titularConta.imprimirTitular();
		}
	
}
