package aula19;

public class Mercadoria {
	public double valorMercadoria;
	public Imposto imposto;

	public Mercadoria(double valorMercadoria, Imposto imposto) {
		this.valorMercadoria = valorMercadoria;
		this.imposto = imposto;
	}
	
	public void calcularImposto() {
		double valorFinal = imposto.calculoImposto(this.valorMercadoria);
		System.out.println("O valor final da mercadoria é: R$" + valorFinal);
	}
	
}
