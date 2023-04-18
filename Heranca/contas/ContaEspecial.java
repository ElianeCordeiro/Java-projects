package contas;

public class ContaEspecial extends ContaBancaria{
	
	private double limite;

	public ContaEspecial(String cliente, int numero_conta, double saldo, double limite) {
		super(cliente, numero_conta, saldo);
		this.limite = limite;
	}

	@Override
	public double sacar(double saque) {
		if(this.getSaldo() - saque >= 0 - limite) {
			this.setSaldo(this.getSaldo() - saque);
		}
		return super.sacar(saque);
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}

