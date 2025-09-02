package aula06;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria();
		ContaBancaria conta2 = new ContaBancaria();
		ContaBancaria conta3 = new ContaBancaria();

		conta1.cadastrarConta("João");
		conta2.cadastrarConta("Maria");
		conta3.cadastrarConta("Roberto");
		
		System.out.println(conta1);
		System.out.println(conta2);
		System.out.println(conta3);
		
		System.out.println("Quantidade de contas cadastradas: " + ContaBancaria.quantidadeContas);

	}

}
