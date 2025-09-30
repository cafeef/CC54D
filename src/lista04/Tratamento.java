package lista04;

public class Tratamento {
	
	private String descricao;
	private String dataInicio;
	private String dataFim;
	
	public Tratamento(String descricao, String dataInicio) {
		this.descricao = descricao;
		this.dataInicio = dataInicio;
	}
	
	public void imprimirDados() {
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Data de Início: " + this.dataInicio);
		System.out.println("Data Fim: " + this.dataFim);
	}
	
}
