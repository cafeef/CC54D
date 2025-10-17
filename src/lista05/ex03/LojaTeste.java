package lista05.ex03;

public class LojaTeste {

	public static void main(String[] args) {
		Loja loja1 = new Loja("123", "Loja do vô");
		loja1.cadastrarProduto(2, 1, "Bengala", "Gucci", "Flex", 20);
		loja1.cadastrarProduto(4, 2, "Boina", "Versace", "Donatella", 80);
		loja1.cadastrarProduto(2, 1, "Bengala", "Gucci", "Flex", 20);
		loja1.exibirProdutos();
	}

}
