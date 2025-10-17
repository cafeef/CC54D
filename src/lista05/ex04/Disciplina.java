package lista05.ex04;

import java.util.HashMap;
import java.util.Map;

public class Disciplina {
	private String nome;
	private Map<Integer, Aluno> alunos;
	
	//método construtor para Disciplina.
	public Disciplina(String nome) {
		this.nome = nome;
		alunos = new HashMap<>();
	}
	
	//metodos da disciplina
	public void matricularAlunos(int ra, String nome) {
		Aluno aluno = new Aluno(ra, nome);
		alunos.put(ra, aluno);
	}
	
	public void lancarNotas(int ra, double nota) {
		if (alunos.containsKey(ra)) {
			Aluno aluno = alunos.get(ra);
			aluno.adicionarNota(nota);
		}
	}
	
	public void calcularMediaAlunos() {
		for (int ra : alunos.keySet()) {
			Aluno aluno = alunos.get(ra);
			aluno.calcularMedia();
		}
	}
	
	public void calcularMediaDisciplina() {
		double mediaNotaAlunos = 0;
		for (int ra : alunos.keySet()) {
			Aluno aluno = alunos.get(ra);
			if (aluno.getMediaFinal() == 0) {
				aluno.calcularMedia();
			}
			mediaNotaAlunos += aluno.getMediaFinal();
			System.out.println("Média aluno " + aluno.getNome() + ": " + aluno.getMediaFinal());
			System.out.println("Situação: ");
			if (aluno.getMediaFinal() >= 6) {
				System.out.println("APROVADO");
			}
			else {
				System.out.println("REPROVADO");
			}
		}
		mediaNotaAlunos = mediaNotaAlunos / alunos.size();
		System.out.println("A média da disciplina é: " + mediaNotaAlunos);
	}
}
