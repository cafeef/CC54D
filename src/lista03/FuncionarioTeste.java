package lista03;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(1, "João Pedro Carvalho", "05/09/2006", "Masculino", "Produção", "1234" ,"Rua das flores", 110, "Jardim Social", "Curitiba", "PR");
		f1.relatorioFuncionario();
		f1.setSetor("Almoxarifado");
		f1.relatorioFuncionario();
	}

}
