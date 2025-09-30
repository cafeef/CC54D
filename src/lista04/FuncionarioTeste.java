package lista04;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Endereco ed1 = new Endereco("Flores", 44, "Margarida", "Sol", "US");
		Funcionario f1 = new Funcionario(111, "Fernanda", "05/09/2006", "Feminino", "Design", "222", ed1);
		f1.imprimirRelatorio();
	}

}
