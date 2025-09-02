package aula07;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		//Criação de instâncias (criação de objetos) da Classe Carro
		Carro carro1 = new Carro("458 Italia", "Ferrari", "ABC1234", "Vermelho", 2015);
		Carro carro2 = new Carro("Civic", "Honda", 2019);
		Carro carro3 = new Carro("XYZ-5555");
		
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);

	}
	
}
