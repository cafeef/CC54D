package lista05.ex05;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
	private int quantidadeVagas;
	private List<Vaga> vagas; 
	
	public Estacionamento() {
		this.quantidadeVagas = 5;
		vagas = new ArrayList<>(quantidadeVagas);
		for (int i = 1; i <= quantidadeVagas; i++) {
			Vaga vaga = new Vaga(i);
			vagas.add(vaga);
			System.out.println("Vaga " + i + " adicionada com sucesso!");
		}
	}
	
	public Vaga verificarVagaExistente() {
		for (Vaga vaga : vagas) {
			if (vaga.getVeiculo() == null) {
				return vaga;
			}
		}
		return null;
	}
	
	public void estacionarVeiculo(int horaIngresso, String placa, String modelo, String cor) {
		Vaga vaga = verificarVagaExistente();
		if (vaga != null) {
			vaga.adicionarVeiculo(horaIngresso, placa, modelo, cor);
			System.out.println(vaga.getVeiculo().getModelo() + " estacionado na vaga " + vaga.getNumeroIdentificacao() +  " com sucesso!");
		}
		else {
			System.out.println("Não há vagas disponíveis.");
		}
	}
	
	public void retirarVeiculo(int horaSaida, String placa) {
	    for (Vaga vaga : vagas) {
	        // Verifica primeiro se a vaga não está vazia
	        if (vaga.getVeiculo() != null && vaga.getVeiculo().getPlaca().equals(placa)) {
	            System.out.println(vaga.getVeiculo().getModelo() + " retirado da vaga " + vaga.getNumeroIdentificacao() +  " com sucesso!");
	            vaga.retirarVeiculo(horaSaida);
	            return; // Encontrou e removeu o veículo, pode sair do método
	        }
	    }
	    // Se o loop terminar e não encontrar, imprime a mensagem
	    System.out.println("Não há um veículo com essa placa estacionado.");
	}
}
