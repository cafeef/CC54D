package lista02;

public class Televisao {
	//atributos
	String marca, resolucao;
	int polegadas, canal, volume;
	boolean ligado;
	
	//construtor 
	public Televisao(String marca, int polegadas, String resolucao) {
		this.marca = marca;
		this.polegadas = polegadas;
		this.resolucao = resolucao;
		this.canal = 1;
		this.ligado = false;
		this.volume = 20;
	}
	
	//metodos
	public void ligar() {
		System.out.println(marca + " está ligando");
		this.ligado = true;
	}
	
	public void desligar() {
		System.out.println(marca + " está desligando");
		this.ligado = false;
	}
	
	public void aumentarCanal() {
		if (ligado) {			
			System.out.println("Aumentando o canal da " + marca);
			if (canal == 99) {
				canal = 1;
			}
			else {
				canal++;
			}
		}
		else {
			System.out.println("Não é possível alterar o canal, " + marca + " está desligada.");
		}
	}
	
	public void diminuirCanal() {
		if (ligado) {			
			System.out.println("Diminuindo o canal da " + marca);
			if (canal == 1) {
				canal = 99;
			}
			else {
				canal--;
			}
		}
		else {
			System.out.println("Não é possível alterar o canal, " + marca + " está desligada.");
		}
	}
	
	public void aumentarSom() {
		if (ligado) {			
			System.out.println("Aumentando o volume da " + marca);
			if (volume == 30) {
				System.out.println("Não é possível aumentar  volume, está no máximo.");
			}
			else {
				volume++;
			}
		}
		else {
			System.out.println("Não é possível aumentar o volume, " + marca + " está desligada.");

		}
	}
	
	public void diminuirSom() {
		if (ligado) {			
			System.out.println("Diminuindo o volume da " + marca);
			if (volume == 0) {
				System.out.println("Não é possível diminuir  volume, está no mudo.");
			}
			else {
				volume--;
			}
		}
		else {
			System.out.println("Não é possível diminuir o volume, " + marca + " está desligada.");
		}
	}

	@Override
	public String toString() {
		return "marca: " + marca + "\nresolucao: " + resolucao + "\npolegadas: " + polegadas + "\ncanal: " + canal
				+ "\nvolume: " + volume + "\nligado: " + ligado;
	}
	
	
	
	
	
}
