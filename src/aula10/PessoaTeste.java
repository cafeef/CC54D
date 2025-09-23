package aula10;

public class PessoaTeste {

	public static void main(String[] args) {
		Endereco end1 = new Endereco("Vicente Machado", 1024, "Centro", "Ponta Grossa", "PR");
		Pessoa p1 = new Pessoa("João da Silva", "01-09-1998", "Masculino", "joao@email.com", "Solteiro", end1);
		
		p1.imprimirDados();
		
	}

}
