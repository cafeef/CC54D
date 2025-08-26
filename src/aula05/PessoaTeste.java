package aula05;

public class PessoaTeste {

	public static void main(String[] args) {
		// instanciando a classe Pessoa
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		
		//atribuindo caracteristicas para pessoas
		pessoa1.nome = "João";
		pessoa1.idade = 25;
		pessoa1.peso = 68.5;
		
		pessoa2.nome = "Maria";
		pessoa2.idade = 30;
		pessoa2.peso = 55.6;
		
		pessoa3.nome = "José";
		pessoa3.idade = 32;
		pessoa3.peso = 62.4;

		//invocando metodos
		pessoa1.andar();
		pessoa2.correr();
		pessoa3.falar();
		
		
		//debuggando
		System.out.println(pessoa1);
	}

}
