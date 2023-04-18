package listas1a3;

import java.util.ArrayList;
import java.util.Scanner;

public class FuncionarioImposto {

	/*
	 * Obter o nome e o salario de n funcionarios, e calcular o imposto sobre o
	 * salario do funcionario escolhido pelo usuario.
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

				System.out.println("Informe o salario de " + nome);
				Double renda = read.nextDouble();
				salarios.add(renda);
			} else if (menu == 2) {
				System.out.println("Deseja calcular o imposto de qual funcionario? ");
				String funcionario = read.nextLine();
				for (String f : nomes) {
					if (f.equals(funcionario)) {
						int index = nomes.indexOf(f);
						double salario = salarios.get(index);
						System.out.print("O imposto é ");
						System.out.println(calcularImposto(salario));
					}
				}

			} else {
				System.out.println("Programa encerrado...");
			}
		} while (menu != 0);

	}

	public static double calcularImposto(double salario) {
		double imposto = 0;

		if (salario <= 2000) {
			imposto = 0.0;
		} else if (salario >= 2000.01 & salario <= 3500) {
			imposto = salario * 15 / 100;
		} else if (salario >= 3500 & salario <= 5000) {
			imposto = salario * 20 / 100;
		} else {
			imposto = salario * 30 / 100;
		}

		return imposto;

	}
}