package lista07.ex01;

public class Quadrado extends Figura{
	private double lado;

	public Quadrado(String cor, double lado) {
		super(cor);
		this.lado = lado;
	}
	
	@Override
	protected double calcularArea() {
		return this.lado*this.lado;
	}
	
	@Override
	protected double calcularPerimetro() {
		return 4*this.lado;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Lado do quadrado: " + this.lado);
		System.out.println("Área do quadrado: " + this.calcularArea());
		System.out.println("Perímetro do quadrado: " + this.calcularPerimetro());
	}
}
