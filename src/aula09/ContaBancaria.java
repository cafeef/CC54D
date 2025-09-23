package aula09;

public class ContaBancaria {
	//atributos
	private int numeroConta;
	private String titular;
	private double saldo;
	
	//metodo construtor
	public ContaBancaria(int numeroConta, String titular) {
		setNumeroConta(numeroConta);
		setTitular(titular);
		setSaldo(0.00);
		
	}
	
	//metodos
	public void sacar(double valor) {
		if (valor > saldo) {
			System.out.println("Não é possível sacar R$" + valor + " de R$" + this.saldo);
		}
		else {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso.\nNovo saldo: R$" + this.saldo );
		}
	}
	
	private void calcularRendimento() {
		double rendimento = this.saldo * 0.10;
		this.saldo += rendimento;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		this.calcularRendimento();
		System.out.println("Depósito realizado com sucesso\nNovo saldo: R$" + this.saldo);
	}
	
	public void imprimirSaldo() {
		System.out.println("=======================");
		System.out.println("Número da conta: " + getNumeroConta());
		System.out.println("Titular: " + getTitular());
		System.out.println("Saldo: R$" + getSaldo());
		System.out.println("=======================");

	}

	private int getNumeroConta() {
		return numeroConta;
	}

	private void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	private String getTitular() {
		return titular;
	}

	private void setTitular(String titular) {
		this.titular = titular;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
