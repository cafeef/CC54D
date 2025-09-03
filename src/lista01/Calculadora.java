package lista01;

public class Calculadora {
	//atributos
	String marca, modelo, tipo;
	int memoriaInterna;
	
	//metodo construtor
	public Calculadora(String marca, String modelo, String tipo, int memoriaInterna) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.memoriaInterna = memoriaInterna;
	}
	
	//metodos da calculadora
	public void ligar() {
		
	}
	
	public void desligar() {
		
	}
	
	public void calcular() {
		
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", memoriaInterna="
				+ memoriaInterna + "]";
	}
	
	
}
