package aula11;

public class Pedido {
	
	//atributos de Pedido
	private int id;
	private String data;
	private Status statusPedido;
	
	
	//método construtor
	public Pedido(int id, String data) {
		this.id = id;
		this.data = data;
		this.statusPedido = Status.AGUARDANDO_PAGAMENTO;
	}
	
	public void atualizarStatus(Status statusAtual) {
		this.statusPedido = statusAtual;
	}
	
	public void imprimirPedido() {
		System.out.println("ID: " + this.id);
		System.out.println("Data: " + this.data);
		System.out.println("Status: " + this.statusPedido);
	}
}
