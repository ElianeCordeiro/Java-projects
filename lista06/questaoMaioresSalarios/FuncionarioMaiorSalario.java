package questaoMaioresSalarios;

import java.util.ArrayList;

public class FuncionarioMaiorSalario {
	
	private ArrayList<String> funcionarios = new ArrayList<>();
	private ArrayList<Double> salarios = new ArrayList<>();
	private ArrayList<String> altaRenda = new ArrayList<>();
	
	public FuncionarioMaiorSalario( ArrayList<String> funcionarios,
			ArrayList<Double> salarios) {
		super();
		this.funcionarios = funcionarios;
		this.salarios = salarios;
	}
	
	
	public ArrayList<String> retornarAltaRenda(ArrayList<String> funcionarios) {
		for (double salario: salarios) {
			if(salario>5000) {
				int renda = salarios.indexOf(salario);
				altaRenda.add(funcionarios.get(renda));
			}
		}
		return altaRenda;
	}


	public ArrayList<String> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<String> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public ArrayList<Double> getSalarios() {
		return salarios;
	}

	public void setSalarios(ArrayList<Double> salarios) {
		this.salarios = salarios;
	}
	
	
	
}
