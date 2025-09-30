package aula12;

public class Carro {
	
	//Atributos da classe Carro
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	boolean ligado;
	int velocidade;
	
	//Metodo construtor da classe Carro
	public Carro(String modelo, String marca, String placa, String cor, int ano) {
		System.out.println("Executando o método construtor...");	
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
		this.ligado = false;
		this.velocidade = 0;
	
	}
	
	public Carro(String modelo, String marca, int ano) {
		this(modelo, marca, null, null, ano);
	}
	
	public Carro(String placa) {
		this(null, null, placa, null, 0);
	}
	
	//Métodos da classe Carro
	public void ligar() {
		System.out.println(this.marca + " " + this.modelo + " está ligando");
		ligado = true;
	}
	
	public void desligar() {
		if (velocidade != 0) {
			System.out.println("Você não pode desligar, o carro está acelerado.");
		}
		else if (ligado == true) {
			System.out.println(this.marca + " " + this.modelo + " está desligando");
			ligado = false;			

		}
		else {
			System.out.println("Você não pode desligar, o carro já está desligado.");
		}

	}
	
	public void acelerar(int valor) {
		if (velocidade + valor > 200) {
			System.out.println(this.marca + " " + this.modelo + " não pode acelerar. Você ultrapassará o limite de velocidade de 200km/h.");		}
		else if (ligado == true) {
			System.out.println(this.marca + " " + this.modelo + " está acelerando");
			velocidade += valor;			
		}
		else {
			System.out.println("O carro não pode acelerar se estiver desligado.");
		}

	}
	
	public void frear(int valor) {
		if (ligado == true){
			if ((velocidade - valor) < 0) {
				System.out.println(this.marca + " " + this.modelo + " não pode frear, sua velocidade ficará negativa.");

			}
			else {
				System.out.println(this.marca + " " + this.modelo + " está freando");
				velocidade -= valor;							
			}
		}
		else {
			System.out.println("O carro está desligado, não se pode frear.");
		}
	}
	
	

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public int getAno() {
		return ano;
	}

	public String getPlaca() {
		return placa;
	}

	public String getCor() {
		return cor;
	}

	public boolean isLigado() {
		return ligado;
	}

	public int getVelocidade() {
		return velocidade;
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + this.modelo + ", marca=" + this.marca + ", ano=" + this.ano + ", placa=" + this.placa + ", cor=" + this.cor
				+ ", ligado=" + this.ligado + ", velocidade=" + this.velocidade + "]";
	}
	
	
}
