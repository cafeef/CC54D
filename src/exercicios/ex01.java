package exercicios;
//Faça um algoritmo que leia os valores de A, B, C e 
//em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C
import java.util.Scanner;
public class ex01 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		int A = input.nextInt();
		
		System.out.println("Digite o valor de B: ");
		int B = input.nextInt();
		
		System.out.println("Digite o valor de C: ");
		int C = input.nextInt();
		
		int soma = A + B;
		
		if (soma > C) {
			System.out.printf("A soma %d é maior que %d (valor de C)", soma, C);
		}
		else {
			System.out.printf("A soma %d é menor que %d (valor de C)", soma, C);
		}
	}

}
