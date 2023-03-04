package listas1a3;

import java.util.ArrayList;
import java.util.Scanner;

public class PessoasIdades {
	
	/*
	 * Obter a idade e o nome de 10 pessoas, retornar através de um metodo a pessoa
	 * mais velha e a mais nova e a quantidade de pessoas acima dos 18 anos.
	 */

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		ArrayList<String> pessoas = new ArrayList<>(10);
		ArrayList<Integer> idades = new ArrayList<>(10);
		
		System.out.println("Informe a seguir o nome de cada pessoa e sua respectiva idade. ");

		for (int i = 0; i < 10; i++) {
			System.out.println("Nome: ");
			String nome = read.nextLine();
			pessoas.add(nome);
			
			System.out.println("Idade: ");
			int idade = read.nextInt();
			read.nextLine();
			idades.add(idade);
		}
		retornarDados(pessoas, idades);
		
	}

	
	public static void retornarDados(ArrayList<String> pessoas, ArrayList<Integer> idades) {
		
		int maisVelho = 0;
		int maisNovo = 0;
		int quantMais18 = 0;
		for (int idade : idades) {
			if(idade > maisVelho) {
				maisVelho = idade;
			} 
			if (idade>=18) {quantMais18++;}
		}
		maisNovo = maisVelho;
		for (int idade : idades) {
			if(maisNovo > idade) {maisNovo=idade;}
		}
		
		int i = idades.indexOf(maisVelho);
		int j = idades.indexOf(maisNovo);
		
		System.out.println("Dados obtidos: ");
		System.out.println("----------------");
		System.out.println("Pessoa mais velha: "+ pessoas.get(i) );
		System.out.println("Pessoa mais nova: "+ pessoas.get(j));
		System.out.println("Quantidade maior 18: "+ quantMais18);
	}
	
}
