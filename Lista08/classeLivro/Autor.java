package classeLivro;

public class Autor {

	private long cpf;
	private String nome, endereco;
	
	public Autor(long cpf, String nome, String endereco) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
	}
	

	@Override
	public String toString() {
		return "Autor [cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + "]";
	}


	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
