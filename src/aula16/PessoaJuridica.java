package aula16;

public class PessoaJuridica extends Pessoa{
	private int numeroFuncionarios;

	public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	
	@Override
	public void calcularImposto() {
		double imposto = 0;
		if (this.numeroFuncionarios > 15) {
			imposto = this.rendaAnual * 0.13;
		}
		else {
			imposto = this.rendaAnual * 0.18;
		}
		System.out.println("O imposto para " + this.nome + " calculado é: R$" + imposto);
	}
}
