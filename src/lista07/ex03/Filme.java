package lista07.ex03;

public class Filme {
	private String titulo;
	private int duracao;
	private double precoLocacao;
	private double valorAtraso;
	private Locacao locacao;
	
	public Filme(String titulo, int duracao, double precoLocacao, double valorAtraso) {
		super();
		this.titulo = titulo;
		this.duracao = duracao;
		this.precoLocacao = precoLocacao;
		this.valorAtraso = valorAtraso;
		this.locacao = null;
	}
	
	public void locarFilme(int dataLocacao, Cliente cliente) {
		if (this.locacao == null) {
			locacao = new Locacao(dataLocacao, dataLocacao + 3, 0, cliente);
			System.out.println("Filme " + this.titulo + "locado com sucesso.");
		}
		else {
			System.out.println("O filme " + this.titulo + " já está locado.");
		}
	}
	
	public void devolverFilme(int diaDevolucao) {
		if (this.locacao == null) {
			System.out.println("O livro não está locado. Cancelando devolução...");
		}
		else {
			this.locacao.setDiaDevolucao(diaDevolucao);
			if (this.locacao.getDiaDevolucao() > this.locacao.getDataPrevistaDevolucao()) {
				System.out.println("Você devolveu o livro com atrasos. Calculando sua multa...");
				double multa = this.valorAtraso * (diaDevolucao - this.locacao.getDataPrevistaDevolucao());
				System.out.println("Sua multa é: " + multa);
				System.out.println("O preço total é: " + (this.precoLocacao + multa));
			}
			else {				
				System.out.println("Preço da locação: " + this.precoLocacao);
			}
			this.locacao.imprimirDados();
			System.out.println("Filme " + this.titulo + " devolvido.");
			this.locacao = null;
		}
	}
	
	public void imprimirDados() {
		System.out.println("Título: " + this.titulo);
		System.out.println("Duração: " + this.duracao);
		System.out.println("Preço da locação: " + this.precoLocacao);
		System.out.println("Valor de atraso: " + this.valorAtraso);
		if (this.locacao != null) {
			System.out.println("Filme indiponível para locação.");
			System.out.println("Dados do locador: ");
			this.locacao.getCliente().imprimirDados();
		}
		else {
			System.out.println("Filme disponível para locação.");
		}
	}
	
}
