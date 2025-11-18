package aula19;

public class irpf implements Imposto {

	@Override
	public double calculoImposto(double valorMercadoria) {
		return valorMercadoria + (valorMercadoria * 0.075);
	}

}
