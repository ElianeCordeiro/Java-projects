package questao3;

public class Circulo {

	private double raio;
	private final double PI = 3.14;
	

	public Circulo(int raio) {
		super();
		this.raio = raio;
	}
	
	void calcularArea() {
		double area = (raio*raio) * PI;
		System.out.println("Área: "+area);
	}
	
	void calcularPerimetro() {
		double perimetro = 2 * PI * raio;
		System.out.println("Perímetro: "+perimetro);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	
}
