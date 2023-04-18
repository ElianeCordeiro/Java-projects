package questaoMaioresSalarios;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMaiorSalario {
	
	/*
	 * Criar uma classe com um metodo que retorne os funcionarios com salarios acima
	 * de 5000,00 e outra que obtenha os dados.
	 */
	
	
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int menu = 1;
		ArrayList<String> funcionarios = new ArrayList<>();
		ArrayList<Double> salarios = new ArrayList<>();
		
		FuncionarioMaiorSalario funcionario1 = new FuncionarioMaiorSalario(funcionarios, salarios);
		
		do {
			System.out.println("O que deseja realizar? "
					+ "1.Cadastrar funcionario;"
					+ " 2.Exibir funcionarios de maior renda;"
					+ " 0.Sair.");
			menu = read.nextInt();
			
			if(menu==1) {
				read.nextLine();
				System.out.println("Qual o nome do funcionario? ");
				String nome = read.nextLine();
				System.out.println("Qual o salario de "+ nome);
				double salario = read.nextDouble();
				funcionarios.add(nome);
				salarios.add(salario);
				funcionario1.setFuncionarios(funcionarios);
				funcionario1.setSalarios(salarios);
			}
			else if(menu==2) {
				System.out.println(funcionario1.retornarAltaRenda(funcionarios));
			} else {System.out.println("-------Programa encerrado--------");}
			
			
		} while (menu!=0);
		
		
		
	}
}
