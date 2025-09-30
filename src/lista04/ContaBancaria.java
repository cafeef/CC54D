package lista04;

public class ContaBancaria {
	private int numeroAgencia;
	private int numeroConta;
	private Titular titular;
	private double saldo;
	
	
	public ContaBancaria(int numeroAgencia, int numeroConta, Titular titular) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 0;
	}
	
	
	public void sacar(int valor) {
		if (valor < this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void depositar(int valor) {
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso");
	}
	
	public void imprimirRelatorio() {
		System.out.println("\n===== Informações da conta =====");
		System.out.println("Número da Agência: " + this.numeroAgencia);
		System.out.println("Número da Conta: " + this.numeroConta);
		System.out.println("Saldo: " + this.saldo);		
		System.out.println("\n===== Informações do titular =====");
		this.titular.imprimirDados();
	}
	
}
