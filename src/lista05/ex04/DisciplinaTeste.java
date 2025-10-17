package lista05.ex04;

public class DisciplinaTeste {

	public static void main(String[] args) {
		Disciplina d1 = new Disciplina("Cálculo 1");
		d1.matricularAlunos(1, "Fernanda");
		d1.lancarNotas(1, 3);
		d1.lancarNotas(1, 10);
		
		d1.matricularAlunos(2, "Victor");
		d1.lancarNotas(2, 5);
		d1.lancarNotas(2, 10);
		
		d1.calcularMediaAlunos();
		d1.calcularMediaDisciplina();
	}

}
