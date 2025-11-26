package aula19;

public class inss implements Imposto {

	@Override
	public double calculoImposto(double valorMercadoria) {
		return valorMercadoria + (valorMercadoria * 0.11);
	}

}
