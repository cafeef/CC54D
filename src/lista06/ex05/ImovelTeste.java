package lista06.ex05;

public class ImovelTeste {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua das Flores", 123, "Centro", "São Paulo", "SP");
		Endereco endereco2 = new Endereco("Avenida Brasil", 1001, "Jardim América", "Rio de Janeiro", "RJ");
		
		ImovelNovo imovel1 = new ImovelNovo(10000, endereco1, 500);
		ImovelUsado imovel2 = new ImovelUsado(6000, endereco2, 300);
		
		imovel1.calcularValorFinal();
		imovel2.calcularValorFinal();
		
		imovel1.exibirInformacoes();
		imovel2.exibirInformacoes();
	}

}
