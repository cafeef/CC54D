package lista04;

public class Disciplina {
	private int codigo;
	private String nome;
	private String modalidade;
	private int cargaHoraria;
	private Professor professor;
	
	
	
	public Disciplina(int codigo, String nome, String modalidade, int cargaHoraria, Professor professor) {
		this.codigo = codigo;
		this.nome = nome;
		this.modalidade = modalidade;
		this.cargaHoraria = cargaHoraria;
		this.professor = professor;
	}



	public void imprimirRelatorio() {
		System.out.println("Código: " + this.codigo);
		System.out.println("Nome: " + this.nome);
		System.out.println("Modalidade: " + this.modalidade);
		System.out.println("Carga Horária: " + this.cargaHoraria);
		System.out.println("======== Dados do professor ========");
		this.professor.imprimirDados();
	}
}
