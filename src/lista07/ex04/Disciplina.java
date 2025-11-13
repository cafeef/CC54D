package lista07.ex04;

public class Disciplina {
	private int codigo;
	private String nomeDisciplina;
	private String ementa;
	private int cargaHoraria;
	
	public Disciplina(int codigo, String nomeDisciplina, String ementa, int cargaHoraria) {
		super();
		this.codigo = codigo;
		this.nomeDisciplina = nomeDisciplina;
		this.ementa = ementa;
		this.cargaHoraria = cargaHoraria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
}
