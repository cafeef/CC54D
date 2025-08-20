package aula03;

public class PessoaTeste {

	public static void main(String[] args) {
		//criação de pessoas
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		
		//atribuindo características p1
		p1.nome = "João";
		p1.idade = 25;
		p1.peso = 68.5;
		
		//atribuindo características p2
		p2.nome = "Maria";
		p2.idade = 30;
		p2.peso = 55.6;
		
		//atribuindo características p3
		p3.nome = "José";
		p3.idade = 32;
		p3.peso = 62.4;
		
		System.out.printf("Nome: %s | Idade: %d | Peso: %.2f\n", p1.nome, p1.idade, p1.peso);
		System.out.printf("Nome: %s | Idade: %d | Peso: %.2f\n", p2.nome, p2.idade, p2.peso);
		System.out.printf("Nome: %s | Idade: %d | Peso: %.2f\n", p3.nome, p3.idade, p3.peso);

	}

}
