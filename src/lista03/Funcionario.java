package lista03;

public class Funcionario {
	//atributos de funcionario
	private int numeroRegistro;
	private String nomeCompleto;
	private String dataNascimento;
	private String sexo;
	private String setor;
	private String telefone;
	private String rua, bairro, cidade, estado, endereco;
	private int numero;
	
	//metodo construtor
	public Funcionario(int numeroRegistro, String nomeCompleto, String dataNascimento, String sexo, String setor, String telefone, String rua, int numero, String bairro, String cidade, String estado) {
		setNumeroRegistro(numeroRegistro);
		setNomeCompleto(nomeCompleto);
		setDataNascimento(dataNascimento);
		setSexo(sexo);
		setSetor(setor);
		setTelefone(telefone);
		setEndereco(rua, numero, bairro, cidade, estado);
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	private void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	private void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	private void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	private void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	private String getEndereco() {
		return endereco;
	}
	
	private void setEndereco(String rua, int numero, String bairro, String cidade, String estado) {
		StringBuilder builder = new StringBuilder();
		builder.append(rua);
		builder.append(", ");
		builder.append(numero);
		builder.append(" - ");
		builder.append(bairro);
		builder.append(", ");
		builder.append(cidade);
		builder.append(" - ");
		builder.append(estado);
		String endereco = builder.toString();
		this.endereco = endereco;
	}
	
	public void relatorioFuncionario() {
		System.out.printf("Número de Registro: %d\nNome: %s\nData de nascimento: %s\nSexo: %s\nSetor: %s\nTelefone: %s\nEndereço: %s\n", getNumeroRegistro(), getNomeCompleto(), getDataNascimento(), getSexo(), getSetor(), getTelefone(), getEndereco());
	}
}
