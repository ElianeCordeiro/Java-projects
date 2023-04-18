package questao1;

public class Retangulo {
	private double altura;
	private double base;

	public Retangulo(double altura, double base) {
		super();
		this.altura = altura;
		this.base = base;
	}


	double calcularArea() {
		double area = getAltura() * getBase();
		return area;
	}

	double calcularPerimetro() {
		double perimetro = (getAltura() * 2) + (getBase() * 2);
		return perimetro;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}

	
}
