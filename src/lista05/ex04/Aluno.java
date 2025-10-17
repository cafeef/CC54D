package lista05.ex04;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private int ra;
	private String nome;
	private List<Double> notas;
	private double mediaFinal;
	
	public Aluno(int ra, String nome) {
		this.ra = ra;
		this.nome = nome;
		notas = new ArrayList<>();
		this.mediaFinal = 0;
	}
	
	public void adicionarNota(double nota) {
		this.notas.add(nota);
	}
	
	public double getMediaFinal() {
		return mediaFinal;
	}
	
	
	public int getRa() {
		return ra;
	}

	public String getNome() {
		return nome;
	}

	public void calcularMedia() {
		double media = 0;
		for (double nota : this.notas) {
			media += nota;
		}
		media = media / (this.notas.size());
		this.mediaFinal = media;
	}
}
