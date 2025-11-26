package lista08.ex01;

public class CalculadoraTeste {

	public static void main(String[] args) throws ExcecaoDivisaoPorZero, RaizNegativa {
		Calculadora cal1 = new Calculadora();
		cal1.dividir(9, 0);
		cal1.calcularInverso(0);
		cal1.calcularRaizQuadrada(-16);
	}

}
