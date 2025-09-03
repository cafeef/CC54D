package lista02;

import java.util.Scanner;

public class AlunoTeste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Aluno al1 = new Aluno(123, "João", "Engenharia", "Integral", "Regular", 4, 0.85);
		Aluno al2 = new Aluno(456, "Maria", "BCC", "Integral", "Regular", 6, 0.89);
		Aluno al3 = new Aluno(789, "Pedro", "Automação Industrial", "Noturno", "Trancado", 3, 0.72);
		int op = 0;
		while (op != 5) {
			System.out.println("Escolha uma opção:\n1 - Cadastrar alunos\n2- Responder chamada\n3 - Fazer avaliação\n4 - Imprimir relatório\n5 - Sair");
			op = input.nextInt();
			switch (op) {
				case 1: 
					
					break;					
				case 2: 
					al1.responderChamada();
					al2.responderChamada();
					break;
				case 3:
					al3.fazerAvaliacao();
					break;
				case 4:
					System.out.println(al1);
					System.out.println(al2);
					break;
				case 5:
					break;
				default:
					System.out.println("Opção inválida!");
				}				
		}

	}

}
