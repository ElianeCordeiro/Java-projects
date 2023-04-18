package animais;

public class Animal {
	
	private String nome;
	private long comprimento;
	private int numero_patas;
	private String cor;
	private String ambiente;
	private float velocidade_ms;
	
	public Animal(String nome, long comprimento, int numero_patas, String cor, String ambiente, float velocidade_ms) {
		super();
		this.nome = nome;
		this.comprimento = comprimento;
		this.numero_patas = numero_patas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade_ms = velocidade_ms;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getComprimento() {
		return comprimento;
	}

	public void setComprimento(long comprimento) {
		this.comprimento = comprimento;
	}

	public int getNumero_patas() {
		return numero_patas;
	}

	public void setNumero_patas(int numero_patas) {
		this.numero_patas = 4;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public float getVelocidade_ms() {
		return velocidade_ms;
	}

	public void setVelocidade_ms(float velocidade_ms) {
		this.velocidade_ms = velocidade_ms;
	}
	
	
}
