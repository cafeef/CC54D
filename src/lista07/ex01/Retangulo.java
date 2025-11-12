package lista07.ex01;

public class Retangulo extends Figura {
	private double largura;
	private double altura;
	
	public Retangulo(String cor, double largura, double altura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}
	
	@Override
	protected double calcularArea() {
		return this.largura*this.altura;
	}
	
	@Override
	protected double calcularPerimetro() {
		return 2*(this.largura + this.altura);
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Largura do retângulo: " + this.largura);
		System.out.println("Altura do retângulo: " + this.altura);
		System.out.println("Área do retângulo: " + this.calcularArea());
		System.out.println("Perímetro do retângulo: " + this.calcularPerimetro());
	}
}
