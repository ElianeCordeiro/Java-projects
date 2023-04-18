package animais;

public class Peixe extends Animal{

	private boolean barbatanas;
	private boolean cauda;
	
	public Peixe(String nome, long comprimento, int numero_patas, String cor, String ambiente, float velocidade_ms,
			boolean barbatanas, boolean cauda) {
		super(nome, comprimento, numero_patas, cor, ambiente, velocidade_ms);
		this.barbatanas = barbatanas;
		this.cauda = cauda;
	}

	public boolean isBarbatanas() {
		return barbatanas;
	}

	public void setBarbatanas(boolean barbatanas) {
		this.barbatanas = true;
	}

	public boolean isCauda() {
		return cauda;
	}

	public void setCauda(boolean cauda) {
		this.cauda = true;
	}

	@Override
	public int getNumero_patas() {
		return super.getNumero_patas();
	}

	@Override
	public void setNumero_patas(int numero_patas) {
		this.setNumero_patas(0);
	}

	@Override
	public String getCor() {
		return super.getCor();
	}

	@Override
	public void setCor(String cor) {
		this.setCor("Cinzento");
	}

	@Override
	public String getAmbiente() {
		return super.getAmbiente();
	}

	@Override
	public void setAmbiente(String ambiente) {
		this.setAmbiente("Mar");
	}


	
}
