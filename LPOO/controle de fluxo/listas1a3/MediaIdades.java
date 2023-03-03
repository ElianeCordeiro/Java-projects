package listas1a3;

import java.util.Scanner;

public class MediaIdades {
	/*
	 * Calcular média das idades informadas pelo usuário até que seja digitado 0.
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a idade em anos.");
		int idade = entrada.nextInt();
		double somaIdades = 0;
		int i = 0;

		while (idade != 0) {
			somaIdades = idade + somaIdades;
			idade = entrada.nextInt();
			i++;
		}

		double media = somaIdades / i;
		System.out.println("A média das idades informadas é " + media);

	}

}
