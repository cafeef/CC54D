package lista04;

public class EventoTeste {

	public static void main(String[] args) {
		Artista a1 = new Artista("Pablo Vittar", "Brasileira", "Drag Queen");
		Endereco e1 = new Endereco("Flores", 44, "Margarida", "Sol", "US");
		Local l1 = new Local("Barretos", e1,  40);
		Evento ev1 = new Evento("Cowgirls", a1, "01-09-2025", l1, 18);
		
		ev1.venderIngresso(30);
		ev1.imprimirDados();
	}

}
