package lista06.ex03;

public class AlunoTeste {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Fernanda", "05/09/2006", 111, 222);
		pessoa1.exibirInformacoes();
		
		Aluno aluno1 = new Aluno("Fernanda", "05/09/2006", 111, 222, 333);
		aluno1.exibirInformacoes();
	}

}
