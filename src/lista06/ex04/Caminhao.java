package lista06.ex04;

public class Caminhao extends Veiculo{
	private double capacidadeCarga;
	
	public Caminhao(String marca, String modelo, int anoFabricacao, double valor, int capacidadeCarga) {
		super(marca, modelo, anoFabricacao, valor);
		this.capacidadeCarga = capacidadeCarga;
	}
	
	public void calcularIPVA() {
		super.calcularIPVA(0.015);
	}
	
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Capacidade de carga: " + this.capacidadeCarga + "kg");
	}
}
