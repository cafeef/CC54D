package lista06.ex05;

public class ImovelNovo extends Imovel{
	private double valorAdicional;
	private double valorFinal;

	public ImovelNovo(double valorBase, Endereco endereco, double valorAdicional) {
		super(valorBase, endereco);
		this.valorAdicional = valorAdicional;
		this.valorFinal = 0;
	}
	
	public void calcularValorFinal() {
		this.valorFinal = super.valorBase + this.valorAdicional;
	}
	
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Valor adicional: " + this.valorAdicional);
		System.out.println("Valor final: " + this.valorFinal);
	}

}
