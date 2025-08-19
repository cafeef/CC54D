package aula03;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		//Criação de instâncias (objetos) da Classe Carro
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		
		carro1.modelo = "458 Italia";
		carro1.marca = "Ferrari";
		carro1.ano = 2015;
		carro1.placa = "ABC1234";
		carro1.cor = "Vermelho";
		
		carro2.modelo = "Civic";
		carro2.marca = "Honda";
		carro2.ano = 2019;
		carro2.placa = "MNO9876";
		carro2.cor = "Azul";
		
		carro3.modelo = "911 Carrera";
		carro3.marca = "Porsche";
		carro3.ano = 2018;
		carro3.placa = "XYZ-5555";
		carro3.cor = "Branco";
		
		System.out.printf("Modelo: %s\nMarca: %s\nAno: %d\nPlaca: %s\nCor: %s\n\n", carro1.modelo, carro1.marca, carro1.ano, carro1.placa, carro1.cor);
		System.out.printf("Modelo: %s\nMarca: %s\nAno: %d\nPlaca: %s\nCor: %s\n\n", carro2.modelo, carro2.marca, carro2.ano, carro2.placa, carro2.cor);
		System.out.printf("Modelo: %s\nMarca: %s\nAno: %d\nPlaca: %s\nCor: %s\n\n", carro3.modelo, carro3.marca, carro3.ano, carro3.placa, carro3.cor);

	}
	
}
