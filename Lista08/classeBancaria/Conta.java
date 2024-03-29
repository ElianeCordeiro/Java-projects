package classeBancaria;

public class Conta {
	
	private int numeroConta;
	private Banco banco;
	private Cliente cliente;
	private double saldo;
	
	public Conta(int numeroConta, Banco banco, Cliente cliente, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.banco = banco;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public double sacar(double saque) {
		saldo = this.saldo - saque;
		return saldo;
	}

	public double depositar(double deposito) {
		saldo = this.saldo + deposito;
		return saldo;
	}
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
