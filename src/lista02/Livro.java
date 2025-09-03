package lista02;

public class Livro {
	//atributos
	String titulo, autor, editora, situacao;
	int numeroPaginas, anoPublicacao;
	
	//construtor
	public Livro(String titulo, String autor, String editora, int numeroPaginas, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.situacao = "disponível";
		this.numeroPaginas = numeroPaginas;
		this.anoPublicacao = anoPublicacao;
	}
	
	//metodos
	public void emprestar() {
		if(situacao == "disponível") {
			System.out.println("Livro " + titulo + " emprestado");
			situacao = "indisponível";
		}
		else {
			System.out.println("Não é possível emprestar, o livro está indisponível");
		}
	}
	
	public void devolver() {
		if(situacao == "indisponível") {
			System.out.println("Livro " + titulo + " devolvido");
			situacao = "disponível";
		}
		else {
			System.out.println("Não é possível devolver, o livro está disponível");
		}
	}
	
	public String toString() {
		return titulo + ", " + autor + ", Editora " + editora + ", " + numeroPaginas + " páginas, " + anoPublicacao + ", " + situacao + " para empréstimo "; 
	}
}
