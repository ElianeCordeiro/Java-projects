package questao2;

import java.util.ArrayList;
import java.util.Scanner;

public class RunEstudante {
		
	/*
	 * Criar uma classe que tenha metodos para calcular a media do estudante a
	 * partir de 4 notas, obter o endereço e a matricula; e outra classe para
	 * solicitar ao usuario esses dados.
	 */
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int menu=1;
		ArrayList<Double> notas = new ArrayList<>(4);
		
		Estudante1 estudante1 = new Estudante1(null, menu, null, notas); 
		
		do {
			System.out.println("-------------------\nEscolha uma ação:"
					+ "1. Criar estudante"
					+ "2. Calcular media"
					+ "3. Obter número de matrícula"
					+ "4. Obter endereço"
					+ "0. Sair");
			 menu = read.nextInt();
			 
			 if(menu==1) {
				 read.nextLine();
				 System.out.println("Informe o nome do estudante. ");
				 estudante1.setNome(read.nextLine());
				 read.nextLine();
				 System.out.println("Qual a matricula do aluno ?" + estudante1.getNome());
				 estudante1.setMatricula(read.nextLong());
				 read.nextLine();
				 System.out.println("Qual o endereco? ");
				 estudante1.setEndereco(read.nextLine());
				 System.out.println("Informe as 4 notas");
				 for (int i = 0; i < 4; i++) {
					double nota = read.nextDouble();
					notas.add(nota);
				estudante1.setNotas(notas);
				}
			 } else if(menu==2) {
				 System.out.println("A média é "+ estudante1.calcularMedia()); 
				 if(estudante1.calcularMedia()>=7) {System.out.println(estudante1.getNome() + " aprovado");}
			 } else if(menu==3) {
				 System.out.println("A matricula é "+ estudante1.obterMatricula());
			 } else if(menu==4) {
				 System.out.println("O endereço é " + estudante1.obterEndereco());
			 }
	 
		} while (menu!=0);
		System.out.println("--------------------\nPrograma encerrado...");
	}

}
