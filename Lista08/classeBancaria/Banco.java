package classeBancaria;

public class Banco {
	
	private int numeroAgencia;
	private String nomeAgencia;
	
	public Banco(int numeroAgencia, String nomeAgencia) {
		super();
		this.numeroAgencia = numeroAgencia;
		this.nomeAgencia = nomeAgencia;
	}
	
	public int getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public String getNomeAgencia() {
		return nomeAgencia;
	}
	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	@Override
	public String toString() {
		return "Banco [numeroAgencia=" + numeroAgencia + ", nomeAgencia=" + nomeAgencia + "]";
	}
	
}
