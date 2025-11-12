package lista06.ex04;

public class Carro extends Veiculo{
	private int quantidadePortas;

	public Carro(String marca, String modelo, int anoFabricacao, double valor, int quantidadePortas) {
		super(marca, modelo, anoFabricacao, valor);
		this.quantidadePortas = quantidadePortas;
	}
	
	public void calcularIPVA() {
		super.calcularIPVA(0.035);
	}
	
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Quantidade de portas: " + this.quantidadePortas);
	}
}
