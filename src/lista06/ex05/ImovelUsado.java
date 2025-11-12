package lista06.ex05;

public class ImovelUsado extends Imovel {
	private double valorDesconto;
	private double valorFinal;
	
	public ImovelUsado(double valorBase, Endereco endereco, double valorDesconto) {
		super(valorBase, endereco);
		this.valorDesconto = valorDesconto;
		this.valorFinal = 0;
	}
	
	public void calcularValorFinal() {
		this.valorFinal = super.valorBase - this.valorDesconto;
	}
	
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Valor de desconto: " + this.valorDesconto);
		System.out.println("Valor final: " + this.valorFinal);
	}
}
