package questaoEscola;

import java.util.ArrayList;

public class Estudantes {

		private String nome;
		private ArrayList<Double> notas = new ArrayList<>(2);
		private double matricula;

		public Estudantes(String nome, ArrayList<Double> notas, double matricula) {
			super();
			this.nome = nome;
			this.notas = notas;
			this.matricula = matricula;
		}
		
		public double calcularMedia(ArrayList<Double> notas) {
			double soma=0;
			for(double nota: notas) {
				soma += nota;
			}
			double media = soma/notas.size();
			return media;
		}
		
		public String obterNome(double matricula) {
			return getNome();
		}


		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public ArrayList<Double> getNotas() {
			return notas;
		}

		public void setNotas(ArrayList<Double> notas) {
			this.notas = notas;
		}

		public double getMatricula() {
			return matricula;
		}

		public void setMatricula(double matricula) {
			this.matricula = matricula;
		}
		
		
}
