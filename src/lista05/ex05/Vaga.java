package lista05.ex05;

public class Vaga {
	private int numeroIdentificacao;
	private Veiculo veiculo;
	private int horaIngresso;
	
	public Vaga(int numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
		this.veiculo = null;
	}
	
	public void adicionarVeiculo(int horaIngresso, String placa, String modelo, String cor) {
		Veiculo veiculo = new Veiculo(placa, modelo, cor);
		this.veiculo = veiculo;
		this.horaIngresso = horaIngresso;
	}
	
	public void retirarVeiculo(int horaSaida) {
		double taxaResultante = 0;
		int quantidadeHoras = horaSaida - this.horaIngresso;
		if (quantidadeHoras <= 3) {
			taxaResultante = 2;
		}
		else {
			taxaResultante = 2 + ((quantidadeHoras - 3) * 0.5);
		}
		System.out.println("A taxa a ser paga é: R$" + taxaResultante);
		this.veiculo = null;
		this.horaIngresso = 0;
	}
	
	public int getNumeroIdentificacao() {
		return numeroIdentificacao;
	}

	public void setNumeroIdentificacao(int numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	
}
