package questao2;

import java.util.Scanner;

public class RunEstudante {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int menu;
		
		Estudante estudante1 = new Estudante();
		
		do {
			System.out.println("-------------------\nEscolha uma ação:"
					+ "1. Criar estudante"
					+ "2. Calcular media"
					+ "3. Obter número de matrícula"
					+ "4. Obter endereço"
					+ "0. Sair");
			 menu = read.nextInt();
			 
			 if(menu==1) {
				 estudante1.criarEstudante();
			 } else if(menu==2) {
				 estudante1.calcularMedia();
			 } else if(menu==3) {
				 estudante1.obterMatricula();
			 } else if(menu==4) {
				 estudante1.obterEndereco();
			 }
	 
		} while (menu!=0);
		System.out.println("--------------------\nPrograma encerrado...");
	}

}
