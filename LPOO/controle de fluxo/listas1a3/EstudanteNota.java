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

		for (int i = 0; i < 10; i++) {
			System.out.println("Qual o nome do estudante? ");
			String nome = read.nextLine();
			estudantes.add(nome);

			System.out.println("Qual a primeira e a segunda nota do estudante? ");
			Double nota = read.nextDouble();
			notas.add(nota);
			nota = read.nextDouble();
			read.nextLine();
			notas.add(nota);
		}

		calcularMedia(estudantes, notas);

	}

	public static void calcularMedia(ArrayList<String> nomes, ArrayList<Double> notas) {

		ArrayList<Double> medias = new ArrayList<>();

		int j = 0;
		while (j < nomes.size() - 1) {
			for (int i = 0; i < notas.size() - 1; i+=2) {
				double media = (notas.get(i) + notas.get(i + 1)) / 2;
				medias.add(media);
				j++;
			}
		}
		
		System.out.println("ESTUDANTES REPROVADOS: ");
		System.out.println("----------------------");
		for (Double media : medias) {
			if (media < 7) {
				int aluno = medias.indexOf(media);
				System.out.println(nomes.get(aluno) + " ");
			}
		}
	}

}
