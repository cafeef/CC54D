package lista03;

public class ContaBancaria {
	//atributos
	private int numeroAgencia;
	private int numeroConta;
	private double saldo;
	
	//construtor
	public ContaBancaria(int numeroAgencia, int numeroConta, double saldo) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	//metodos
	public void saque(double valor) {
		if (valor > this.saldo) {
			System.out.println("Não é possível sacar. Saldo insuficiente");
		}
		else {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso\n");
		}
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso\n");
	}
	
	public void verificacaoSaldo() {
		System.out.println("\nNúmero da Agência: " + this.numeroAgencia + "\nNúmero Conta: " + this.numeroConta + "\nSaldo: " + this.saldo);
	}
}
