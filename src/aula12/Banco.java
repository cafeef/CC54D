package aula12;

import java.util.List;
import java.util.ArrayList;

public class Banco {
	private String cnpj;
	private String nomeBanco;
	private List<ContaBancaria> contas;
	
	public Banco(String cnpj, String nomeBanco) {
		this.cnpj = cnpj;
		this.nomeBanco = nomeBanco;
		this.contas = new ArrayList<>();
	}
	
	public void adicionarNovaConta(int numeroConta, String nomeTitular) {
		ContaBancaria contaBancaria = verificarContaExistente(numeroConta);
		if (contaBancaria == null) {
			ContaBancaria cb = new ContaBancaria(numeroConta, nomeTitular);
			contas.add(cb);
			System.out.println("Conta " + numeroConta + " criada com sucesso!");
		}
		else {
			System.out.println("O número da conta já existe!");
		}
		
	}
	
	public ContaBancaria verificarContaExistente(int numeroConta) {
		for (ContaBancaria contaBancaria : this.contas) {
			if (contaBancaria.getNumeroConta() == numeroConta) {
				return contaBancaria;
			}
		}
		return null;
	}
	
	public void excluirConta(int numeroConta) {
		ContaBancaria contaBancaria = this.verificarContaExistente(numeroConta);
		if (contaBancaria != null) {
				this.contas.remove(contaBancaria);
				System.out.println("Conta " + numeroConta + " excluída com sucesso!");
		}		
		else System.out.println("Conta inexistente!");
	}
	
	public void verificarSaldo(int numeroConta) {
		ContaBancaria contaBancaria = this.verificarContaExistente(numeroConta);
		if (contaBancaria != null) {
			contaBancaria.imprimirSaldo();
			return;
		}		
		else System.out.println("Conta inexistente!");
	}
	
	public void efetuarSaque(int numeroConta, double valor) {
		ContaBancaria contaBancaria = this.verificarContaExistente(numeroConta);
		if (contaBancaria != null) {
			contaBancaria.sacar(valor);
		}
		else System.out.println("Conta inexistente!");
	}
	
	public void efetuarDeposito(int numeroConta, double valor) {
		ContaBancaria contaBancaria = this.verificarContaExistente(numeroConta);
		if (contaBancaria != null) {
			contaBancaria.depositar(valor);
		}
		else System.out.println("Conta inexistente!");
	}
	
}
