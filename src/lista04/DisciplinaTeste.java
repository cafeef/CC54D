package lista04;

public class DisciplinaTeste {
	public static void main(String[] args) {
		Professor p1 = new Professor(000, "Simone de Almeida", "01-09-1998", 12000);
		Disciplina d1 = new Disciplina(111, "Ciência de Dados", "Presencial", 60, p1);
		d1.imprimirRelatorio();
	}
}
