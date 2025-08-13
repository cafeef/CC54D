package aula02;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe seu nome completo: ");
		String nome = input.nextLine();
		
		System.out.println("Informe seu sexo: ");
		String sexo = input.nextLine();
		
		System.out.println("Informe seu estado civil: ");
		String estadoCivil = input.nextLine();
		
		System.out.println("Informe sua quantidade de filhos: ");
		int qntFilhos = input.nextInt();
		
		input.nextLine();
		
		System.out.println("Informe sua escolaridade: ");
		String escolaridade = input.nextLine();
		
		System.out.println("Informe sua renda mensal: ");
		double rendaMensal = input.nextDouble();
		
		System.out.printf("%s é do sexo %s, é %s, tem %d filhos, sua escolaridade é %s e possui %.2f como renda mensal.", nome, sexo, estadoCivil, qntFilhos, escolaridade, rendaMensal);
		input.close();
	}

}
