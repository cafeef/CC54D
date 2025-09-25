package aula11;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(123, "Angelo", "456", DiaSemana.TERCA);
		f1.imprimirRelatorio();
		
		System.out.println("===================");
		
		f1.atualizarFolga(DiaSemana.SEXTA);
		f1.imprimirRelatorio();
		
	}

}
