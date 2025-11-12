package lista07.ex03;

public class Locacao {
	private int dataLocacao;
	private int dataPrevistaDevolucao;
	private int diaDevolucao;
	private Cliente cliente;
	
	public Locacao (int dataLocacao, int dataPrevistaDevolucao, int diaDevolucao, Cliente cliente) {
		super();
		this.dataLocacao = dataLocacao;
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
		this.diaDevolucao = diaDevolucao;
		this.cliente = cliente;
	}
	
	public void imprimirDados() {
		System.out.println("data locação: " + this.dataLocacao);
		System.out.println("Data prevista da devolução: " + this.dataPrevistaDevolucao);
		System.out.println("Dia de devolução: " + this.diaDevolucao);
		System.out.println("Nome de quem locou: " + this.cliente.nome);
	}

	public int getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao (int dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

	public int getDataPrevistaDevolucao() {
		return dataPrevistaDevolucao;
	}

	public void setDataPrevistaDevolucao (int dataPrevistaDevolucao) {
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
	}

	public int getDiaDevolucao() {
		return diaDevolucao;
	}

	public void setDiaDevolucao (int diaDevolucao) {
		this.diaDevolucao = diaDevolucao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
}
