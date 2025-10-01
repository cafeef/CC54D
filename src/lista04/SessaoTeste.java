package lista04;

public class SessaoTeste {

	public static void main(String[] args) {
		Sala sa1 = new Sala(111, 30);
		Filme f1 = new Filme("RAPHL", 120);
		Sessao s1 = new Sessao("01-09-2025", "17h", sa1, f1);
		s1.imprimirDados();
		
		s1.venderIngressos(9);
		s1.imprimirDados();
	}

}
