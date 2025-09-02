package aula06;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		//Criação de instâncias (criação de objetos) da Classe Carro
		Carro carro1 = new Carro("458 Italia", "Ferrari", "ABC1234", "Vermelho", 2015);
		Carro carro2 = new Carro("Civic", "Honda", "MNO9876", "Azul", 2019);
		Carro carro3 = new Carro("911 Carrera", "Porsche", "XYZ-5555", "Branco", 2018);
		
		carro1.ligado = false;
		carro1.velocidade = 0;
		
		carro2.ligado = false;
		carro2.velocidade = 0;
		
		carro3.ligado = false;
		carro3.velocidade = 0;
		
		System.out.printf("Modelo: %s\nMarca: %s\nAno: %d\nPlaca: %s\nCor: %s\n\n", carro1.modelo, carro1.marca, carro1.ano, carro1.placa, carro1.cor);
		System.out.printf("Modelo: %s\nMarca: %s\nAno: %d\nPlaca: %s\nCor: %s\n\n", carro2.modelo, carro2.marca, carro2.ano, carro2.placa, carro2.cor);
		System.out.printf("Modelo: %s\nMarca: %s\nAno: %d\nPlaca: %s\nCor: %s\n\n", carro3.modelo, carro3.marca, carro3.ano, carro3.placa, carro3.cor);
		
		
	}
	
}
