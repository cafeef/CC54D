package lista08.ex01;

import java.lang.Math;

public class Calculadora {
	//Implementação das funções
	
	public void somar(double a, double b) {
		double soma = a + b;
		System.out.println(soma);
	}
	
	public void subtrair(double a, double b) {
		double subtracao = a - b;
		System.out.println(subtracao);
	}
	
	public void multiplicar(double a, double b) {
		double multiplicacao = a * b;
		System.out.println(multiplicacao);
	}
	
	public void dividir(double a, double b) {
		try {
			if (b == 0) {
				throw new ExcecaoDivisaoPorZero("Não é possível dividir por zero.");
			}
			Double divisao = a/b;
			System.out.println(divisao);
		} catch (ExcecaoDivisaoPorZero e) {
			System.out.println(e.getMessage());
		}
		
	}

	public void potencializar(double a, double b) {
		double potenciacao = Math.pow(a, b);
		System.out.println(potenciacao);
	}
	
	public void calcularRaizQuadrada(double a) {
		try {
			if (a < 0) {
				throw new RaizNegativa("Não é possível calcular a raiz de um número negativo.");
			}
			double raiz = Math.sqrt(a);
			System.out.println(raiz);
		} catch (RaizNegativa e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void calcularInverso(double a) {
		try {
			if (a == 0) {
				throw new ExcecaoDivisaoPorZero("Não existe inversa de 0.");
			}
			Double inverso = 1/a;
			System.out.println(inverso);
		} catch (ExcecaoDivisaoPorZero e) {
			System.out.println(e.getMessage());
		}
		
	}
}
