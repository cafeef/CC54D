package aula19;

public class CarrinhoCompra {
	private double valorCompra;
	private int distancia;
	
	private Frete frete;
		
	public CarrinhoCompra(double valorCompra, int distancia, Frete frete) {
		this.valorCompra = valorCompra;
		this.distancia = distancia;
		this.frete = frete;
	}
	
	public void realizarCompra() {
		double frete = this.frete.calcularFrete(distancia);
		double valorTotal = this.valorCompra + frete;
		System.out.println("O valor total da compra é: " + valorTotal);
	}
	
}
