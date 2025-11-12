package lista07.ex02;

public class Boleto extends Pagamento {
	private String dataVencimento;
	private int codigoBarras;
	
	public Boleto(double valorTotal, String dataVencimento, int codigoBarras) {
		super(valorTotal);
		this.dataVencimento = dataVencimento;
		this.codigoBarras = codigoBarras;
	}
	
	public void pagarValorTotal() {
		System.out.println("===============");
		System.out.println("Data de vencimento do boleto: " + this.dataVencimento);
		System.out.println("Código de barras do boleto: " + this.codigoBarras);
	}
	
}
