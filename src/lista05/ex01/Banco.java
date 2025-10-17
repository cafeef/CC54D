package lista05.ex01;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<ContaBancaria> contas;
	
	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
	}
	
	public void adicionarConta(int numeroConta, String nomeTitular, String cpfTitular) {
		Titular titular = new Titular(nomeTitular, cpfTitular);
		ContaBancaria conta = new ContaBancaria(numeroConta, titular);
		contas.add(conta);
		System.out.println("Conta " + numeroConta + " adicionada com sucesso!");
	}
	
	public ContaBancaria verificarContaExistente(int numeroConta) {
		for (ContaBancaria conta : this.contas) {
			if (conta.getNumeroConta() == numeroConta) {
				return conta;
			}
		}
		return null;
	}
	
	public void realizarSaque(int numeroConta, double valor) {
		ContaBancaria conta = verificarContaExistente(numeroConta);
		if (conta != null) {
			conta.sacar(valor);
		}
		else {
			System.out.println("\nConta não existente.");
		}
	}
	
	public void realizarDeposito(int numeroConta, double valor) {
		ContaBancaria conta = verificarContaExistente(numeroConta);
		if (conta != null) {
			conta.depositar(valor);
		}
		else {
			System.out.println("\nConta não existente.");
		}
	}
	
	public void imprimirConta(int numeroConta) {
		ContaBancaria conta = verificarContaExistente(numeroConta);
		if (conta != null) {
			System.out.println("\nImprimindo informações da conta: ");
			conta.imprimirConta();
		}
		else {
			System.out.println("\nConta não existe.");
		}
	}
}
