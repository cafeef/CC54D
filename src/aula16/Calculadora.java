package aula16;

import java.util.List;

public class Calculadora {
	
	public Integer somar(Integer a, Integer b) {
		return a + b;
	}
	
	public Double somar(Double a, Double b) {
		return a + b;
	}
	
	public Integer somar(List<Integer> lista) {
		int tamanho = lista.size();
		Integer soma = 0;
		for (Integer elemento : lista) {
			soma = soma + elemento;
		}
		return soma;
	}
	
}
