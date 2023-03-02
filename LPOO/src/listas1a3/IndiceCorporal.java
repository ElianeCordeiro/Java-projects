package listas1a3;

import java.util.ArrayList;
import java.util.Scanner;

public class IndiceCorporal {
	/*
	 * Ler o peso e altura de 5 pessoas, calcular o IMC de cada um armazenando em um
	 * vetor, e após informa a situação de cada IMC em realação ao peso ideal.
	 */
	public static void main(String[] args) {

		ArrayList<Float> listIMC = new ArrayList<Float>();
		Scanner entrada =  new Scanner(System.in);
		
		System.out.println("Informe a seguir o peso e a altura "
				+ "de 5 pessoas.");
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o peso em kg. ");
			float peso = entrada.nextFloat();

			System.out.println("Informe a altura em metros. ");
			float altura = entrada.nextFloat();

			float imc = peso / (altura * altura);

			listIMC.add(imc);
		}

		ArrayList<Float> abaixoIMC = new ArrayList<Float>();
		ArrayList<Float> idealIMC = new ArrayList<Float>();
		ArrayList<Float> acimaIMC = new ArrayList<Float>();

		int abaixo = 0;
		int ideal = 0;
		int acima = 0;

		for (float result : listIMC) {
			if (result < 18.5) {
				abaixoIMC.add(result);
				abaixo++;
			} else if (result > 18.5 && result < 25) {
				idealIMC.add(result);
				ideal++;
			} else {
				acimaIMC.add(result);
				acima++;
			}
		}

		System.out.println("------------------------");
		System.out.println("Os IMCs se encontram nas seguintes situações:");
		System.out.println("Abaixo do peso " +abaixo + " pessoas com os IMC: " + abaixoIMC);
		System.out.println("No peso ideal "+ideal + " pessoas com os IMCs: " + idealIMC);
		System.out.println("Acima do peso "+acima + " pessoas com os IMCs: " + acimaIMC);
	}

}
