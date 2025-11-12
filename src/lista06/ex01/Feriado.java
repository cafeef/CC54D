package lista06.ex01;

public class Feriado extends Data {
	private String descricao;

	public Feriado(int dia, int mes, int ano, String descricao) {
		super(dia, mes, ano);
		this.descricao = descricao;
	}
	
	public Feriado() {
		super();
		this.descricao = "Feriado";
	}
	
	public Feriado(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	public void exibirData() {
		super.exibirData();
		System.out.print(" - " + this.descricao);
	}
	
}
