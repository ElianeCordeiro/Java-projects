package questao1;

import java.util.Scanner;

public class Retangulo {
	double altura;
	double base;

	Scanner read = new Scanner(System.in);
	
	
	public Retangulo() {
		super();
	}


	public Retangulo(double altura, double base) {
		super();
		this.altura = altura;
		this.base = base;
	}


	void criarRetangulo() {
		System.out.println("Informe a altura do retangulo. ");
		this.altura = read.nextDouble();
		
		System.out.println("Informe a base do retangulo. ");
		this.base = read.nextDouble();
	}

	void calcularArea() {
		double area = this.base * this.altura;
		System.out.println("A area do retangulo é "+area); 
	}

	void calcularPerimetro() {
		double perimetro = (this.altura * 2) + (this.base * 2);
		System.out.println("O perimetro do retangulo é "+perimetro);
	}

}
