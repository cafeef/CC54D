package exercicios;
//Faça um algoritmo para receber um número qualquer 
//e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int numero = input.nextInt();
		
		if (numero < 0) {
			System.out.println("O número é negativo");
		}
		else {
			System.out.println("O número é positivo");
		}
		
		if (numero % 2 == 0) {
			System.out.println("O número é par");
		}
		else {
			System.out.println("O número é ímpar");
		}
		input.close();
	}

}
