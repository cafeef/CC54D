package exercicios;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite uma opção que deseja:\n1 - Olá\n2 - Somar dois números\n3 - Sair");
		int op = input.nextInt();
		switch (op) {
			case 1: 
				System.out.println("Olá!");
				break;
			case 2: 
				System.out.println("Digite o valor de A: ");
				int A = input.nextInt();
				System.out.println("Digite o valor de B: ");
				int B = input.nextInt();
				int soma = A + B;
				System.out.printf("A soma é: %d", soma);
				break;
			case 3:
				break;
			default:
				System.out.println("Opção inválida!");
		}
		input.close();
	}

}
