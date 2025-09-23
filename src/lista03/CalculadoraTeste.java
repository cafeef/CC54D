package lista03;

public class CalculadoraTeste {

	public static void main(String[] args) {
		Calculadora c1 = new Calculadora("Casio", "XM123", "Científica", 8);
		System.out.println("Soma 6 + 7: " + c1.soma(6,  7));
		System.out.println(c1);
	}

}
