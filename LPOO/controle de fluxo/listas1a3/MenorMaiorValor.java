package listas1a3;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.math.*;
import java.util.Scanner;

public class MenorMaiorValor {
	/*
	 * Ler 10 números e mostrar: 
	 * 	1. menor valor digitado; 
	 * 	2. maior valor digitado;
	 * 	3. media dos valores digitados;
	 */
	
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		ArrayList<Double> numbers = new ArrayList<>(10);
		double soma = 0;
		
		System.out.println("Escreva 10 numeros a seguir. ");
		for (int i=0; i<10; i++) {
			double number = read.nextDouble();
			numbers.add(number);
			soma += number;
		}
		
		System.out.println("A soma dos números é "+soma);
		double menor = 0;
				
		if(numbers.contains(menor)) {
			for(double num: numbers) {
				if(num<menor) {menor = num;}
			}System.out.println("O menor número da lista é "+menor);
		}
		else if(numbers.contains(menor)== false) {
			menor=numbers.get(0);
			for(double num: numbers) {
				if(menor>num) {menor =num;}
			}System.out.println("O menor número da lista é "+menor);
		}
				
		double maior =0;
				
		if(numbers.contains(maior)==true) {
			for(double num: numbers) {
				if(num>maior) {maior=num;}
			}System.out.println("O maior número da lista é "+maior);
		}
		else if(numbers.contains(maior)== false) {
			maior = numbers.get(0);
			for(double num: numbers) {
				if(maior<num) {maior = num;}
			}System.out.println("O maior número da lista é "+maior);
		}

				
		double media = soma / numbers.size();
		System.out.println("A média dos números da lista é "+media);
		
		
	
	}

}
