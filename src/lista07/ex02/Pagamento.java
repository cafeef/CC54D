package lista07.ex02;

public abstract class Pagamento {
	protected double valorTotal;

	public Pagamento(double valorTotal) {
		super();
		this.valorTotal = valorTotal;
	}
	
	public abstract void pagarValorTotal();
}
