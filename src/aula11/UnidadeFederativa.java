package aula11;

public enum UnidadeFederativa {
	PR("Paraná", "Curitiba"),
	SC("Santa Catarina", "Florianópolis"),
	RS("Rio Grande do Sul", "Porto Alegre"),
	ES("Espírito Santo", "Vitória"),
	MG("Minas Gerais", "Belo Horizonte"),
	RJ("Rio de Janeiro", "Rio de Janeiro"),
	SP("São Paulo", "São Paulo");
	
	
	private String estadoExtenso;
	private String capital;
	
	
	private UnidadeFederativa(String estadoExtenso, String capital) {
		this.estadoExtenso = estadoExtenso;
		this.capital = capital;
	}


	public String getEstadoExtenso() {
		return estadoExtenso;
	}


	public void setEstadoExtenso(String estadoExtenso) {
		this.estadoExtenso = estadoExtenso;
	}


	public String getCapital() {
		return capital;
	}


	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	
	
}
