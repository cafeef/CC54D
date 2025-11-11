package aula17;

public class Quadrado extends Quadrilatero{
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public void calcularArea() {
		double area;
		area = lado * lado;
		System.out.println("A área do quadrado é: " + area);
	}
}
