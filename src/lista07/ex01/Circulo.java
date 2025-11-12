package lista07.ex01;

public class Circulo extends Figura {
	private double raio;
	final static double PI = 3.14;
	
	public Circulo(String cor, double raio) {
		super(cor);
		this.raio = raio;
	}
	
	@Override
	protected double calcularArea() {
		return PI*(this.raio*this.raio);
	}
	
	@Override
	protected double calcularPerimetro() {
		return 2*PI*this.raio;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Raio do círculo: " + this.raio);
		System.out.println("Área do círculo: " + this.calcularArea());
		System.out.println("Perímetro do círculo: " + this.calcularPerimetro());
	}
}
