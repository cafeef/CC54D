package lista01;

public class notebook {
	//atributos
	String marca, modelo, modeloProcessador;
	int polegadas, memoriaRam, capacidadeArmazenamento;
	
	//metodo construtor
	public notebook(String marca, String modelo, String modeloProcessador, int polegadas, int memoriaRam, int capacidadeArmazenamento) {
		this.marca = marca;
		this.modelo = modelo;
		this.modeloProcessador = modeloProcessador;
		this.polegadas = polegadas;
		this.memoriaRam = memoriaRam;
		this.capacidadeArmazenamento = capacidadeArmazenamento;
	}
	
	//metodos
	public void ligar() {
		System.out.println("Notebook " + modelo + " está ligando");
	}
	
	public void desligar() {
		System.out.println("Notebook " + modelo + " está desligando");		
	}
	
	public void processarInformacoes() {
		System.out.println("Notebook " + modelo + " está processando informações");		
	}
	
	public void conectarInternet() {
		System.out.println("Notebook " + modelo + " está se conectando a internet");		
	}

	@Override
	public String toString() {
		return "notebook [marca=" + marca + ", modelo=" + modelo + ", modeloProcessador=" + modeloProcessador
				+ ", polegadas=" + polegadas + ", memoriaRam=" + memoriaRam + ", capacidadeArmazenamento="
				+ capacidadeArmazenamento + "]";
	}
	
	
}
