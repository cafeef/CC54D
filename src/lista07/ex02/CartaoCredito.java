package lista07.ex02;

public class CartaoCredito extends Pagamento {
	private String numeroCartao;
	private String nometitular;
	private String dataValidade;
	private int codigoSeguranca;
	
	public CartaoCredito(double valorTotal, String numeroCartao, String nometitular, String dataValidade,
			int codigoSeguranca) {
		super(valorTotal);
		this.numeroCartao = numeroCartao;
		this.nometitular = nometitular;
		this.dataValidade = dataValidade;
		this.codigoSeguranca = codigoSeguranca;
	}
	
	@Override
	public void pagarValorTotal() {
		System.out.println("===============");
		System.out.println("Número do cartão: " + this.numeroCartao);
		System.out.println("Titular do cartão: " + this.nometitular);
		System.out.println("Data de validade do cartão: " + this.dataValidade);
		System.out.println("Código de segurança do cartão: " + this.codigoSeguranca);
	}
	
}
