package aula19;

public class IOF implements Imposto {

	@Override
	public double calculoImposto(double valorMercadoria) {
		// TODO Auto-generated method stub
		return valorMercadoria + (valorMercadoria * 0.06);
	}

}
