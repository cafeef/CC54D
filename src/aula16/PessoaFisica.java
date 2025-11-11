package aula16;

public class PessoaFisica extends Pessoa{
	private double gastoSaude;

	public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	
	
	@Override
	public void calcularImposto() {
		double imposto;
		if (this.rendaAnual < 20000) {
			imposto = this.rendaAnual * 0.15;
		}
		else {
			imposto = this.rendaAnual * 0.25;
		}
		
		if (this.gastoSaude != 0) {
			imposto = imposto - (this.gastoSaude / 2);
		}
		
		System.out.println("O imposto para " + this.nome + " calculado é: R$" + imposto);
	}
}
