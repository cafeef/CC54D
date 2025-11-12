package lista07.ex01;

public class Trapezio extends Figura {
	private double baseMenor;
	private double baseMaior;
	private double altura;
	private double l1;
	private double l2;
	
	
	public Trapezio(String cor, double baseMenor, double baseMaior, double altura, double l1, double l2) {
		super(cor);
		this.baseMenor = baseMenor;
		this.baseMaior = baseMaior;
		this.altura = altura;
		this.l1 = l1;
		this.l2 = l2;
	}

	@Override
	protected double calcularArea() {
		return (baseMaior + baseMenor) * (altura/2);
	}
	
	@Override
	protected double calcularPerimetro() {
		return baseMaior + baseMenor + l1 + l2;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Lado 1: " + this.l1);
		System.out.println("Lado 2: " + this.l2);
		System.out.println("Base maior: " + this.baseMaior);
		System.out.println("Base menor: " + this.baseMenor);
		System.out.println("Altura do trapézio: " + this.altura);
		System.out.println("Área do trapézio: " + this.calcularArea());
		System.out.println("Perímetro do trapézio: " + this.calcularPerimetro());
	}
	
}
