package lista05.ex05;

public class EstacionamentoTeste {

	public static void main(String[] args) {
		Estacionamento e1 = new Estacionamento();
		e1.estacionarVeiculo(2, "123A", "Celta", "Preto");
		e1.estacionarVeiculo(2, "456B", "Creta", "Cinza");
		e1.retirarVeiculo(4, "123A");
		e1.retirarVeiculo(8, "456B");
		e1.retirarVeiculo(6, "789C");
	}

}
