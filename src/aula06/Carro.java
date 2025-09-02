package aula06;

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
	
	public void acelerar(int valor) {
		if (velocidade + valor > 200) {
			System.out.println(marca + " " + modelo + " não pode acelerar. Você ultrapassará o limite de velocidade de 200km/h.");		}
		else if (ligado == true) {
			System.out.println(marca + " " + modelo + " está acelerando");
			velocidade += valor;			
		}
		else {
			System.out.println("O carro não pode acelerar se estiver desligado.");
		}

	}
	
	public void frear(int valor) {
		if (ligado == true){
			if ((velocidade - valor) < 0) {
				System.out.println(marca + " " + modelo + " não pode frear, sua velocidade ficará negativa.");

			}
			else {
				System.out.println(marca + " " + modelo + " está freando");
				velocidade -= valor;							
			}
		}
		else {
			System.out.println("O carro está desligado, não se pode frear.");
		}
	}
	
	public String toString() {
		return "\nModelo: " + modelo + "\nMarca: " + marca + "\nAno: " + ano + "\nPlaca: " + placa + "\nCor: " + cor;
	}
}
