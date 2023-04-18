package questaoImpostoPessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class RunFuncionarioImposto {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		ArrayList<FuncionarioImposto> funcionarios = new ArrayList<>();

		int menu = 1;

		do {
			System.out.println("Qual açao deseja realizar? " + " 1. Cadastrar funcionario;" + " 2. Calcular imposto;"
					+ " 0. Sair.");
			menu = read.nextInt();

			FuncionarioImposto funcionario = new FuncionarioImposto(null, menu);
			if (menu == 1) {
				read.nextLine();
				System.out.println("Qual o nome do funcionario? ");
				funcionario.setNome(read.nextLine());
				System.out.println("Qual o salario de " + funcionario.getNome());
				funcionario.setSalario(read.nextDouble());
				funcionarios.add(funcionario);

			} else if (menu == 2) {
				read.nextLine();
				System.out.println("Qual o nome do funcionario que deseja calcular o imposto ?");
				String nome = read.nextLine();
				for (FuncionarioImposto f : funcionarios) {
					if (f.getNome().equals(nome)) {
						System.out.print("O imposto é ");
						System.out.println(f.calcularImposto(f.getNome()));
					}
				}

			}

		} while (menu != 0);

		System.out.println("----------------PROGRAMA ENCERRADO-----------------");
	}

}
