package lista07.ex01;

public class FiguraTeste {

	public static void main(String[] args) {
		Circulo c1 = new Circulo("Azul", 3);
		c1.imprimirDados();
		
		Quadrado q1 = new Quadrado("Vermelho", 4);
		q1.imprimirDados();
		
		Retangulo r1 = new Retangulo("Roxo", 2, 4);
		r1.imprimirDados();
	}

}
