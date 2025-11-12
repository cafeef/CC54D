package lista07.ex01;

public class Losango extends Figura {
	private double diagonalMaior;
	private double diagonalMenor;
	private double lado;
	
	public Losango(String cor, double diagonalMaior, double diagonalMenor, double lado) {
		super(cor);
		this.diagonalMaior = diagonalMaior;
		this.diagonalMenor = diagonalMenor;
		this.lado = lado;
	}
	
	@Override
	protected double calcularArea() {
		return (this.diagonalMaior * this.diagonalMenor)/2;
	}
	
	@Override
	protected double calcularPerimetro() {
		return 4*this.lado;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Diagonal maior do losango: " + this.diagonalMaior);
		System.out.println("Diagonal menor do  losango: " + this.diagonalMenor);
		System.out.println("Lado do  losango: " + this.lado);
		System.out.println("Área do  losango: " + this.calcularArea());
		System.out.println("Perímetro do  losango: " + this.calcularPerimetro());
	}
	
}
