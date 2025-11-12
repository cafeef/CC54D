package lista07.ex03;

import java.util.ArrayList;
import java.util.List;

import aula10.Endereco;

public class Socio extends Cliente {
	private List<Dependente> dependentes;

	
	public Socio(String nome, String dataNascimento, String telefone, Endereco endereco) {
		super(nome, dataNascimento, telefone, endereco);
		this.dependentes = new ArrayList<>();
	}


	public void adicionarDependente(String nome, String dataNascimento, String telefone, Endereco endereco) {
		Dependente d = new Dependente(nome, dataNascimento, telefone, endereco);
		dependentes.add(d);
	}
}
