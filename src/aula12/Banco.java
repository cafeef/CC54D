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
		if (this.verificarContaExistente(numeroConta) == false) {
			ContaBancaria cb = new ContaBancaria(numeroConta, nomeTitular);
			contas.add(cb);
			System.out.println("Conta " + numeroConta + " criada com sucesso!");
		}
		else {
			System.out.println("O número da conta já existe!");
		}
		
	}
	
	public boolean verificarContaExistente(int numeroConta) {
		for (int i = 0; i < contas.size(); i++) {
			ContaBancaria cb = this.contas.get(i);
			if (cb.getNumeroConta() == numeroConta) {
				return true;
			}
		}
		return false;
	}
	
	public void excluirConta(int numeroConta) {
		boolean existe = this.verificarContaExistente(numeroConta);
		if (existe) {
			for (int i = 0; i < contas.size(); i++) {
				ContaBancaria contaBancaria = this.contas.get(i);
				if (contaBancaria.getNumeroConta() == numeroConta) {
					this.contas.remove(i);
					System.out.println("Conta " + numeroConta + " excluída com sucesso!");
				}
			}			
		}
		else System.out.println("Conta inexistente!");
	}
	
	public void verificarSaldo(int numeroConta) {
		for (int i = 0; i < contas.size(); i++) {
			ContaBancaria contaBancaria = this.contas.get(i);
			if (contaBancaria.getNumeroConta() == numeroConta) {
				this.contas.remove(i);
				System.out.println("Conta: " + numeroConta + "\nSaldo: " + contaBancaria.getSaldo());
				return;
			}
		}
		System.out.println("Conta inexistente!");
	}
}
