package lista07.ex02;

public class PagamentoTeste {

	public static void main(String[] args) {
		CartaoCredito c1 = new CartaoCredito(200, "123456789", "Fernanda", "08/09/2030", 123);
		c1.pagarValorTotal();
		
		Pix p1 = new Pix(500, "41991846699", "Fernanda");
		p1.pagarValorTotal();
		
		Boleto b1 = new Boleto(150, "09/11/2014", 1234510);
		b1.pagarValorTotal();
	}

}
