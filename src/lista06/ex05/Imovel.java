package lista06.ex05;

public class Imovel {
	protected double valorBase;
	protected Endereco endereco;
	
	public Imovel(double valorBase, Endereco endereco) {
		super();
		this.valorBase = valorBase;
		this.endereco = endereco;
	}
	
	public void exibirInformacoes() {
		System.out.print("Endereço: ");
		endereco.exibirEndereco();
		System.out.println("Valor base: R$" + this.valorBase);
	}
}
