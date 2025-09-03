package lista01;

public class NotebookTeste {

	public static void main(String[] args) {
		notebook notebook1 = new notebook("Acer", "Nitro 5", "Intel 5", 14, 8, 256);
		notebook notebook2 = new notebook("Dell", "Home", "Intel 3", 11, 8, 128);
		notebook notebook3 = new notebook("Acer", "Aspire", "Intel 7", 17, 16, 520);
		notebook1.ligar();
		notebook2.processarInformacoes();
		notebook3.conectarInternet();
	}

}
