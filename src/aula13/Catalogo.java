package aula13;

import java.util.HashMap;
import java.util.Map;

public class Catalogo {
	private String nome;
	private Map<Integer, Produto> catalogo;
	
	public Catalogo(String nome) {
		this.nome = nome;
		this.catalogo = new HashMap<>();
	}
	
	public void adicionarProduto(Integer codigo, String nome, double preco) {
		Produto produto = new Produto(codigo, nome, preco);
		catalogo.put(codigo, produto);
	}
	
	public void exibirProdutos() {
		for (Integer codigo : catalogo.keySet()) {
			Produto produto = catalogo.get(codigo);
			System.out.println("Código: " + produto.getCodigo());
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Preço: R$" + produto.getPreco());
		}
	}
	
	public void buscarProduto(Integer codigo) {
		if(catalogo.containsKey(codigo)) {
			System.out.println("Produto encontrado no catálogo.");
			Produto produto = catalogo.get(codigo);
			System.out.println("Código: " + produto.getCodigo());
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Preço: R$" + produto.getPreco());
		}
		else {
			System.out.println("Produto não encontrado no catálogo.");
		}
	}
	
	public void atualizarPreco(Integer codigo, double preco) {
		if(catalogo.containsKey(codigo)) {
			Produto produto = catalogo.get(codigo);
			produto.setPreco(preco);
			System.out.println("Preço do produto " + produto.getCodigo() + " alterado com sucesso");
		}
		else {
			System.out.println("Produto não encontrado no catálogo.");
		}
	}
	
	public void removerProduto(Integer codigo) {
		if(catalogo.containsKey(codigo)) {
			catalogo.remove(codigo);
			System.out.println("Produto " + codigo + " removido com sucesso!");
		}
		else {
			System.out.println("Produto não encontrado no catálogo.");
		}
	}
}
