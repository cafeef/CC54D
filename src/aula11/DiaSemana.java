package aula11;

public enum DiaSemana {
	DOMINGO(1, "Domingo"),
	SEGUNDA(2, "Segunda-feira"),
	TERCA(3, "Terça-feira"),
	QUARTA(4, "Quarta-feira"),
	QUINTA(5, "Quinta-feira"),
	SEXTA(6, "Sexta-feira"),
	SABADO(7, "Sábado");

	private int diaSemanaNumerico;
	private String diaSemanaExtenso;
	
	
	private DiaSemana(int diaSemanaNumerico, String diaSemanaExtenso) {
		this.diaSemanaNumerico = diaSemanaNumerico;
		this.diaSemanaExtenso = diaSemanaExtenso;
	}


	public int getDiaSemanaNumerico() {
		return diaSemanaNumerico;
	}


	public void setDiaSemanaNumerico(int diaSemanaNumerico) {
		this.diaSemanaNumerico = diaSemanaNumerico;
	}


	public String getDiaSemanaExtenso() {
		return diaSemanaExtenso;
	}


	public void setDiaSemanaExtenso(String diaSemanaExtenso) {
		this.diaSemanaExtenso = diaSemanaExtenso;
	}
	
	
}
