package aula15;

public class VeiculoTeste {
	public static void main(String[] args) {
		Carro carro1 = new Carro("Gol", "Volkswagen", 2020, 5, "Flex", 4);
		carro1.calibrarPneus();
		carro1.abastecer();
		
		Aviao aviao1 = new Aviao("A380", "AirBus", 1980, 800, "Combustível de aviação", 45000);
		aviao1.voar();
		aviao1.abastecer();
	}
}
