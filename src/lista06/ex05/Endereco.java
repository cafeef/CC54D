package lista06.ex05;

public class Endereco {
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String uf;
	
	public Endereco(String logradouro, int numero, String bairro, String cidade, String uf) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}
	
	public void exibirEndereco() {
		System.out.println(this.logradouro + ", " + this.numero + " - " + this.bairro + ", " + this.cidade + " - " + this.uf);
	}
}
