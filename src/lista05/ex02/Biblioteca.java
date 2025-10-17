package lista05.ex02;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
	private Map<String, Livro> acervo;
	
	public Biblioteca() {
		this.acervo = new HashMap<>();
	}
	
	public void adicionarNovoLivro(String titulo, String autor, String anoPublicacao, String editora, int numeroPaginas) {
		Livro livro = new Livro(titulo, autor, anoPublicacao, editora, numeroPaginas);
		acervo.put(titulo, livro);
		System.out.println("Livro " + titulo + " adicionado com sucesso!");
	}
	
	public void emprestarLivro(String titulo, int dataEmprestimo) {
		if (acervo.containsKey(titulo)) {
			Livro livro = acervo.get(titulo);
			livro.emprestarLivro(dataEmprestimo);
		}
		else {
			System.out.println("Livro " + titulo + " não encontrado. ");
		}
	}
	
	public void devolverLivro(String titulo, int dataDevolucao) {
		if (acervo.containsKey(titulo)) {
			Livro livro = acervo.get(titulo);
			livro.devolverLivro(dataDevolucao);
		}
		else {
			System.out.println("Livro " + titulo + " não encontrado. ");
		}
	}
	
	public void imprimirAcervo() {
		Livro livro;
		System.out.println("Imprimindo acervo...\n==========");
		for(String titulo : acervo.keySet()) {
			livro = acervo.get(titulo);
			System.out.println("- " + livro.getTitulo());
		}
		System.out.println("==========");
	}
}
