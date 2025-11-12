package lista06.ex01;

public class DataTeste {
	public static void main(String [] args) {
		Data data1 = new Data(5, 9, 2006);
		Data data2 = new Data(9, 2006);
		Data data3 = new Data(5);
		Data data4 = new Data();
		
		data1.exibirData();
		data2.exibirData();
		data3.exibirData();
		data4.exibirData();
		
		Feriado feriado1 = new Feriado(7, 9, 1822, "Dia da independência");
		Feriado feriado2 = new Feriado();
		Feriado feriado3 = new Feriado("Ano novo");
		
		feriado1.exibirData();
		feriado2.exibirData();
		feriado3.exibirData();
	}
}
