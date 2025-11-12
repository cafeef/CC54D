package lista07.ex01;

public abstract class Figura {
	protected String cor;

	public Figura(String cor) {
		super();
		this.cor = cor;
	}
	
	protected abstract double calcularArea();
	protected abstract double calcularPerimetro();
	
	public void imprimirDados() {
		System.out.println("Cor: " + this.cor);
	}
}
