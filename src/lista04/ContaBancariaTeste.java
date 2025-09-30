package lista04;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		Endereco e1 = new Endereco("Flores", 44, "Margarida", "Sol", "US");
		Titular t1 = new Titular("11", "22", "Claudio", "01-09-2009", "Masculino", 10000, e1);
		ContaBancaria c1 = new ContaBancaria(33, 44, t1);
		c1.depositar(500);
		c1.sacar(40);
		c1.imprimirRelatorio();
		c1.sacar(700);
		c1.imprimirRelatorio();
		
	}

}
