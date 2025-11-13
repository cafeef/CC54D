package lista07.ex04;

import java.util.ArrayList;
import java.util.List;

public class TecnicoAdministrativo extends Funcionario{
	private double adicionalNoturno;
	private List<Processo> processos;

	public TecnicoAdministrativo(String registro, String nome, String dataAdmissao, double salarioBase,
			double adicionalNoturno) {
		super(registro, nome, dataAdmissao, salarioBase);
		this.adicionalNoturno = adicionalNoturno;
		this.processos = new ArrayList<>();
	}
	
	public void receberProcesso(int codigo, String dataCriacao, String descricao) {
		Processo processo = new Processo(codigo, dataCriacao, descricao);
		this.processos.add(processo);
		System.out.println("Processo " + codigo + " recebido com sucesso.");
	}
	
	public void retirarProcesso(int codigo) {
		for (Processo processo : this.processos) {
			if (processo.getCodigo() == codigo) {
				processos.remove(processo);
				System.out.println("Processo " + codigo + " retirado com sucesso.");
				return;
			}
		}
		System.out.println("Processo não encontrado.");
	}
	
	@Override
	protected double calcularSalario() {
		return this.salarioBase + this.adicionalNoturno;
	}
	
	public void imprimirProcessos() {
		for (Processo processo : this.processos) {
			processo.imprimirDados();
		}
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Adicional noturno: R$" + this.adicionalNoturno);
		System.out.println("salário total: R$" + this.calcularSalario());
		
		System.out.println("Imprimindo informações dos processos atribuídos...\n===============");
		this.imprimirProcessos();
	}
	
}
