package aula19;

public class IPVA implements Imposto {

	@Override
	public double calculoImposto(double valorMercadoria) {
		// TODO Auto-generated method stub
		return valorMercadoria + (valorMercadoria * 0.03);
	}

}
