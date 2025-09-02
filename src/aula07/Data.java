package aula07;

public class Data {
	//atributos do objeto
	int dia;
	int mes;
	int ano;
	
	//metodo construtor
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(int mes, int ano) {
		this(01, mes, ano);
	}
	
	public Data(int dia) {
		this(dia, 01, 2010);
	}
	
	public Data() {
		this(01, 01, 2010);
	}

	@Override
	public String toString() {
		return "Data [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
	}
	
	
}
