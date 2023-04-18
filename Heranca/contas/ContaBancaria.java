package contas;

public class ContaBancaria {

		private String cliente;
		private int numero_conta;
		private double saldo;
		
		public ContaBancaria(String cliente, int numero_conta, double saldo) {
			super();
			this.cliente = cliente;
			this.numero_conta = numero_conta;
			this.saldo = saldo;
		}
		
		public double sacar(double saque) {
			if((this.saldo - saque) > 0 ) {
				this.saldo -= saque;
			} return this.saldo;
		}
		
		public double depositar(double deposito) {
			this.saldo+=deposito;
			return this.saldo;
		}
		
		
		public String getCliente() {
			return cliente;
		}
		public void setCliente(String cliente) {
			this.cliente = cliente;
		}
		public int getNumero_conta() {
			return numero_conta;
		}
		public void setNumero_conta(int numero_conta) {
			this.numero_conta = numero_conta;
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		
		
}
