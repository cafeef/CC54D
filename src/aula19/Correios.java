package aula19;

public class Correios implements Frete {
	public double calcularFrete(int distancia) {
		return 15.00 + (distancia * 0.35);
	}
}
