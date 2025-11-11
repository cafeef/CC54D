package aula17;

import java.util.Scanner;

public class QuadrilateroTeste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Quadrilatero quadrilatero = null;
		int opcao = 0;
		
		System.out.println("Escolha uma das opções:\n1 - Quadrado\n2 - Retângulo\n3 - Losango");
		opcao = input.nextInt();
		
		switch (opcao) {
		case 1:
			quadrilatero = new Quadrado(4);
			break;
		case 2:
			quadrilatero = new Retangulo(2, 4);
			break;
		case 3:
			quadrilatero = new Losango(2, 6);
			break;
		}
		
		quadrilatero.calcularArea();
	}

}
