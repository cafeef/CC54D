package lista06.ex04;

public class Veiculo {
	protected String marca;
	protected String modelo;
	protected int anoFabricacao;
	protected double valor;
	protected double valorIPVA;
	
	
	
	public Veiculo(String marca, String modelo, int anoFabricacao, double valor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.valor = valor;
		this.valorIPVA = 0;
	}


	public void calcularIPVA(double porcentagem) {
		this.valorIPVA = this.valor * porcentagem;
	}
	
	public void exibirInformacoes() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ano de Fabricação: " + this.anoFabricacao);
		System.out.println("Valor: R$" + this.valor);
		System.out.println("Valor IPVA: " + this.valorIPVA);
	}
}
