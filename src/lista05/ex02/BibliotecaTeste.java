package lista05.ex02;

public class BibliotecaTeste {

	public static void main(String[] args) {
		Biblioteca b1 = new Biblioteca();
		b1.adicionarNovoLivro("A metamorfose", "Franz Kafka", "1800", "Saber", 94);
		b1.emprestarLivro("A metamorfose", 15);
		b1.devolverLivro("A metamorfose", 23);
		
		b1.adicionarNovoLivro("O Senhor dos Anéis", "J.R.R. Tolkien", "1954", "Allen & Unwin", 1216);
		b1.adicionarNovoLivro("Dom Casmurro", "Machado de Assis", "1899", "Garnier", 256);
		b1.emprestarLivro("O Senhor dos Anéis", 9);
		
		b1.imprimirAcervo();
	}

}
