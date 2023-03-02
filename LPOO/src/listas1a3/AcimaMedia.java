package listas1a3;

import java.util.ArrayList;
import java.util.Scanner;

public class AcimaMedia {
	
	/*
	 * Obter a media da nota de 10 alunos, calcular a média e informar quantos
	 * alunos ficaram acima da média.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> vetor = new ArrayList<Double>();
		double soma = 0;
		
		System.out.println("Informe a nota de 10 alunos. ");
		
		for(int i=0; i<10;i++) {
			System.out.println("Digite a nota aqui. ");
			double nota = sc.nextDouble(); 
			soma = nota + soma;
			vetor.add(nota);	
		}
		
		double media = soma/ vetor.size();
		
		int count = 0;
		
		for (Double nota : vetor) {
			if(nota>=media) {
				count++;
			}
		}
		
		System.out.println("A média das 10 notas informadas é : "+ media);
		System.out.println("A quantidade de notas acima da média é: "+ count);
		
	
	}

}
