package questao2;

import java.util.ArrayList;
import java.util.Scanner;

public class Estudante {
	
	String nome;
	long matricula;
	String endereco;
	ArrayList<Double> notas = new ArrayList<>(4);
	
	Scanner read = new Scanner(System.in);
	
	public Estudante() {
		super();
	}

	void criarEstudante() {
		System.out.println("Digite nome. ");
		this.nome = read.nextLine();;
		
		System.out.println("Matricula: ");
		this.matricula = read.nextLong();
		read.nextLine();
		System.out.println("Endereço: ");
		this.endereco = read.nextLine();
		
		System.out.println("Notas: ");
		for (int i = 0; i < 4; i++) {
			double nota = read.nextDouble();
			notas.add(nota);
		}
		this.notas = notas;
	}
	
	void obterMatricula() {
		System.out.println("Matricula: "+this.matricula);
	}
	
	void obterEndereco() {
		System.out.println("Endereco: "+this.endereco);
	}
	
	void calcularMedia() {
		double soma = 0;
		for(double nota: notas) {
			soma+=nota;
		}
		double media = soma/notas.size();
		System.out.println("A média é: " + media);
		if (media>=7) {System.out.println("Aluno aprovado. ");}
	}
	
}
