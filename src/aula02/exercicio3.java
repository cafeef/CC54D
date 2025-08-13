package aula02;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o valor da compra: ");
		double valor = input.nextDouble();
		double desconto = (valor >= 50) ? 0.1 : 0.05;
		double valorDesconto = valor * desconto;
		double valorFinal = valor - valorDesconto;
		System.out.println("O desconto oferecido foi de R$" + valorDesconto + " e o valor final da compra é R$" + valorFinal);
		input.close();
	}

}
