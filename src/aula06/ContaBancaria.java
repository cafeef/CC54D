package aula06;

import java.util.Scanner;

public class ContaBancaria {
	Scanner input = new Scanner(System.in);
	
	int numeroConta;
	String nomeTitular;
	double saldo;
	static int quantidadeContas = 0;
	
	public void cadastrarConta(String nome) {
		nomeTitular = nome;
		saldo = 0;
		numeroConta = quantidadeContas + 1;
		quantidadeContas++;
	}

	@Override
	public String toString() {
		return "ContaBancaria [numeroConta=" + numeroConta + ", nomeTitular=" + nomeTitular + ", saldo=" + saldo + "]";
	}
	
	
}
