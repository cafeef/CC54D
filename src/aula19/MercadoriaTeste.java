package aula19;

public class MercadoriaTeste {

	public static void main(String[] args) {
		Mercadoria m1 = new Mercadoria(500, new IOF());
		m1.calcularImposto();
	}

}
