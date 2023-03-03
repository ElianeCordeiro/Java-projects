package listas1a3;

import java.util.ArrayList;
import java.util.Scanner;

public class PessoasImc {

	/*
	 * Criar um metodo que calcule o IMC de n pessoas, retorne quem está acima do
	 * peso, e a quantidade de pessoas no peso ideal, acima do peso e abaixo do
	 * peso.
	 */
	
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		ArrayList<Double> imcs = new ArrayList<>();
		int numero;

		Scanner read = new Scanner(System.in);
		System.out.println("Informe a quantidade de IMCs que serão calculados. ");
		numero = read.nextInt();

		calcularImc(nomes, imcs, numero);
	}

	public static void calcularImc(ArrayList<String> nomes, ArrayList<Double> imcs, int numero) {

		Scanner read = new Scanner(System.in);

		for (int i = 0; i < numero; i++) {
			double imc = 0;

			System.out.println("Informe o nome da pessoa. ");
			String nome = read.nextLine();
			nomes.add(nome);

			System.out.println("Informe o peso em kg de " + nome);
			double peso = read.nextDouble();

			System.out.println("Informe a altura em m de " + nome);
			double altura = read.nextDouble();
			read.nextLine();
			imc = peso / (altura * altura);
			imcs.add(imc);
		}

		int j = 0;
		int acima = 0;
		System.out.println("Os dados obtidos foram: ");
		System.out.println("--------------------------------------------");
		System.out.println("As pessoas acima do peso são: ");
		for (double imc : imcs) {
			if (imc >= 25) {
				System.out.print(nomes.get(j) + " ");
				acima++;
			}
			j++;
		}
		
		int abaixo = 0;
		int ideal =0;
		
		for (Double imc : imcs) {
			if(imc <18.5) {
				abaixo++;
			} else if(imc>18.5 & imc <25) {
				ideal++;
			}
		}
		System.out.println("\nABAIXO DO PESO: "+ abaixo);
		System.out.println("PESO IDEAL: "+ ideal);
		System.out.println("ACIMA DO PESO: "+ acima);
		
	}

}
