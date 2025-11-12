package lista06.ex04;

public class Moto extends Veiculo{
	private String tipoGuidao;
	
	public Moto(String marca, String modelo, int anoFabricacao, double valor, String tipoGuidao) {
		super(marca, modelo, anoFabricacao, valor);
		this.tipoGuidao = tipoGuidao;
	}
	
	public void calcularIPVA() {
		super.calcularIPVA(0.02);
	}
	
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Tipo de guidão: " + this.tipoGuidao);
	}
}
