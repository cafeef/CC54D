package lista06.ex01;

public class Data {
	protected int dia;
	protected int mes;
	protected int ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(int mes, int ano) {
		this(1, mes, ano);
	}
	
	public Data(int dia) {
		this(dia, 1, 2000);
	}
	
	public Data() {
		this(1, 1, 2000);
	}
	
	public void exibirData() {
		System.out.println(" ");
		System.out.print(this.dia + "/" + this.mes + "/" + this.ano);
	}
}
