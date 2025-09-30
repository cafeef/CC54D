package aula12;

import java.util.ArrayList;
import java.util.List;

import aula12.Carro;

public class TesteListas {

	public static void main(String[] args) {
		List <Carro> listaCarros = new ArrayList();
		Carro carro1 = new Carro("Gol", "Volks", "aaaa", "azul", 2020);
		Carro carro2 = new Carro("458 Italia", "Ferrari", "ABC1234", "Vermelho", 2015);
		Carro carro3 = new Carro("197 Carrera", "Porsche", "DEF5678", "Preto", 2023);

		listaCarros.add(carro1);
		listaCarros.add(carro2);
		listaCarros.add(carro3);
		
		for (int i = 0; i < listaCarros.size(); i++) {
			Carro carro = listaCarros.get(i);
			System.out.println("\nModelo: " + carro.getModelo() + "\nMarca: " + carro.getMarca() + "\nAno: " + carro.getAno() + "\nPlaca: " + carro.getPlaca() + "\nCor: " + carro.getCor());
		}
	}

}
