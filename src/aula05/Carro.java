package aula05;

public class Carro {
	
	//Atributos da classe Carro
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	boolean ligado;
	int velocidade;
	
	//Métodos da classe Carro
	public void ligar() {
		System.out.println(marca + " " + modelo + " está ligando");
		ligado = true;
	}
	
	public void desligar() {
		if (velocidade != 0) {
			System.out.println("Você não pode desligar, o carro está acelerado.");
		}
		else if (ligado == true) {
			System.out.println(marca + " " + modelo + " está desligando");
			ligado = false;			

		}
		else {
			System.out.println("Você não pode desligar, o carro já está desligado.");
		}

	}
	
	public void acelerar() {
		if (velocidade > 200) {
			System.out.println("Não pode acelerar. Você já está no limite de velocidade.");
		}
		else if (ligado == true) {
			System.out.println(marca + " " + modelo + " está acelerando");
			velocidade += 10;			
		}
		else {
			System.out.println("O carro não pode acelerar se estiver desligado.");
		}

	}
	
	public void frear() {
		if (velocidade < 0) {
			System.out.println("Não pode acelerar. Você já está no limite de velocidade.");
		}
		else if (ligado == true){
			System.out.println(marca + " " + modelo + " está freando");
			velocidade -= 10;			
		}
		else {
			System.out.println("O carro está desligado.");
		}
	}
	
	public String toString() {
		return "\nModelo: " + modelo + "\nMarca: " + marca + "\nAno: " + ano + "\nPlaca: " + placa + "\nCor: " + cor;
	}
}
