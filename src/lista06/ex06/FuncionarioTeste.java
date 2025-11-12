package lista06.ex06;

public class FuncionarioTeste {

	public static void main(String[] args) {
		// --- Exemplo de Administrativo ---
				// Construtor: (String nome, String registro, double salarioBase, double adicional)
				Administrativo adm1 = new Administrativo(
						"Ana Souza", 
						"ADM123", 
						3000.00, 
						450.00 // Adicional (ex: noturno, periculosidade)
				);
				
				System.out.println("--- DADOS DO ADMINISTRATIVO ---");
				adm1.calcularSalarioFinal(); // Calcula o salário final
				adm1.exibirInformacoes(); // Exibe as informações
				System.out.println("---------------------------------\n");
				
				
				// --- Exemplo de Desenvolvedor ---
				// Construtor: (String nome, String registro, double salarioBase, int numeroProjeto, double bonificacaoProjeto)
				Desenvolvedor dev1 = new Desenvolvedor(
						"Bruno Lima", 
						"DEV456", 
						6500.00, 
						3, // Número de projetos concluídos
						1200.00 // Bonificação por projeto
				);
				
				System.out.println("--- DADOS DO DESENVOLVEDOR ---");
				dev1.calcularSalarioFinal(); // Calcula o salário final
				dev1.exibirInformacoes(); // Exibe as informações
				System.out.println("--------------------------------\n");

				
				// --- Exemplo de Gerente ---
				// Construtor: (String nome, String registro, double salarioBase, double totalLucro, double porcentagemParticipacao)
				Gerente ger1 = new Gerente(
						"Carla Martins", 
						"GER789", 
						12000.00, 
						1500000.00, // Total de lucro da empresa
						1.5 // Porcentagem de participação (1.5%)
				);
				
				System.out.println("--- DADOS DO GERENTE ---");
				ger1.calcularSalarioFinal(); // Calcula o salário final
				ger1.exibirInformacoes(); // Exibe as informações
				System.out.println("--------------------------\n");
	}

}
