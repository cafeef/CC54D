package lista06.ex02;

public class Prestador extends Colaborador{
	protected double valorHora;
	protected String tipoServico;
	
	public Prestador(String nome, String endereco, String dataInicio, double valorHora, String tipoServico) {
		super(nome, endereco, dataInicio);
		this.valorHora = valorHora;
		this.tipoServico = tipoServico;
	}
	
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Valor hora: R$" + this.valorHora);
		System.out.println("Tipo serviço: " + this.tipoServico);
	}
}
