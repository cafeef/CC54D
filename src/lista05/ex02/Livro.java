package lista05.ex02;

public class Livro {
	
	private String titulo;
	private String autor;
	private String anoPublicacao;
	private String editora;
	private int numeroPaginas;
	
	//dados para empréstimo e devolução
	private boolean disponibilidade;
	private int dataEmprestimo;
	
	
	public Livro(String titulo, String autor, String anoPublicacao, String editora, int numeroPaginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.editora = editora;
		this.numeroPaginas = numeroPaginas;
		this.disponibilidade = true;
		this.dataEmprestimo = 0;
	}
	
	public void emprestarLivro(int dataEmprestimo) {
		if (this.disponibilidade) {
			this.dataEmprestimo = dataEmprestimo;
			this.disponibilidade = false;
			System.out.println("Livro " + this.titulo + " emprestado com sucesso. Devolva em até 7 dias (dia " + (this.dataEmprestimo + 7) + ")");
		}
		else {
			System.out.println("\nLivro não disponível para empréstimo.");
		}
	}
	
	public void devolverLivro(int dataDevolucao) {
		int diasPercorridos = dataDevolucao - this.dataEmprestimo;
		if (diasPercorridos > 7) {
			System.out.println("Você passou do prazo de devolução. Calculando sua multa...");
			double multa = (diasPercorridos - 7) * 1.5;
			System.out.println("Sua multa é de: R$" + multa);
		}
		else {
			System.out.println("Livro devolvido com sucesso!");
		}
		this.disponibilidade = true;
	}
	
	public String getTitulo() {
	    return this.titulo;
	}
	
}
