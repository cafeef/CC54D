package lista06.ex04;

public class VeiculoTeste {

	public static void main(String[] args) {
		Carro carro1 = new Carro("Chevrolet", "Celta", 2015, 30000, 4);
		Moto moto1 = new Moto("Yamaha", "Dark", 2020, 15000, "Casual");
		Caminhao caminhao1 = new Caminhao("DAF", "Focus", 2019, 120000, 500);
		
		carro1.calcularIPVA();
		moto1.calcularIPVA();
		caminhao1.calcularIPVA();
		
		carro1.exibirInformacoes();
		moto1.exibirInformacoes();
		caminhao1.exibirInformacoes();
	}

}
