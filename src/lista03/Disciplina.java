package lista03;

public class Disciplina {
	private int codigo;
	private String nome;
	private String modalidade;
	private int cargaHoraria;
	private String conteudoProgramatico;
	
	//metodo construtor
	public Disciplina(int codigo, String nome, String modalidade, int cargaHoraria, String conteudoProgramatico) {
		setCodigo(codigo);
		setNome(nome);
		setModalidade(modalidade);
		setCargaHoraria(cargaHoraria);
		setConteudoProgramatico(conteudoProgramatico);
	}

	private int getCodigo() {
		return codigo;
	}

	private String getNome() {
		return nome;
	}

	private String getModalidade() {
		return modalidade;
	}

	private int getCargaHoraria() {
		return cargaHoraria;
	}

	private String getConteudoProgramatico() {
		return conteudoProgramatico;
	}

	private void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	private void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public void setConteudoProgramatico(String conteudoProgramatico) {
		this.conteudoProgramatico = conteudoProgramatico;
	}

	@Override
	public String toString() {
		return "Código da disciplina: " + getCodigo() + "\nNome: " + getNome() + "\nModalidade: "
				+ getModalidade() + "\nCarga Horária: " + getCargaHoraria() + "\nConteúdo Programático: "
				+ getConteudoProgramatico();
	}
	
	
	
	
}
