package exercicios;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double nota;
		double media = 0;
		for (int i = 0; i < 3; i++) {
			System.out.printf("Digite a %d° nota do aluno: ", i + 1);
			nota = input.nextDouble();
			media = media + nota;
		}
		media = media/3;
		System.out.printf("Sua média final é: %.2f\n", media);
		System.out.println("Sua situação é: ");
		if (media >= 7) {
			System.out.println("Aprovado!");
		}
		else System.out.println("Reprovado.");
		input.close();
	}

}
