package aula16;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraTeste {
	public static void main (String args[]) {
		Calculadora calculadora1 = new Calculadora();
		List<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(2);
		listaNumeros.add(1);
		listaNumeros.add(5);
		System.out.println("Soma inteiros: " + calculadora1.somar(1, 2));
		System.out.println("Soma double: " + calculadora1.somar(3.5, 9.8));
		System.out.println("Soma lista: " + calculadora1.somar(listaNumeros));
	}
}
