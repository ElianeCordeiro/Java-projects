package quadrilatero;

public class Retangulo extends Quadrilatero{
	
	private float lado;
	private float altura;

	public Retangulo(float lado, float altura) {
		super();
		this.lado = lado;
		this.altura = altura;
	}

	public float calcularArea() {
		float area = this.lado * this.altura;
		return area;
	}

	public float calcularPerimetro() {
		float perimetro = this.lado * 2 + this.altura * 2;
		return perimetro;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	
}
