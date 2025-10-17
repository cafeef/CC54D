package lista05.ex03;

import java.util.HashMap;
import java.util.Map;

public class Loja {
	private String cnpj;
	private String razaoSocial;
	private Map<Integer, Produto> produtos;
	
	public Loja(String cnpj, String razaoSocial) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.produtos = new HashMap<>();
	}
	
	public void cadastrarProduto(int quantidade, int codigo, String nome, String marca, String modelo, double preco) {
		Produto produto;
		if (produtos.containsKey(codigo)) {
			produto = produtos.get(codigo);
			adquirirProduto(quantidade, codigo);
		}
		else {
			produto = new Produto(codigo, nome, marca, modelo, preco);
			produtos.put(codigo, produto);
		}
	}
	
	public void adquirirProduto(int quantidade, int codigo) {
		Produto produto;
		if (produtos.containsKey(codigo)) {
			produto = produtos.get(codigo);
			produto.setQuantidadeEstoque((produto.getQuantidadeEstoque() + quantidade));
		}
		else {
			System.out.println("Produto" + codigo + " não encontrado na base de dados.");
		}
	}
	
	public void exibirProdutos() {
		Produto produto;
		System.out.println("Imprimindo a base de produtos...\n========");
		System.out.println("Loja: " + this.razaoSocial);
		System.out.println("CNPJ: " + this.cnpj);
		for (Integer codigo : produtos.keySet()) {
			produto = produtos.get(codigo);
			System.out.println("\nCódigo: " + produto.getCodigo());
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Modelo: " + produto.getModelo());
			System.out.println("Marca: " + produto.getMarca());
			System.out.println("Preco: " + produto.getPreco());
			System.out.println("Quantidade de Estoque: " + produto.getQuantidadeEstoque());
		}
		System.out.println("========");
	}
	
	public void venderProduto(int codigo, int quantidade) {
		if (produtos.containsKey(codigo)) {
			Produto produto = produtos.get(codigo);
			if (produto.getQuantidadeEstoque() >= quantidade) {
				produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidade);
				System.out.println(quantidade + " de " + produto.getNome() + " vendido(os) com sucesso!");
			}
			else {
				System.out.println("Não é possível realizar a venda, quantidade de " + produto.getNome() + " insuficiente.");
			}
		}
	}
}
