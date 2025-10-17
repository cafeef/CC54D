package lista05.ex03;

public class Produto {
	private int codigo;
	private String nome;
	private String marca;
	private String modelo;
	private int quantidadeEstoque;
	private double preco;
	
	public Produto(int codigo, String nome, String marca, String modelo, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
		this.quantidadeEstoque = 0;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
}
