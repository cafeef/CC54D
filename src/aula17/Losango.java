package aula17;

public class Losango extends Quadrilatero {
	private double diagonalMenor;
	private double diagonalMaior;
	
	public Losango(double diagonalMenor, double diagonalMaior) {
		this.diagonalMenor = diagonalMenor;
		this.diagonalMaior = diagonalMaior;
	}
	
	public void calcularArea() {
		double area;
		area = (this.diagonalMaior * this.diagonalMenor) / 2;
		System.out.println("A área do losango é: " + area);
	}
}
