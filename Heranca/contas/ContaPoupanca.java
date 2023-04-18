package contas;

public class ContaPoupanca extends ContaBancaria {
	
	private int dia_rendimento;
	
	public ContaPoupanca(String cliente, int numero_conta, double saldo, int dia_rendimento) {
		super(cliente, numero_conta, saldo);
		this.dia_rendimento = dia_rendimento;
	}
	
	public double calcularNovoSaldo(double rendimento) {
		this.setSaldo(this.getSaldo() + (this.getSaldo() * rendimento / 100));
		return this.getSaldo();
	}

	public int getDia_rendimento() {
		return dia_rendimento;
	}

	public void setDia_rendimento(int dia_rendimento) {
		this.dia_rendimento = dia_rendimento;
	}
	
	
}
