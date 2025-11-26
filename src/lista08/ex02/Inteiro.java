package lista08.ex02;

public class Inteiro {
	//Implementação das funções
	
	public int converterLong(long a) {
		return (int)a;
	}
	
	public int converterFloat(float a) {
		return (int)a;
	}
	
	public int converterDouble(double a) {
		return (int)a;
	}
	
	public Integer converterString(String a) {
		try {
			Integer conversao = Integer.parseInt(a);
			return conversao;
		} catch(NumberFormatException e) {
			System.out.println("A string deve apresentar um número.");
		}
		return null;
	}
}
