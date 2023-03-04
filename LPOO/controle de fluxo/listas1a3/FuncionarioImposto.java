package listas1a3;

import java.util.ArrayList;
import java.util.Scanner;

public class FuncionarioImposto {
		
	/*
	 * Obter o nome e o salario de n funcionarios, e calcular o imposto sobre o
	 * salario do funcionario escolhido pelo usuario
	 */
	
	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<>();
		ArrayList<Double> salarios = new ArrayList<>();

		Scanner read = new Scanner(System.in);

		int menu = 1;
		do {
			System.out.println("Escolha uma das seguintes opções:" + "1. Cadastrar funcionário (nome e salário)"
					+ "2. Calcular imposto(procurar funcionário pelo nome) " + "0. Sair.");
			menu = read.nextInt();
			read.nextLine();
			if (menu == 1) {
				System.out.println("Informe o nome do funcionario. ");
				String nome = read.nextLine();
				nomes.add(nome);
				
				System.out.println("Informe o salario de "+nome);
				Double salario = read.nextDouble();
				salarios.add(salario);
			} else if (menu == 2) {
				calcularImposto(nomes, salarios);
			} else {
				System.out.println("Programa encerrado...");
			}
		} while (menu != 0);

		
	
	}	

	public static void calcularImposto(ArrayList<String> nomes, ArrayList<Double> salarios) {
		Scanner read = new Scanner(System.in);
		System.out.println("Deseja calcular o imposto de qual funcionario? ");
		String funcionario = read.nextLine();
		
		int i = nomes.indexOf(funcionario);
		double salarioFuncionario = salarios.get(i);
		double imposto = 0;
		
		if(salarioFuncionario<=2000) {
			System.out.println(funcionario + " é isento de imposto. ");
		} else if(salarioFuncionario >=2000.01 & salarioFuncionario >= 3500) {
			imposto = salarioFuncionario * 15/100;
			System.out.println(funcionario + " deve pagar " + imposto +" reais de imposto.");
		} else if(salarioFuncionario>=3500 & salarioFuncionario<=5000) {
			imposto = salarioFuncionario * 20/100;
			System.out.println(funcionario + " deve pagar "+imposto +" reais de imposto.");
		} else {
			imposto = salarioFuncionario * 30/100;
			System.out.println(funcionario + " deve pagar "+imposto +" reais de imposto. ");
		}
		
		
		
		
		
	}
}