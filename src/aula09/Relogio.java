package aula09;

public class Relogio {
	//atributos
	private String marca;
	private int hora;
	private int minutos;
	
	//metodo construtor
	public Relogio(String marca, int hora, int minutos) {
		this.marca = marca;
		setHora(hora);
		setMinutos(minutos);
	}

	private int getHora() {
		return hora;
	}

	private void setHora(int hora) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;			
		}
		else {
			System.out.println("Não é possível definir a hora.");
		}
	}

	private int getMinutos() {
		return minutos;
	}

	private void setMinutos(int minutos) {
		if (minutos >= 0 && minutos <= 59) {
			this.minutos = minutos;
		}
		else {
			System.out.println("Não é possível definir os minutos.");
		}
	}

	private String getMarca() {
		return marca;
	}
}
