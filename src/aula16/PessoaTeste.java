package aula16;

import java.util.Scanner;


public class PessoaTeste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pessoa pessoa = null;
		int opcao = 0;
		
		System.out.println("Escolha uma das opções:\n1 - Pessoa Física\n2 - Pessoa Jurídica");
		opcao = input.nextInt();
		
		switch (opcao) {
		case 1:
			pessoa = new PessoaFisica("Fernanda", 20000, 500);
			break;
		case 2:
			pessoa = new PessoaJuridica("Tecno", 20, 15000);
			break;

		}
		
		pessoa.calcularImposto();
	}

}
