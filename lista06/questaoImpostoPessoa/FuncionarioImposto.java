package questaoImpostoPessoa;

public class FuncionarioImposto {
	private String nome;
	private double salario;
	private double imposto;

	public FuncionarioImposto(String nome, double salario) {
	super();
	this.nome = nome;
	this.salario = salario;
	}


	public double calcularImposto(String funcionario) {
	if(this.getSalario() <=2000) {
	this.setImposto(0.0);
	} else if( this.getSalario() <= 3500) {
	this.setImposto(this.getSalario() * 15 / 100);
	} else if (this.getSalario() <= 5000) {
	this.setImposto(this.getSalario() * 22 / 100);
	} else {this.setImposto(this.getSalario() * 30 / 100);
	}
	return imposto;

	}


	public String getNome() {
	return nome;
	}

	public void setNome(String nome) {
	this.nome = nome;
	}

	public double getSalario() {
	return salario;
	}

	public void setSalario(double salario) {
	this.salario = salario;
	}

	public double getImposto() {
	return imposto;
	}

	public void setImposto(double imposto) {
	this.imposto = imposto;
	}
}
