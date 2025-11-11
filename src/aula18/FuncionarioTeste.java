package aula18;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Assalariado assalariado1 = new Assalariado("João da Silva", "123.456.789-10", 5000, 2000);
		assalariado1.imprimirDados();
		Comissionado comissionado1 = new Comissionado("Maria Gloria", "109.876.543-21", 5000, 100000, 0.05);
		comissionado1.imprimirDados();
		Horista horista1 = new Horista("Ricardo Caravalho", "122.444.234-90", 5000, 15, 160);
		horista1.imprimirDados();
	}
}
