package lista08.ex03;

public class UsuarioTeste {

	public static void main(String[] args) {
		Usuario u1 = new Usuario("Fernanda", "123");
		u1.realizarLogin("Fernanda", "123");
		u1.modificarSenha("1", "Fernanda123", "Fernanda123");

	}

}
