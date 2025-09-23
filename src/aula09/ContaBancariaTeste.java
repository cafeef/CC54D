package aula09;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		ContaBancaria cb1 = new ContaBancaria(111, "João da Silva");
		cb1.imprimirSaldo();
		
		cb1.depositar(100);
		cb1.imprimirSaldo();
		
		cb1.sacar(100);
		cb1.imprimirSaldo();
	}

}
