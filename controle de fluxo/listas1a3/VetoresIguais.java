package listas1a3;

import java.util.ArrayList;
import java.util.Scanner;

public class VetoresIguais {
	/*
	 * Ler dois vetores de 05 elementos cada. Após, verificar se os vetores são
	 * iguais e mostrar na tela.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<String>(5);
		ArrayList<String> names = new ArrayList<String>(5);
		
		System.out.println("Digite 5 nomes para uma lista.");
		
		for(int i=0; i<5; i++) {
			System.out.println("Digite o nome aqui.");
			String nome = sc.next();
			nomes.add(nome);
		}
		
		System.out.println("Digite 5 nomes para outra lista.");
		
		for (int j=0; j<5; j++) {
			System.out.println("Digite aqui. ");
			String name = sc.next();
			names.add(name);
		}
		
		System.out.println(nomes);
		System.out.println(names);
		
		System.out.print("Os vetores são iguais? ");
		System.out.println(nomes.equals(names));
		

	}

}
