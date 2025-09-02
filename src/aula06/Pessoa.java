package aula06;

import java.util.Scanner;

public class Pessoa {
	Scanner input = new Scanner(System.in);
	//atributos da classe Pessoa
	String nome;
	String dataNascimento;
	String telefone;
	String email;
	String estadoCivil;
	
	//metodos
	public void cadastrarUsuario() {
		System.out.println("Digite seu nome: ");
		nome = input.next();
		
		System.out.println("Digite sua data de nascimento (dd/mm/aa): ");
		dataNascimento = input.next();
		
		System.out.println("Digite seu telefone: ");
		telefone = input.next();
		
		System.out.println("Digite seu e-mail: ");
		email = input.next();
		
		System.out.println("Digite seu estado civil: ");
		estadoCivil = input.next();
	}

	@Override
	public String toString() {
		return "nome=" + nome + ", dataNascimento=" + dataNascimento + ", telefone="
				+ telefone + ", email=" + email + ", estadoCivil=" + estadoCivil + "]";
	}
	
	
}
