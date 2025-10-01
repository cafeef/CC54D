package lista04;

public class AnimalTeste {

	public static void main(String[] args) {
		Endereco e1 = new Endereco("Flores", 44, "Margarida", "Sol", "US");
		Dono d1 = new Dono("111", "Fernanda", "222", "fer@gmail.com", e1);
		Animal a1 = new Animal("Marry", 8, "Feminino", d1);
		
		a1.imprimirDados();
		
		a1.iniciarTratamento("01-09-2025", "Castração");
		a1.imprimirDados();
		
		a1.finalizarTratamento("10-09-2025");
		a1.imprimirDados();
	}

}
