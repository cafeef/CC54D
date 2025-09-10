package lista03;

public class Calculadora {
	//atributos
	private String marca;
	private String modelo;
	private String tipo;
	private int memoriaInterna;
	
	//metodo construtor
	public Calculadora(String marca, String modelo, String tipo, int memoriaInterna) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.memoriaInterna = memoriaInterna;
	}
	
	//metodos de cálculo
	public double soma(double A, double B) {
		return A + B;
	}
	public double subtracao(double A, double B) {
		return A - B;
	}
	public double multiplicacao(double A, double B) {
		return A * B;
	}
	public double divisao(double A, double B) {
		return A / B;
	}

	private String getMarca() {
		return marca;
	}

	private String getModelo() {
		return modelo;
	}

	private String getTipo() {
		return tipo;
	}

	private int getMemoriaInterna() {
		return memoriaInterna;
	}

	@Override
	public String toString() {
		return "Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nTipo: " + getTipo()
				+ "\nMemória Interna: " + getMemoriaInterna();
	}
	
	
	
	
}
