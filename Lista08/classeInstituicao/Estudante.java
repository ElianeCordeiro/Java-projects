package classeInstituicao;

public class Estudante {
	
	private int matricula;
	private String nome;
	private double[] notas;
	
	public Estudante(int matricula, String nome, double[] notas) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}
	
	public double calcularMedia() {
		double soma =0;
		for (double nota : notas) {
			soma+= nota;
		}
		double media = soma/notas.length;
		return media;
	}
	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
}
