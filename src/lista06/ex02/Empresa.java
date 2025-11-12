package lista06.ex02;

public class Empresa extends Prestador {
	private long cnpj;

	public Empresa(String nome, String endereco, String dataInicio, double valorHora, String tipoServico, long cnpj) {
		super(nome, endereco, dataInicio, valorHora, tipoServico);
		this.cnpj = cnpj;
	}
	
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("CNPJ: " + this.cnpj);
	}
}
