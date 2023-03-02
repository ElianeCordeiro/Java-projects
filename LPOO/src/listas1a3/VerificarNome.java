package listas1a3;

import java.util.ArrayList;
import java.util.Scanner;

public class VerificarNome {
	
	/*
	 * Programa que lê o nome de n pessoas, após perguntar ao usuário qual nome ele
	 * deseja verificar e infomrar se consta na lista. O numero n de nomes deve ser
	 * informado pelo usuario.
	 */
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<String>();
		
		System.out.println("Digite o número de nomes que deseja inserir. ");
		int quant = read.nextInt();
		
		for(int i=0; i<quant;i++) {
			System.out.println("Informe o nome. ");
			String nome = read.next();
			lista.add(nome);
		}
		
		System.out.println("Qual nome deseja consultar? ");
		String ler = read.next();
		
	if(lista.contains(ler)==true) {
			System.out.println(ler+" está contido na lista.");
		} else if(lista.contains(ler)==false){
			System.out.println(ler+" não está contido na lista. ");
		}
		
	}

}
