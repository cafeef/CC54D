package lista06.ex02;

public class ColaboradorTeste {

	public static void main(String[] args) {
		Empregado emp1 = new Empregado(
				"Carlos Silva", 
				"Rua das Flores, 123", 
				"01/03/2020", 
				"Analista de Sistemas", 
				5500.00, 
				1234567
		);
		
		System.out.println("---- DADOS DO EMPREGADO ----");
		emp1.exibirInformacoes();
		
		Estagiario est1 = new Estagiario(
				"Beatriz Costa", 
				"Av. Principal, 456", 
				"15/02/2024", 
				"Estagiária de Marketing", 
				1200.00, 
				987654
		);

		System.out.println("---- DADOS DO ESTAGIÁRIO ----");
		est1.exibirInformacoes();
		
		Empresa empDev = new Empresa(
				"Soluções TI Ltda", 
				"Rua da Tecnologia, 789", 
				"10/01/2023", // Data de início do contrato
				150.00, 
				"Consultoria em Redes", 987654321
		);
		
		System.out.println("---- DADOS DA EMPRESA COLABORADORA ----");
		empDev.exibirInformacoes();
		
		Autonomo auto1 = new Autonomo(
				"Mariana Fernandes", 
				"Alameda dos Anjos, 321", 
				"05/05/2024", // Data de início do contrato
				200.00, 
				"Design Gráfico", 
				11122233344L // 'L' indica que é um número do tipo long
		);
		
		System.out.println("---- DADOS DO AUTÔNOMO ----");
		auto1.exibirInformacoes();
	}

}
