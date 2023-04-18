package questao3;

import java.util.Scanner;

public class RunCirculo {

	/*
	 * criar uma classe que tenha o metodo de calcular area e perimetro; outra
	 * classe para obter os dados;
	 */
	
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int menu;
		
		Circulo circulo1 = new Circulo(0);
		
		do {
			System.out.println("Escolha uma opção. "
					+ "1.Criar circulo;"
					+ " 2.Calcular area;"
					+ " 3.Calcular perimetro;"
					+ " 0.Sair.");
			menu = read.nextInt();
			
			if(menu==1) {
				System.out.println("Qual o valor do raio? ");
				circulo1.setRaio(read.nextDouble());
			}
			else if(menu==2) {circulo1.calcularArea();;}
			else if(menu==3) {circulo1.calcularPerimetro();}

		} while (menu!=0);
	}

}
