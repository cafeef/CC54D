package lista02;

public class Aluno {
	//atributos
	long RA;
	String nome, curso, turno, situacao;
	int periodo;
	double coeficiente;
	
	//construtor
	public Aluno(long RA, String nome, String curso, String turno, String situacao, int periodo, double coeficiente) {
		this.RA = RA;
		this.nome = nome;
		this.curso = curso;
		this.turno = turno;
		this.situacao = situacao;
		this.periodo = periodo;
		this.coeficiente = coeficiente;
	}
	
	//metodos
	public void responderChamada() {
		System.out.println(nome + " está respondendo a chamada");
	}
	
	public void fazerAvaliacao() {
		System.out.println(nome + " está está fazendo avaliação");
	}

	@Override
	public String toString() {
		return "RA: " + RA + "\nnome: " + nome + "\ncurso: " + curso + "\nturno: " + turno + "\nsituacao: "
				+ situacao + "\nperiodo: " + periodo + "\ncoeficiente: " + coeficiente;
	}


	
}
