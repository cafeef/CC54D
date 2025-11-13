package lista07.ex04;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario{
	private Titulacao titulacao;
	private List<Disciplina> disciplinas;
	
	public Professor(String registro, String nome, String dataAdmissao, double salarioBase, Titulacao titulacao) {
		super(registro, nome, dataAdmissao, salarioBase);
		this.titulacao = titulacao;
		this.disciplinas = new ArrayList<>();
	}
	
	public void receberDisciplina(int codigo, String nomeDisciplina, String ementa, int cargaHoraria) {
		Disciplina disciplina = new Disciplina(codigo, nomeDisciplina, ementa, cargaHoraria);
		disciplinas.add(disciplina);
	}
	
	public void retirarDisciplina(int codigo) {
		for (Disciplina disciplina : disciplinas) {
			if (disciplina.getCodigo() == codigo) {
				disciplinas.remove(disciplina);
				System.out.println("Disciplina " + codigo + " retirada com sucesso.");
				return;
			}
		}
		System.out.println("Disciplina " + codigo + " inexistente.");
	}
	
	@Override
	protected double calcularSalario() {
		double salarioTotal = 0;
		// validando a titulação
		switch (this.titulacao) {
		case MESTRE:
			salarioTotal = this.salarioBase + 1000;
			break;
		case DOUTOR:
			salarioTotal = this.salarioBase + 2000;
			break;
		}
		
		// calculando o total de horas ministradas
		// percorrendo todas as disciplinas ministradas e somando a carga horária
		int somaHoras = 0;
		for (Disciplina disciplina : disciplinas) {
			somaHoras += disciplina.getCargaHoraria();
		}
		salarioTotal = salarioTotal + (somaHoras * 15);
		return salarioTotal;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Titulação: " + this.titulacao);
		System.out.println("Salário total: " + this.calcularSalario());
	}
}
