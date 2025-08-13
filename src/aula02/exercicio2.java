package aula02;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int primeiro = input.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int segundo = input.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int terceiro = input.nextInt();
		
		if (primeiro > segundo && primeiro > terceiro) {
			System.out.println("O número maior é " + primeiro);
		}
		else if (primeiro > segundo && terceiro > primeiro) {
			System.out.println("O número maior é " + terceiro);

		}
		else if (primeiro < segundo && terceiro < segundo) {
			System.out.println("O número maior é " + segundo);
		}
		else {
			System.out.println("O número maior é " + terceiro);
		}
		
		input.close();
	}

}
