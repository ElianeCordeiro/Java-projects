package listas1a3;

import java.util.Scanner;

public class OperacaoMatematica {
	
	/*
	 * Escrever um programa que leia dois números e a operação operação aritmética
	 * desejada.
	 * A operação informada deve ser atráves dos símbolos.
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número.");
		double numero1 = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Informe outro número");
		double numero2 = entrada.nextDouble();
		entrada.nextLine();
		System.out.println(
				"Digite com símbolos matemáticos uma das quatro operações que deseja realizar com os números.");
		String operar = entrada.nextLine();

		double operacao = 0;

		if (operar.equals("-")) {
			operacao = numero1 - numero2;
		} else if (operar.equals("+")) {
			operacao = numero1 + numero2;
		} else if (operar.equals("/")) {
			operacao = numero1 / numero2;
		} else if (operar.equals("*")) {
			operacao = numero1 * numero2;
		}

		System.out.println(numero1 + operar + numero2 + " é igual a " + operacao);
	}
}
