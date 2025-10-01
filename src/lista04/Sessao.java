package lista04;

public class Sessao {
	private String data;
	private String horario;
	private int numeroIngressos;
	private Sala sala;
	private Filme filme;
	
	public Sessao(String data, String horario, Sala sala, Filme filme) {
		super();
		this.data = data;
		this.horario = horario;
		this.numeroIngressos = sala.getCapacidadeMaxima();
		this.sala = sala;
		this.filme = filme;
	}
	
	public void venderIngressos(int quantidade) {
		if (numeroIngressos >= quantidade) {
			numeroIngressos -= quantidade;
			System.out.println("Ingressos vendidos com sucesso!");
		}
		else System.out.println("Ingressos insuficientes para a venda");
	}
	
	public void imprimirDados() {
		System.out.println("Data: " + this.data);
		System.out.println("Horário: " + this.horario);
		System.out.println("Número de Ingressos: " + this.numeroIngressos);
		sala.imprimirDados();
		filme.imprimirDados();
	}
}
