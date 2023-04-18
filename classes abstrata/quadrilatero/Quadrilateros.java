package quadrilatero;

import java.util.ArrayList;
import java.util.Scanner;

public class Quadrilateros {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		ArrayList<Quadrilatero> quadrilateros = new ArrayList<>();

		Quadrilatero retangulo = null;
		Quadrilatero circulo = null;
		Quadrilatero quadrado = null;

		float lado, altura, raio;
		int menu = 1;

		do {
			System.out.println("---------------------------------");
			System.out.println("1. Cadastrar Retângulo;\n2. Cadastrar Círculo;\n"
					+ "3. Cadastrar Quadrado;\n4. Mostrar o valor de todas as áreas\n"
					+ "5. Mostrar o valor de todos os perímetros.");
			menu = read.nextInt();

			switch (menu) {
			case (1):
				System.out.println("Qual o tamanho do lado do retângulo? ");
				lado = read.nextFloat();
				System.out.println("Qual o tamanho da altura do retângulo? ");
				altura = read.nextFloat();
				retangulo = new Retangulo(lado, altura);
				quadrilateros.add(retangulo);
				break;
			case (2):
				System.out.println("Qual o raio do círculo. ");
				raio = read.nextFloat();
				circulo = new Circulo(raio);
				quadrilateros.add(circulo);
				break;
			case (3):
				System.out.println("Qual o tamanho dos lados do quadrado? ");
				lado = read.nextFloat();
				quadrado = new Quadrado(lado, lado);
				quadrilateros.add(quadrado);
				break;
			case (4):
				for (Quadrilatero quadrilatero : quadrilateros) {
					System.out.println("Área: " + quadrilatero.calcularArea());
				}
				break;
			case (5):
				for (Quadrilatero quadrilatero : quadrilateros) {
					System.out.println("Perímetro: " + quadrilatero.calcularPerimetro());
				}
				break;
			}
		} while (menu != 0);
		System.out.println("--------- PROGRAMA ENCERRADO --------");
	}

}
