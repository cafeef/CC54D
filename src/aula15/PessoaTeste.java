package aula15;

public class PessoaTeste {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Fernanda", 18, "BCC");
		aluno1.imprimirDados();
		aluno1.realizarMatricula();
		
		Professor professor1 = new Professor("Vinicius", 35, 15000, 20000);
		professor1.imprimirDados();
	}

}
