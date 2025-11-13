package lista07.ex04;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Professor professor1 = new Professor("123", "Vinicus Camargo Andrade", "12/03/2003", 10000.0, Titulacao.DOUTOR);
		professor1.receberDisciplina(122, "POO", "Programação Orientada a Objetos", 60);
		professor1.receberDisciplina(133, "BD1", "Banco de Dados 1", 60);
		
		professor1.imprimirDados();
		
		professor1.retirarDisciplina(133);
		
		TecnicoAdministrativo tecnico1 = new TecnicoAdministrativo("1234", "Eduardo Fonsesca", "05/10/2005", 6000, 500);
		tecnico1.receberProcesso(1, "13/11/2025", "Troca de cabos de internet");
		tecnico1.receberProcesso(2, "09/12/2025", "Formatação de máquinas lab 5");
		tecnico1.imprimirDados();
		
		tecnico1.retirarProcesso(2);
		tecnico1.imprimirDados();
		
	}

}
