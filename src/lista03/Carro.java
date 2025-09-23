package lista03;

public class Carro {
	//atributos
	private int velocidade;
	private String marcha;
	
	//construtor
	public Carro() {
		this.velocidade = 0;
		this.marcha = "Neutro";
	}
	
	//metodos
	public void acelerar() {
		if (this.velocidade >= 130) {
			System.out.println("Não é possível acelerar, você está na velocidade máxima\n");
		}
		else {
			this.velocidade += 5;
			System.out.println("Carro acelerando, velocidade atual: " + this.velocidade);
			//metodo de troca de marcha
			trocarMarcha();
		}
	}
	
	public void desacelerar() {
		if (this.velocidade <= 0) {
			System.out.println("Não é possível desacelerar, o carro está parado\n");
		}
		else {
			this.velocidade -= 5;
			System.out.println("Carro desacelerando, velocidade atual: " + this.velocidade);
			//metodo de troca de marcha
			trocarMarcha();
		}
	}
	
	private void trocarMarcha() {
		if (this.velocidade == 0) {
			this.marcha = "Neutro";
		}
		else if (this.velocidade >= 1 && this.velocidade <= 19) {
			this.marcha = "1° marcha";
		}
		else if(this.velocidade >= 20 && this.velocidade <=39) {
			this.marcha = "2° marcha";
		}
		else if(this.velocidade >= 40 && this.velocidade <= 59) {
			this.marcha = "3° marcha";
		}
		else if(this.velocidade >= 60 && this.velocidade <= 89) {
			this.marcha = "4° marcha";
		}
		else {
			this.marcha = "5° marcha";
		}
	}
	
	public String getMarcha() {
		return this.marcha;
	}
}
