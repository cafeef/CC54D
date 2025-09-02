package aula06;

public class GalinhaTeste {

	public static void main(String[] args) {
		//instanciando objetos
		Galinha galinha1 = new Galinha();
		Galinha galinha2 = new Galinha();
		Galinha galinha3 = new Galinha();
		
		//atribuindo
		galinha1.nome = "Gisela";
		galinha2.nome = "Matilde";
		galinha3.nome = "Clotilde";
		
		//invocando metodos
		
		//galinha 1 vai ter 5 ovos
		for (int i = 0; i < 5; i++) {
			galinha1.botar();			
		}
		
		//galinha 2 vai ter 1 ovo
		galinha2.botar();

		//galinha 3 vai ter 3 ovos
		for (int i = 0; i < 3; i++) {
			galinha3.botar();			
		}
		
		//imprimindo resultados
		System.out.println(galinha1.nome + " botou: " + galinha1.quantidadeOvos + " ovo(s) ");
		System.out.println(galinha2.nome + " botou: " + galinha2.quantidadeOvos + " ovo(s) ");
		System.out.println(galinha3.nome + " botou: " + galinha3.quantidadeOvos + " ovo(s) ");
		System.out.println("Total de ovos da granja: " + Galinha.quantidadeOvosGranja);
	}

}
