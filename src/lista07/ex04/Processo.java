package lista07.ex04;

public class Processo {
	private int codigo;
	private String dataCriacao;
	private String descricao;
	
	public Processo(int codigo, String dataCriacao, String descricao) {
		super();
		this.codigo = codigo;
		this.dataCriacao = dataCriacao;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void imprimirDados() {
		System.out.println("===============");
		System.out.println("Código: " + this.codigo);
		System.out.println("Data de criação: " + this.dataCriacao);
		System.out.println("Descrição: " + this.descricao);
	}
}
