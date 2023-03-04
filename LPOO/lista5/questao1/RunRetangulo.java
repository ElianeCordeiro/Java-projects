package questao1;

import java.util.Scanner;

public class RunRetangulo {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		Retangulo r1 = new Retangulo(5, 8);
		
		int menu;
		do {
			System.out.println("--------------------------\nEscolha uma das seguintes opções: " + "1. Criar um retângulo(Informe base e altura);"
					+ "2. Calcular área;" + "3. Calcular perímetro;" + "0. Sair;");
			menu = read.nextInt();
			if (menu == 1) {
				r1.criarRetangulo();
			} else if (menu == 2) {
				r1.calcularArea();
			} else if (menu == 3) {
				r1.calcularPerimetro();
			} else if (menu == 0) {
				System.out.println("Programa encerrado\n------------------------");
			} else {
				System.out.println("ERRO");}
		} while(menu!=0);
	}
		

}
