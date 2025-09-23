package lista03;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria(123, 345, 100);
		c1.deposito(90);
		c1.verificacaoSaldo();
		c1.saque(200);
		c1.verificacaoSaldo();
	}

}
