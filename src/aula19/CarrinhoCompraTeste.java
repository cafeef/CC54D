package aula19;

public class CarrinhoCompraTeste {

	public static void main(String[] args) {
		CarrinhoCompra carrinhoCompra1 = new CarrinhoCompra(500, 100, new Correios());
		carrinhoCompra1.realizarCompra();
	}

}
