package aula12;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		Banco banco1 = new Banco("123456789", "Banco UTFPR");
		banco1.adicionarNovaConta(111, "João da Silva");
		banco1.adicionarNovaConta(222, "Maria de Oliveira");
		banco1.adicionarNovaConta(222, "Ricardo Carvalho");
		
		banco1.verificarSaldo(222);
		banco1.efetuarDeposito(222, 100);
		banco1.verificarSaldo(222);
		banco1.efetuarSaque(222, 100);
		banco1.verificarSaldo(222);
	}

}
