package lista02;

public class LivroTeste {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Java – Como Programar", "Paul Deitel", "Pearson", 968, 2016);
		Livro livro2 = new Livro("Cálculo – Volume I", "James Stewart", "Cengage", 708, 2021);
		livro1.emprestar();
		livro2.devolver();
		System.out.println(livro1);
		System.out.println(livro2);

	}

}
