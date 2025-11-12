package lista06.ex02;

public class Autonomo extends Prestador {
	private long cpf;

	public Autonomo(String nome, String endereco, String dataInicio, double valorHora, String tipoServico, long cpf) {
		super(nome, endereco, dataInicio, valorHora, tipoServico);
		this.cpf = cpf;
	}
	
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("CPF: " + this.cpf);
	}
}
