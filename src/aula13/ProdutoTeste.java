package aula13;

public class ProdutoTeste {

	public static void main(String[] args) {
		Catalogo catalogo1 = new Catalogo("Loja do José");
		catalogo1.adicionarProduto(1111, "Banana", 2);
		catalogo1.adicionarProduto(222, "Maçã", 3);
		
		catalogo1.exibirProdutos();
		
		catalogo1.atualizarPreco(111, 2.5);
		catalogo1.exibirProdutos();
		
		catalogo1.buscarProduto(222);
		
		catalogo1.removerProduto(1111);
		catalogo1.exibirProdutos();
	}

}
