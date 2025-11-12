package lista07.ex02;

public class Pix extends Pagamento {
	private String chavePix;
	private String nomeDestinatario;
	
	public Pix(double valorTotal, String chavePix, String nomeDestinatario) {
		super(valorTotal);
		this.chavePix = chavePix;
		this.nomeDestinatario = nomeDestinatario;
	}
	
	public void pagarValorTotal() {
		System.out.println("===============");
		System.out.println("Chave pix: " + this.chavePix);
		System.out.println("Nome do destinatário: " + this.nomeDestinatario);
	}
	
}
