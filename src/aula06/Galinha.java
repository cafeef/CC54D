package aula06;

public class Galinha {
	//variaveis de instancia
	String nome;
	int quantidadeOvos;
	static int quantidadeOvosGranja = 0;
	
	//metodos
	public void botar() {
		quantidadeOvos++;
		quantidadeOvosGranja++;
	}
}
