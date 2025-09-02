package aula06;

public class TempoQueda {
	final double GRAVIDADE = 9.8;
	double altura;
	
	public void calcularTempoQueda(double altura) {
		double tempo = (2 * altura) / GRAVIDADE;
		tempo = Math.sqrt(tempo);
		System.out.println("Tempo de queda: " + tempo);
	}
}
