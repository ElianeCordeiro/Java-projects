package classeLivro;

public class Editora {

	private long cnpj, telefone;
	private String nome, endereco;
	public Editora(long cnpj, long telefone, String nome, String endereco) {
		super();
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	
	@Override
	public String toString() {
		return "Editora [cnpj=" + cnpj + ", telefone=" + telefone + ", nome=" + nome + ", endereco=" + endereco + "]";
	}


	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
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
