package listas1a3;

import java.util.Iterator;
import java.util.Scanner;

public class PessoasImc {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Quantas pessoas deseja calcular o IMC? ");
		int quant = read.nextInt();
		read.nextLine();
		String[] pessoas = new String[quant];
		double[] pesos = new double[quant];
		double[] alturas = new double[quant];
		
		for(int i=0; i<quant; i++) {
			System.out.println("Qual o nome da pessoa? ");
			pessoas[i] = read.nextLine();
			System.out.println("Qual o peso de "+ pessoas[i] +"?");
			pesos[i] = read.nextDouble();
			System.out.println("E a altura?");
			alturas[i] = read.nextDouble();
			read.nextLine();
		}
		
		System.out.print("As pessoas acima do peso são ");
		System.out.println(pessoasAcimaPeso(pessoas, pesos, alturas));
		
	}
	
	
	public static String pessoasAcimaPeso(String[] pessoas, double[] pesos,double[] alturas ) {
		
		String acima = "";
		for (int i = 0; i < pessoas.length; i++) {
			double imc = pesos[i] / (alturas[i] * alturas[i]);
			if (imc > 25) {
				acima = acima + pessoas[i]+" ";
			}
		}
		return acima;
	}
	

}
