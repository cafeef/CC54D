package lista04;

public class Endereco {
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String uf;
	
	
	public Endereco(String logradouro, int numero, String bairro, String cidade, String uf) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}

	public void imprimirEndereco() {
		System.out.println(this.logradouro + ", " + this.numero + " - " + this.bairro + ", " + this.cidade + " - " + this.uf);
	}
}
