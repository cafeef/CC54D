package aula17;

public class Retangulo extends Quadrilatero{
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public void calcularArea() {
		double area;
		area = this.base * this.altura;
		System.out.println("A área do retângulo é: " + area);
	}
}
