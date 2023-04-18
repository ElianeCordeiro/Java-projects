package listas1a3;

import java.util.ArrayList;
import java.util.Scanner;

public class EstudanteNota {
	
	/*
	 * Obter o nome e a nota de 10 estudantes, criar um metodo para calcular a media
	 * de cada um e retornar os alunos reprovados.
	 */
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		ArrayList<String> estudantes = new ArrayList<>();
		ArrayList<Double> notas = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			System.out.println("Qual o nome do estudante? ");
			estudantes.add(read.nextLine());

			System.out.println("Qual a primeira nota do estudante? ");
			notas.add(read.nextDouble());
			System.out.println("E a segunda? ");
			read.nextLine();
			notas.add(read.nextDouble());
			read.nextLine();
		}
		System.out.println("ESTUDANTES REPROVADOS: ");
		System.out.println("----------------------");
		System.out.println(calcularMedia(estudantes, notas));
		

	}

	public static ArrayList<String> calcularMedia(ArrayList<String> nomes, ArrayList<Double> notas) {

		ArrayList<String> reprovados = new ArrayList<>();

		int j = 0;
		while (j < nomes.size() - 1) {
			for (int i = 0; i < notas.size() - 1; i+=2) {
				double media = (notas.get(i) + notas.get(i + 1)) / 2;
				if(media < 6) {
					reprovados.add(nomes.get(j));
				}
				j++;
			}
		}
		return reprovados;
		
		
	}

}
