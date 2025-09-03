package lista02;

public class TelevisaoTeste {

	public static void main(String[] args) {
		Televisao televisao1 = new Televisao("Samsung", 60, "1920x1080");
		Televisao televisao2 = new Televisao("Philco", 32, "1920x1080");
		televisao1.ligar();
		televisao1.aumentarSom();
		System.out.println(televisao1);
		televisao2.aumentarSom();
		System.out.println(televisao1);
	}

}
