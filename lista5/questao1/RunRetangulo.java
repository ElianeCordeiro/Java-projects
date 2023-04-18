package questao1;

import java.util.Scanner;

public class RunRetangulo {
	
	/*
	 * Criar uma classe que tenha um metodo calcular area do retangulo e outro
	 * calcular perimetro e criar outra classe que obtenha os valores necessarios.
	 */
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		Retangulo r1 = new Retangulo(0, 0);
		
		int menu;
		do {
			System.out.println("--------------------------\nEscolha uma das seguintes opções: " + "1. Criar um retângulo(Informe base e altura);"
					+ "2. Calcular área;" + "3. Calcular perímetro;" + "0. Sair;");
			menu = read.nextInt();
			if (menu == 1) {
				System.out.println("Informe a altura do retangulo. ");
				r1.setAltura(read.nextDouble());
				System.out.println("Informe a base do retangulo. ");
				r1.setBase(read.nextDouble());
			} else if (menu == 2) {
				System.out.println("Área: "+r1.calcularArea());
			} else if (menu == 3) {
				System.out.println("Perimetro: " +r1.calcularPerimetro());
			} else if (menu == 0) {
				System.out.println("Programa encerrado\n------------------------");
			} else {
				System.out.println("ERRO");}
		} while(menu!=0);
	}
		

}
