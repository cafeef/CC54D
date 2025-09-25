package aula11;

public class ClienteTeste {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(123, "Fernanda", "05/09/2006", EstadoCivil.SOLTEIRO);
		cliente1.imprimirCliente();
		
		System.out.println("=================");
		
		cliente1.atualizarEstadoCivil(EstadoCivil.CASADO);
		
		
		cliente1.imprimirCliente();
	}

}
