package lista05.ex01;

public class BancoTeste {

	public static void main(String[] args) {
		Banco banco1 = new Banco("BB");
		banco1.adicionarConta(1, "Fernanda", "123");
		banco1.imprimirConta(1);
		banco1.realizarDeposito(1, 200);
		banco1.imprimirConta(2);
		
		System.out.println("===============");
		
		banco1.adicionarConta(2, "Lucas", "456");
		banco1.imprimirConta(2);
		banco1.realizarDeposito(2, 400);
		banco1.imprimirConta(2);
	}

}
