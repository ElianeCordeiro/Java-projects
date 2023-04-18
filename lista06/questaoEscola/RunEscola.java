package questaoEscola;

import java.util.ArrayList;
import java.util.Scanner;

public class RunEscola {
	
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		ArrayList<Double> notas = new ArrayList<>(2);
		int menu =1;
		
		Estudantes novoEstudante = new Estudantes(null, notas, menu);
		
		do {
			System.out.println("Informe qual ação deseja realizar. "
					+ "1.Cadastrar estudante; "
					+ "2.Obter o nome do estudante(procurar pela matricula); "
					+ "3.Calcular a média(informar se o estudante foi aprovado ou não; "
					+ "0.Sair.  ");
			menu = read.nextInt();
			
			if(menu==1) {
				read.nextLine();
				System.out.println("Qual o nome do estudante? ");
				novoEstudante.setNome(read.nextLine());
				System.out.println("Qual a matricula? ");
				novoEstudante.setMatricula(read.nextDouble());
				System.out.println("Informe as duas notas. ");
				for(int i=0; i<2;i++){
					double nota = read.nextDouble();
					notas.add(nota);}
				novoEstudante.setNotas(notas);
			} else if(menu==2) {
				System.out.println("Informe a matricula. ");
				novoEstudante.setMatricula(read.nextDouble());
				System.out.println(novoEstudante.obterNome(novoEstudante.getMatricula()));
			} else if(menu==3) {
				System.out.println(novoEstudante.calcularMedia(notas));
				if(novoEstudante.calcularMedia(notas) > 7) {
					System.out.println(novoEstudante.getNome() + " Aprovado");
				}else {System.out.println(novoEstudante.getNome() + "Reprovado");}
			}else {System.out.println("-------PROGRAMA ENCERRADO-------");}
			
			
			
			
		} while (menu!=0);
		
		
	}

}
