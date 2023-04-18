package quadrilatero;

public class Circulo extends Quadrilatero {

	private float raio;
	private final float PI = (float) 3.14;
	
	public Circulo(float raio) {
		super();
		this.raio = raio;
	}

	public float calcularArea() {
		float area = (this.raio * this.raio) * PI;
		return area;
	}

	public float calcularPerimetro() {
		float perimetro = 2 * PI * this.raio;
			return perimetro;
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	
}
