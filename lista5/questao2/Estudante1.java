package questao2;

import java.util.ArrayList;

public class Estudante1 {
	
	private String nome;
	private long matricula;
	private String endereco;
	private ArrayList<Double> notas = new ArrayList<>(4);
	
	
	
	/// constructor
	
	public Estudante1(String nome, long matricula, String endereco, ArrayList<Double> notas) {

		this.setNome(nome);
		this.setMatricula(matricula);
		this.setEndereco(endereco);
		this.setNotas(notas);
	}
	
	
	public long obterMatricula() {
		return this.getMatricula();
	}
	

	public String obterEndereco() {
		return this.getEndereco();
	}
	
	
	public double calcularMedia() {
		double soma = 0;
		for(double nota: notas) {
			soma+=nota;
		}
		double media = soma/notas.size();
		
		return media;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String newNome) {
		this.nome = newNome;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long newMatricula) {
		this.matricula = newMatricula;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String newEndereco) {
		this.endereco = newEndereco;
	}

	public ArrayList<Double> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Double> newNotas) {
		this.notas = newNotas;
	}

	
	
	
}
