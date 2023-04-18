package animais;

public class Mamifero extends Animal{
	
	private String alimento;

	public Mamifero(String nome, long comprimento, int numero_patas, String cor, String ambiente, float velocidade_ms,
			String alimento) {
		super(nome, comprimento, numero_patas, cor, ambiente, velocidade_ms);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String getAmbiente() {
		return this.getAlimento();
	}

	@Override
	public void setAmbiente(String ambiente) {
		this.setAlimento("Terra");
	}
	
	
}
